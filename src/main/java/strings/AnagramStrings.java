package strings;

import java.util.HashMap;
import java.util.Map;

public class AnagramStrings {
    public static boolean isAnagram(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        Map<Character, Integer> s1CharFreqMap = new HashMap<>();
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        for(int i = 0; i < s1Chars.length; i++){
            if(!s1CharFreqMap.containsKey(s1Chars[i])){
                s1CharFreqMap.put(s1Chars[i], 1);
            }else{
                s1CharFreqMap.replace(s1Chars[i], s1CharFreqMap.get(s1Chars[i]) + 1);
            }
        }

        for(int i = 0; i < s2Chars.length; i++){
            if(s1CharFreqMap.containsKey(s2Chars[i])){
                s1CharFreqMap.remove(s2Chars[i]);
            }
        }

        return s1CharFreqMap.isEmpty();
    }
    public static void main(String[] args) {
        boolean result = AnagramStrings.isAnagram("abcg", "bjca");
        System.out.println(result);
    }
}
//Pseudocode
//edge conditions:  s1.length != s2.length
//create char arrays for each string
//loop through first array and add frequency of chars to map
//loop through second array and reduce frequency of chars present in frequency map
//check if the map is empty

//time complexity = O(n)
//space complexity = O(n)