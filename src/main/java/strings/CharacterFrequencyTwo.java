package strings;

public class CharacterFrequencyTwo {
    public static String findFreq(String s){
        String output = "";
        if(s.length() == 0) return s;
        int[] charFreq = new int[26];
        char[] sChars = s.toCharArray();

        for(int i = 0; i < sChars.length; i++){
            charFreq[sChars[i] - 'a']++;
        }

        for(int i = 0; i < charFreq.length; i++){
            if(charFreq[i] > 0){
                char  currentChar = (char) (i + 'a');
                output += String.valueOf(charFreq[i]) + Character.toString(currentChar);
            }
        }

        return output;
    }
    public static void main(String[] args) {
        String result = CharacterFrequencyTwo.findFreq("babacd");
        System.out.println(result);

    }
}
//convert string to char array
//create an array or length = 26
//loop and increment the count in the array
//get the count and concat to the character
//concat to the output
//Time complexity = O(n)
//Space complexity = O(n)
