package strings;

public class FirstNonRepeatingCharacter {

    public static char nonRepeating(String s){
        if(s.length() == 0) return '_';
        char[] sChars = s.toCharArray();
        for(int i = 0; i < sChars.length; i++){
            boolean checker = false;
            for(int j = 0; j < sChars.length; j++){
                if(sChars[i] == sChars[j] && i != j){
                    checker = true;
                }
            }
            if(checker == false) return  sChars[i];
        }

        return '_';
    }
    public static void main(String[] args) {
        char result = FirstNonRepeatingCharacter.nonRepeating("jjabakcabad");
        System.out.println(result);
    }
}

//input s = "abacabad" output = c

//Pseudocode
//------------
//loop within a loop
//initialise checker to false
//if s[i] == s[j] and i != j set the checker to true
//if checker != true return s[i]

//Time complexity = O(n2)
//Space complexity = O(n)
