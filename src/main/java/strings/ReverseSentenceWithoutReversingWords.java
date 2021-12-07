package strings;

public class ReverseSentenceWithoutReversingWords {
    public static String reverseSentence(String sentence){
        String[] sentenceArray = sentence.split(" ");
        int n = sentenceArray.length;
        String output = "";
        if(sentence == "") return  sentence;

        for (int i =0; i < n; i++){
            String temp = sentenceArray[n - 1];
            sentenceArray[n - 1] = sentenceArray[i];
            sentenceArray[i] = temp;
            n--;
        }

        int m = sentenceArray.length;
        for(int i = 0; i < m; i++){
            output += sentenceArray[i] + " ";
        }

        return output.trim();
    }
    public static void main(String[] args) {
       String result = ReverseSentenceWithoutReversingWords.reverseSentence("I love you Baby");
        System.out.println(result);
    }
}
//Pseudocode
//----------
//convert string to array
//Loop
//Reverse in place
//Loop
//add string partitions to the result

//Space complexity = O(n)
//Time complexity = O(n)