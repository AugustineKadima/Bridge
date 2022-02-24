package strings;

import java.util.Arrays;

public class ReverseStringInArray {

    public static String[] reverseStr(String[] words){
        if (words.length < 2) return  words;
        for(int i = 0; i < words.length; i++){
            char[] wordArray = words[i].toCharArray();
            int n = wordArray.length;
            for(int j = 0; j < n; j++){
                char temp = wordArray[n - 1];
                wordArray[n - 1] = wordArray[j];
                wordArray[j] = temp;
                --n;
            }
            String reversed = "";
            for(int j = 0; j < wordArray.length; j++){
                reversed += wordArray[j];
            }
            words[i] = reversed;
//            System.out.println(words[i]);;
        }
        return words;
    }

    public static void main(String[] args) {
        String[] result = ReverseStringInArray.reverseStr(new String[]{"python","javascript","angular"});
        System.out.println(Arrays.toString(result));
    }

}
