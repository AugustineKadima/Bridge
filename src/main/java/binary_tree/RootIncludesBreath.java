package binary_tree;

import java.util.ArrayDeque;
import java.util.Queue;

public class RootIncludesBreath {
    public static class  Node{
        Node left;
        Node right;
        char data;

        public Node(char data) {
            this.data = data;
        }
    }

    public static boolean rootIncludes(Node node, char target){
        if(node == null) return false;
        Queue<Node> queue = new ArrayDeque();
        queue.add(node);
        while(!queue.isEmpty()){
            Node current = queue.remove();
            if(current.data == target) return true;
            if(current.left != null) queue.add(current.left);
            if(current.right != null) queue.add(current.right);
        }
        return false;
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
       boolean result = RootIncludesBreath.rootIncludes(a, 'k');
        System.out.println(result);
    }
}
//Time complexity = O(n)
//Space complexity = O(n)