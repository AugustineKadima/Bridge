package strings;


public class ReverseSentenseTwo {
    public char[] reverse(char[] A){
        String wordString = "";
        for(int i = 0; i < A.length; i++){
            wordString += Character.toString(A[i]);
        }

        String[] wordArray = wordString.split(" ");
        int n = wordArray.length;

        for(int i = 0; i < n; i++){
            String temp = wordArray[n - 1];
            wordArray[n - 1] = wordArray[i];
            wordArray[i] = temp;
            n--;
        }

        int m = wordArray.length;
        String reversedSentense = " ";
        for(int i = 0; i < m; i++){
            reversedSentense += wordArray[i] + " ";
        }
        char[] output = reversedSentense.trim().toCharArray();
        System.out.println("-----------"+ output.getClass());

        return output;
    }

    public static void main(String[] args) {
        ReverseSentenseTwo revS= new ReverseSentenseTwo();
        char[] ans = revS.reverse(new char[] {'t','h','i','s',' ','i','s',' ','g','o','o','d'});
        System.out.println(ans.getClass());

    }

}
//input A = ['t','h','i','s',' ','i','s',' ','g','o','o','d']
//      output  A = ['g','o','o','d',' ','i','s',' ','t','h','i','s']
//Pseudocode
//-----------
//Split " " input array
//loop and reverse
