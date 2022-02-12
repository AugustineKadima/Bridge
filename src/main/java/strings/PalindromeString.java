package strings;

public class PalindromeString {
    public static boolean isPalindrome(String s){
        if(s.length() < 2) return true;
        String reversedS = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reversedS += Character.toString(s.charAt(i));
        }
        return s.equals(reversedS);
    }

    public static void main(String[] args) {
        boolean results = PalindromeString.isPalindrome("aca");
        System.out.println("Results: "+ results);
    }
}
//input = aca output = true
//input = acca output = true
//input = acfa output = false

//Pseudocode
/*
* Convert string  to an array of characters
* Reverse String
* Store reversed in a variable
* Check if reversed is equal to string
* Return true if they are equal
*  */

//Time complexity = O(n)
//Space complexity  = O(n)