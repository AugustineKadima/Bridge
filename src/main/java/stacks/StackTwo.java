package stacks;

public class StackTwo {
    int[] stack;
    public StackTwo(int size){
        stack = new int[size];
    }
    int back = 0;
    public void push(int num){
        if(back < stack.length){
            stack[back] = num;
            ++back;
        }else{
            System.out.println("Stack is full!");
        }

    }

    public int pop(){
        int elementAtBack = 0;
        if(back > 0){
            elementAtBack = stack[back - 1];
            --back;
            stack[back] = 0;
        }else {
            System.out.println("Stack is empty");
            return  -1;
        }
        System.out.println("Popped out element: "+elementAtBack);
        return elementAtBack;
    }

    public int top(){
        int elementAtBack = 0;
        if(back > 0){
            elementAtBack = stack[back - 1];
        }else {
            System.out.println("There is nothing at the top");
            return  -1;
        }
        return elementAtBack ;
    }

    public boolean empty(){
        return back == 0;
    }

    public static void main(String[] args) {
        StackTwo stackTwo = new StackTwo(3);
//        stackTwo.push(2);
//        stackTwo.push(7);
//        stackTwo.push(3);
//        stackTwo.push(9);
//        stackTwo.pop();
//        stackTwo.pop();
//        stackTwo.pop();
//        stackTwo.pop();
        System.out.println("Element at top: "+stackTwo.top());
        for(int i : stackTwo.stack) System.out.println(i);
        System.out.println(stackTwo.empty());


    }
}
//Empty stack
//back = index 0
//[0,0,0]
//add 2
//[2,0,0]
//back = index 1
//add 7
//[2,7,0]
//back = index 0
//Remove back element
//[2,0,0]
