package stacks;

import java.util.Stack;

public class ScoreOfParenthesis {
    public static int findScore(String s){
        if(s.length() < 2) return -1;
        int score = 0;
        char[] braces = s.toCharArray();
        Stack<Character> charStack = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            if(braces[i] == '('){
                charStack.push(braces[i]);
            }else if(!charStack.isEmpty()){
                charStack.pop();
                score++;
            }
        }

        return score;
    }
    public static void main(String[] args) {
       int  results = ScoreOfParenthesis.findScore("(");
        System.out.println("Results: " + results);
    }
}
//input () score= 1
//input ()() score = 2


//Pseudocode:
//Convert the string to char array
//initialize score to 0
//Loop and add  score when there is closing bracket
