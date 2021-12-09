package stacks;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s){
        if(s.length()%2 != 0) return false;

        char[] parenthesesArray = s.toCharArray();
        int n = parenthesesArray.length;
        Stack<Character> myStack = new Stack<>();

        for(int i = 0; i < n; i++){
            if(parenthesesArray[i] == '(' || parenthesesArray[i] == '[' || parenthesesArray[i] == '{'){
                myStack.push(parenthesesArray[i]);
            }else if(parenthesesArray[i] == ')' && !myStack.isEmpty() && myStack.peek() == '(' ){
                myStack.pop();
            }else if(parenthesesArray[i] == ']' && !myStack.isEmpty() && myStack.peek() == '[' ){
                myStack.pop();
            }else if(parenthesesArray[i] == '}' && !myStack.isEmpty() && myStack.peek() == '{' ){
                myStack.pop();
            }else{
                return false;
            }
        }

        return myStack.isEmpty();
    }
    public static void main(String[] args) {
       boolean results = ValidParentheses.isValid("{}");
        System.out.println(results);
    }
}

//Pseudocode
//Convert string to char array
//Loop through array
//Add opening brackets to stack
//Remove opening brackets when I encounter closing bracket
//Time complexity = O(n)
//Space complexity = O(n)
