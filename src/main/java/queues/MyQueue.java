package queues;

public class MyQueue {
    int[] queue = new int[0];
    int size, back, front = 0;

    public MyQueue(int size){
        queue = new int[size];
    }

    public void enqueue(int num){
        if(back < queue.length) {
            queue[back] = num;
            ++back;
        }
        else{

            System.out.println("Queue is full!");
        }
        System.out.println("Queue length: "+queue.length);

    }

    public int dequeue(){
        int dequeued = queue[front];
        if(back < 0 ) return  -1;
        for(int i = 1; i < queue.length; i++){
            queue[i - 1] = queue[i];

        }
        queue[queue.length - 1] = 0;
        --back;
        return dequeued;
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(3);
        myQueue.enqueue(6);
        myQueue.enqueue(3);
        myQueue.enqueue(5);
        myQueue.enqueue(4);

        System.out.println("Dequeued is: "+myQueue.dequeue());
        System.out.println("Dequeued is: "+myQueue.dequeue());






        for(int i: myQueue.queue) System.out.println(i);
    }
}
//Pseudocode
//First in first out
//Create int array
//enqueue at back
//dequeue at front