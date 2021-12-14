package strings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
    public static String findFrequency(String s){
        if(s.length() == 0) return s;
        char[] sChars = s.toCharArray();
        String output = "";
        Map<Character, Integer> charFreqMap = new HashMap<>();
        for(int i = 0; i < sChars.length; i++){
            if(!charFreqMap.containsKey(sChars[i])){
                charFreqMap.put(sChars[i], 1);
            }else{
                charFreqMap.replace(sChars[i], charFreqMap.get(sChars[i]) + 1);
            }
        }

        for(Map.Entry<Character, Integer> entry: charFreqMap.entrySet()){
            output += Character.toString(entry.getKey()) + String.valueOf(entry.getValue());
        }
        return output;

    }
    public static void main(String[] args) {
        String result = CharacterFrequency.findFrequency("baba kevin");
        System.out.println("Results: "+ result);
    }
}
//Given a string s. find the frequency of the characters in the string
//return 5a3b2c
//Pseudocode
//create a character array
//loop through array
//add character as key and frequency as value to a map
//loop through the map and concatenate the key and value to the output string
//Time complexity = O(n)
//Space complexity = O(n)
