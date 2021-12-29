package binary_tree;

import java.util.Stack;

public class DepthFirstTraversal {
    static class Node{
        Node left;
        Node right;
        char data;

        public Node(char data) {
            this.data = data;
        }
    }

    public static void depthTraversal(Node node){
        if(node == null) System.out.println("Null node");
        Stack<Node> characterStack = new Stack<>();

        characterStack.push(node);

        while(!characterStack.isEmpty()){
            Node current = characterStack.pop();
            System.out.println(current.data);
            if(current.right != null) characterStack.push(current.right);
            if(current.left != null) characterStack.push(current.left);

        }

    }

    public static void main(String[] args) {
       Node a = new Node('a');
       Node b = new Node('b');
       Node c = new Node('c');
       Node d = new Node('d');
       Node e = new Node('e');
       Node f = new Node('f');

       a.left = b;
       a.right = c;
       b.left = d;
       b.right = e;
       c.right = f;

       DepthFirstTraversal.depthTraversal(a);
    }
}

//Time complexity = O(n)
//Space complexity = O(n)