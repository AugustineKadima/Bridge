package stacks;

public class MyStack {
    int[] myStack = new int[0];
    int size = 0;
    int rear = 0;

    public MyStack(int size) {
        myStack = new int[size];
    }

    public void push(int num){
        if(rear < myStack.length){
            myStack[rear] = num;
            ++rear;
        }else{
            System.out.println("Stack is full!");
        }

    }

    public int pop(){
        int popped = 0;
        if(rear < 0) return -1;
        if(rear <= myStack.length - 1){
            popped = myStack[rear];
        }else{
            rear = myStack.length - 1;
            popped = myStack[rear];
        }
       --rear;
       return popped;

    }

    public int peek(){
        if(rear >= 0 && rear < myStack.length -1) return myStack[rear];
        return -1;
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack(6);
        stack.push(4);
        stack.push(7);
        stack.push(8);
        stack.push(2);
        stack.push(4);
        stack.push(7);
        stack.push(9);
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Popped out: "+ stack.pop());
        System.out.println("Peek: "+ stack.peek());
        for(int i:stack.myStack)System.out.println(i);
    }
}
//Pseudocode
//Create an array
//Create pop, push and peek methods
//Time complexity pop = O(1), push = O(1), peek = O(1)