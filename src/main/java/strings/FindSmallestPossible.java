package strings;

import java.util.Stack;

public class FindSmallestPossible {
    public static  int smallestPossible(int num, int k){

        if(num == 0 || k > num) return -1;
        char[] numsArray = String.valueOf(num).toCharArray();
        Stack<Integer> numStack = new Stack<>();

        for(int i = 0; i < numsArray.length; i++){
            int j = Integer.parseInt(Character.toString(numsArray[i]));
            if(numStack.isEmpty() || numStack.peek() <= j){
                numStack.push(j);

            }else {
                if(k > 0){
                    numStack.pop();
                    numStack.push(j);
                    k--;
                }

            }
        }

        System.out.println("Numstack: "+numStack);


        int temp = 0;
        for(int i = 0; i <= numStack.size(); i++){
            if(!numStack.isEmpty()) temp = (temp* 10) + numStack.pop() ;
        }

        temp = (temp* 10) + numStack.pop();


        int output = 0;
        for(int i = 0; i <= temp; i++){
            output = (output*10) + temp % 10;
            temp = temp/10;
        }



        return output;
    }
    public static void main(String[] args) {
        int results = FindSmallestPossible.smallestPossible(1432219,3);
        System.out.println("Results: "+results);
    }
}
//Given num = 1432219 and k = 3, output = 1219
//Pseudocode
//------------
//Use a stack
//Loop through nums
//add nums[i] to stack
//if peek of stack is larger than nums[i], pop from stack , and nums[i]
//pop from stack and store in results
//Return results

//Space complexity = O(n)
//Time complexity = O(n)
