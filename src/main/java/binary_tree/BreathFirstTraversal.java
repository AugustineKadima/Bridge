package binary_tree;

import queues.MyQueue;

import java.util.ArrayDeque;
import java.util.Queue;

public class BreathFirstTraversal {
    public static class MyNode{
        MyNode left;
        MyNode right;
        int data;

        public MyNode(int data) {
            this.data = data;
        }
    }

    public static void breathFirst(MyNode node){
        if(node == null) System.out.println("null");;
        Queue<MyNode> queue = new ArrayDeque<>();
        queue.add(node);

        while(!queue.isEmpty()){
            MyNode currentNode = queue.remove();
            System.out.println(currentNode.data);
            if(currentNode.left != null) queue.add(currentNode.left);
            if(currentNode.right != null) queue.add(currentNode.right);
        }

    }
    public static void main(String[] args) {
        MyNode one = new MyNode(1);
        MyNode two = new MyNode(2);
        MyNode three = new MyNode(3);
        MyNode four = new MyNode(4);
        MyNode five = new MyNode(5);
        MyNode six = new MyNode(6);


        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.right = six;

        breathFirst(one);
    }
}
//Time complexity = O(n)
//Space complexity = O(n)