package strings;

import java.util.HashSet;

public class LongestSubstring {
    public static int longestSubstringLength(String s){
        if(s.length() == 0) return -1;
        char[] sChars = s.toCharArray();
        int count = 0;
        int longestLength = 0;
        HashSet<Character> hash = new HashSet<>();
        for(int i = 0; i < sChars.length; i++){
            if(!hash.contains(sChars[i])){
                hash.add(sChars[i]);
                count++;
                longestLength = Math.max(longestLength,count);
            }else{
                hash.remove(sChars[i]);
                count = 0;
            }
        }
        return longestLength;
    }
    public static void main(String[] args) {
        int results = LongestSubstring.longestSubstringLength("abcabcbb");
        System.out.println(results);
    }
}

//Find the size of the longest substring without repeating characters
//input = "abcabcbb" output = 3
//input = "bbbbbb" output = 1
//input = "pwwkew" output = 3

//Pseudocode
//-----------------
//Loop through the string and add unique char to hashset
//and increase count
//find compare the count with the max value and store the max value
//remove when a repeating character is encountered, remove the initial character in the set
//Re initialize count
//return max
