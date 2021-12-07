package strings;

public class ReverseSimpleString {
    public static  String reverseSimpleString(String str){
        char[] strChars = str.toCharArray();
        int n = strChars.length;
        String output = "";

        if( str == "") return str;

        for (int i = 0; i < n; i++){
            char temp = strChars[n - 1];
            strChars[n -1] = strChars[i];
            strChars[i] = temp;
            n--;
        }

        int m = strChars.length;
        for(int i = 0; i < m; i++){
            output += Character.toString(strChars[i]);
        }

        return output;
    }
    public static void main(String[] args) {
        String results = ReverseSimpleString.reverseSimpleString("a");
        System.out.println(results);
    }
}
//Pseudocode
//------------
//Convert string to char array
//Loop
//Create temporary variable
//Reverse in place
//return reversed string

//Time complexity = O(n)
//Space complexity = O(n)