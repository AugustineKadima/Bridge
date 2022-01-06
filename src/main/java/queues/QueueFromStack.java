package queues;

import stacks.StackTwo;

public class QueueFromStack {
    StackTwo mainStack = new StackTwo(3);
    StackTwo tempStack = new StackTwo(3);
    int back = 0;

    public void enqueue(int num){
        if(back < mainStack.size) mainStack.push(num);
        else System.out.println("Stack is full!");
    }

    public int dequeue(){
        while(!mainStack.empty()){
            tempStack.push(mainStack.pop());
        }
        int frontQueue = tempStack.pop();

        while(!tempStack.empty()){
            mainStack.push(tempStack.pop());
        }

        return frontQueue;
    }

    public static void main(String[] args) {
        QueueFromStack queue = new QueueFromStack();
        queue.enqueue(5);
        queue.enqueue(4);
        queue.enqueue(9);
        queue.enqueue(8);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        for(int i = 0; i < queue.mainStack.size; i++)System.out.println(queue.mainStack.stack[i]);
    }

}

//Pseudocode
//Create two stacks mainStack and tempStack
//Enqueue - Push to main stack

//Dequeue - Pop{
//  pop all values from mainStack and push to tempStack
//  return tempStack.pop()
//  pop all items from tempStack and push to mainStack
// }

//check if mainStack is empty and return true
