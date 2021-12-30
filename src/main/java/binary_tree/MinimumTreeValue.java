package binary_tree;

import java.util.Stack;

public class MinimumTreeValue {
    public static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
    public static  int minVal(Node node){
        if(node == null) return 0;
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        int minVal = Integer.MAX_VALUE;
        while(!stack.isEmpty()){
            Node current = stack.pop();
            if(current.data < minVal) minVal = current.data;
            if(current.right != null) stack.push(current.right);
            if(current.left != null) stack.push(current.left);

        }
        return minVal;
    }
    public static void main(String[] args) {
        Node two = new Node(2);
        Node thirteen = new Node(13);
        Node seven = new Node(7);
        Node one = new Node(1);
        Node four = new Node(4);
        Node six = new Node(6);
        Node five = new Node(5);

        two.left = thirteen;
        two.right = seven;
        thirteen.left = one;
        thirteen.right = four;
        seven.left = six;
        seven.right = five;

        int result = MinimumTreeValue.minVal(two);
        System.out.println("MinVal: "+ result);
    }
}



