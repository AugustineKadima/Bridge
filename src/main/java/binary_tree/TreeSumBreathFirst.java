package binary_tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class TreeSumBreathFirst {

    public static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int findSum(Node node){
        if(node == null) return  0;
        Queue<Node> queue = new ArrayDeque();
        queue.add(node);
        int sum = 0;
        while(!queue.isEmpty()){
            Node current = queue.remove();
            sum += current.data;
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        return sum;
    }
    public static void main(String[] args) {
        Node two = new Node(2);
        Node thirteen = new Node(13);
        Node seven = new Node(7);
        Node one = new Node(1);
        Node four = new Node(4);
        Node six = new Node(6);
        Node five = new Node(51);

        two.left = thirteen;
        two.right = seven;
        thirteen.left = one;
        thirteen.right = four;
        seven.left = six;
        seven.right = five;

        int result = TreeSumBreathFirst.findSum(two);
        System.out.println(result);
    }
}
//Time complexity = O(n)
//Space complexity = O(n)