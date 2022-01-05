package stacks;

public class Stack {
    int[] stack = new int[0];
    int back = 0;

    public Stack(int size){
        stack = new int[size];
    }

    public void push(int num){
        if(back < stack.length) {
            stack[back] = num;
          ++back;

            System.out.println("Back: "+ back);
        }
        else System.out.println("Stack is full!");
    }

    public int pop(){
        int rearValue = 0;
        if(back <= 0) {
            System.out.println("Stack is empty");
            return -1;
        }
        else rearValue = stack[back - 1];
        --back;
        stack[back] = 0;
        return rearValue;
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(3);
        stack.push(9);
        stack.push(6);
        stack.push(4);
        stack.push(8);
        stack.push(7);
        stack.push(7);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

//

        for(int i: stack.stack) System.out.println(i);
    }
}
