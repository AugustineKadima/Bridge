package strings;

import java.util.ArrayList;
import java.util.Arrays;

public class AnagramSubstringTwo {
    public static ArrayList<Integer> isAnagram(String s1, String s2){
        ArrayList<Integer> baseCase = new ArrayList<>();
        ArrayList<Integer> output = new ArrayList<>();
        baseCase.add(-1);
        baseCase.add(-1);

        if(s1.length() == 0 || s2.length() > s1.length()) return baseCase;

        int[] s2Freq = new int[26];
        int[] s1freq = new int[26];
        char[] s2Chars = s2.toCharArray();
        char[] s1Chars = s1.toCharArray();
        int k = s2Chars.length;

        for(int i = 0; i < k; i++){
            s2Freq[s2Chars[i] - 'a']++;
        }

        for(int i = 0; i < k; i++){
            s1freq[s1Chars[i] - 'a']++;
        }

        for(int i = k; i < s1.length(); i++){
            if(Arrays.equals(s1freq, s2Freq)){
                output.add(i - k);
            }
            s1freq[s1Chars[i] - 'a']++;
            s1freq[s1Chars[i - k] - 'a']--;
        }

        if(Arrays.equals(s1freq, s2Freq)){
            output.add(s1.length() - k);
        }

        return output;
    }
    public static void main(String[] args) {
        ArrayList<Integer> results = AnagramSubstringTwo.isAnagram("babab","ab");
        System.out.println(results);
    }
}

//Find all anagram substrings. return first index of each in an array
//input =("babab","ab")  output = [0,1,2,3]
//input =("cbababc","abc")  output = [0,4]

//Pseudocode
//--------------
//store the frequency of reference string in an array
//Use sliding window approach
//loop through the long string to the length of the reference string and confirm that this window matches the reference
//if the window matches, add the index of the start of the window to an output array
//increment frequency of characters in the long string from the end of the window as you decrement those already visited
//return output