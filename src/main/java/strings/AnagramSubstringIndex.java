package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AnagramSubstringIndex {
    public static ArrayList<Integer> anagramCount(String s1, String s2){
        if(s1.length() == 0) return new ArrayList<>();
        char[] s1Chars = s1.toCharArray();
        char[] s2Chars = s2.toCharArray();
        Map<Character, Integer> charFreqMap = new HashMap<>();
        ArrayList<Integer> output = new ArrayList<>();

        for(int i = 0; i < s2Chars.length; i++){
            if(!charFreqMap.containsKey(s2Chars[i])){
                charFreqMap.put(s2Chars[i], 1);
            }else{
                charFreqMap.replace(s2Chars[i], charFreqMap.get(s2Chars[i]) + 1);
            }
        }

        int start = 0;
        int end = 0;
        int count = s2.length();
        while(end < s1Chars.length){
            if(charFreqMap.containsKey(s1Chars[end])){
                end++;
                count--;
            }
            if(count == 0){
                output.add(start);
            }

            for(int i = start; i <= end; i++){

            }



        }

        return output;
    }
    public static void main(String[] args) {
        ArrayList<Integer> results = AnagramSubstringIndex.anagramCount("babab", "ab");
        for(int result:results)System.out.println(result);
    }
}
//Pseudocode
//convert str 1 and 2 to char arrays
//loop through str2 and record frequency of chars
//loop through str1, check if character exists in the map
//increase count and delete char from