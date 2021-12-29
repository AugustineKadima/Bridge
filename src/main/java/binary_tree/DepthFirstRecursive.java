package binary_tree;

public class DepthFirstRecursive {
    static  class Node {
        Node right;
        Node left;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static void deptFirst(Node node){
        if(node == null) System.out.println("null");;
        System.out.println(node.data);
        deptFirst(node.left);
        deptFirst(node.right);

    }

    public static void main(String[] args) {
        Node one = new Node(1);
        Node two = new Node(2);
        Node three = new Node(3);
        Node four = new Node(4);
        Node five = new Node(5);
        Node six = new Node(6);


        one.left = two;
        one.right = three;
        two.left = four;
        two.right = five;
        three.right = six;

      DepthFirstRecursive.deptFirst(one);
    }
}

//To be debugged
