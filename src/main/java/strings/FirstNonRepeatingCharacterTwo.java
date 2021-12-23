package strings;

import java.util.HashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterTwo {
    public static char uniqueChar(String s){
        if(s.length() == 0) return '_';
        Map<Character, Integer> charMap = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(!charMap.containsKey(s.charAt(i))){
                charMap.put(s.charAt(i), 1);
            }else{
                charMap.replace(s.charAt(i), charMap.get(s.charAt(i)) + 1);
            }
        }

        for(int i = 0; i < s.length(); i++){
            if(charMap.get(s.charAt(i)) == 1){
                return s.charAt(i);
            }
        }

        return '_';
    }
    public static void main(String[] args) {
        char result = FirstNonRepeatingCharacterTwo.uniqueChar("jjabakcabad");
        System.out.println(result);
    }
}

//Pseudocode
//----------
//Loop though string and add char freq to hashmap
//loop through string again and check if character has a frequency of 1
//return character
