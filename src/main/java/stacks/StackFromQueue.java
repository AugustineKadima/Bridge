package stacks;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackFromQueue {
    Queue<Integer> mainQueue = new ArrayDeque<>();
    Queue<Integer> tempDeque = new ArrayDeque<>();
    public void push(int num){
        mainQueue.add(num);
    }

    public int pop(){
        int poppedOut  = 0;
        while(!mainQueue.isEmpty()){
            if(mainQueue.size() > 1)tempDeque.add(mainQueue.remove());
            else poppedOut = mainQueue.remove();
        }

        while(!tempDeque.isEmpty()){
            mainQueue.add(tempDeque.remove());
        }

        return  poppedOut;
    }

    public int peek(){
        int poppedOut  = 0;
        if(mainQueue.size() == 0){
            System.out.println("Stack is empty!");
            return  -1;
        }
        while(!mainQueue.isEmpty()){
            if(mainQueue.size() > 1){
                tempDeque.add(mainQueue.remove());
            }
            else{
                poppedOut = mainQueue.remove();
                tempDeque.add(poppedOut);
            }
        }

        while(!tempDeque.isEmpty()){
            mainQueue.add(tempDeque.remove());
        }

        return  poppedOut;
    }

    public boolean empty(){
        return mainQueue.isEmpty();
    }
    public static void main(String[] args) {
        StackFromQueue stack = new StackFromQueue();
        stack.push(9);
        stack.push(5);

        System.out.println("Popped: "+ stack.pop());
        System.out.println("Popped: "+ stack.pop());

        System.out.println("Peek: " + stack.peek());

//        for(int i: stack.mainQueue) System.out.println(i);
    }
}
//Pseudocode
//Create two queues
//push - Add to the first queue
//pop - deque the first queue and add to second queue. return the dequeued value from second queue
//      -dequeue the second queue and enqueue to the first queue
