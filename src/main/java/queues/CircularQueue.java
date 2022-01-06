package queues;

public class CircularQueue {
    int[] queue = new int[4];
    int front = 0, back = 0;

    public void enqueue(int num){
        if(back < queue.length) {
            queue[back] = num;
            ++back;
        }else if(front != 0 && back >= queue.length){
            back = 0;
            if(queue[back] != 0){
                System.out.println("Queue is full!");

            }else {
                queue[back] = num;
                ++back;
            }
        }
    }

    public int dequeue(){
        int frontVal = 0;
        if(back == 0) {
            System.out.println("Queue is empty!");
            return -1;
        }
        if(front < queue.length){
            frontVal =  queue[front];
            queue[front] = 0;
            ++front;

        }else {
            front = 0;
        }
        return frontVal;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue();
        queue.enqueue(6);
        queue.enqueue(8);
        queue.enqueue(5);
        queue.enqueue(9);
        queue.dequeue();
        queue.enqueue(7);
        queue.enqueue(20);


//        queue.dequeue();
//        queue.enqueue(10);




        for(int i: queue.queue) System.out.println(i);
    }
}
//pseudocode
//------------
//enqueue - Add one element at the back
//[1,0,0,0]
//enqueue - Add one more element at the back
//[1,2,0,0]
//enqueue -Add one more element at the back
//[1,2,3,0]
//enqueue - Add one more element at the back
//[1,2,3,4]
//dequeue - Remove an element from the front
//[0,2,3,4]
//enqueue - Add an element
//[5,2,3,4]
//deque - remove element at front
//[5,0,3,4]
//enqueue
//[5,6,3,4]
//dequeue
//[5,6,0,4]
//enqueue
//[5,6,7,4]
//dequeue
//[5,6,7,0]
//enqueue
//[5,6,7,8]