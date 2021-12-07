package strings;

public class ReverseSentenceWithoutReversingWordsTwo {
    public static String reverseString(String str){
        String[] strArray = str.split(" ");
        int n = strArray.length;
        String output = "";
        if(str == " ") return str;
        for(int i = n - 1; i >= 0; i--){
            output += strArray[i] + " ";
        }

        return output.trim();
    }
    public static void main(String[] args) {
        String result = ReverseSentenceWithoutReversingWordsTwo.reverseString("I have a dollar");
        System.out.println(result);
    }
}

//Pseudocode
//------------
//Convert string to string array
//Loop and append array values to output
//return output;
//Time complexity = O(n)
//Space complexity = O(n)


