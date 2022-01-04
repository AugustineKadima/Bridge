package queues;

public class Queue {
    int[] queue;
    int back = 0;
    int front = 0;

    public Queue(int size){
        queue = new int[size];
    }

    public void enqueue(int num){
        if(back < queue.length){
            queue[back] = num;
            ++back;
        }else{
            System.out.println("Queue is full!");
        }
    }

    public int dequeue(){
        if(back == 0) System.out.println("Queue is empty.");
        int frontQueued = queue[front];
        for(int i = 0; i < queue.length - 1; i++){
            queue[i] = queue[i + 1];
        }
        queue[queue.length - 1] = 0;
        --back;
        return frontQueued;
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.enqueue(3);
        queue.enqueue(5);
        queue.enqueue(8);
        queue.enqueue(2);
        queue.enqueue(7);
//        queue.enqueue(9);
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();



        for(int i: queue.queue) System.out.println(i);
    }

}

//[3,5,8,2,7]
//Time complexity dequeue = O(n)
//Time complexity enqueue = O(1)
//Space complexity = O(1)










