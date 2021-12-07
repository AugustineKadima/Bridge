package integers;


import java.util.Arrays;

public class ReverseIntegerTwo {
    public static  int reverseInteger(int num){
        char[] numChars = String.valueOf(Math.abs(num)).toCharArray();
        int n = numChars.length;
        int results = 0;
        for(int i = 0; i < n; i++){
            char temp = numChars[n-1];
            numChars[n -1] = numChars[i];
            numChars[i] = temp;
            n--;
        }

        int m  = numChars.length;
        for(int i = 0; i < m; i++){
            results = (results * 10 ) + Integer.parseInt(Character.toString(numChars[i]));
        }
        if(num < 0) results *= -1;


        return results;
    }
    public static void main(String[] args) {
        int result = ReverseIntegerTwo.reverseInteger(-901);
        System.out.println(result);
    }
}
//Pseudocode
//__________
//Convert int to character array
//Loop through array
//Reverse in place
//Loop through reversed array
//Convert array[i] to integer and append to result
//return the result

//Time complexity = O(n)
//Space complexity = O(n)