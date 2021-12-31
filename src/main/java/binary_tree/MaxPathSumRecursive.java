package binary_tree;

public class MaxPathSumRecursive {
    public static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int maxPath(Node node){
        if(node == null) return  Integer.MIN_VALUE;
        if(node.left == null && node.right == null) return node.data;
        int rightNax = maxPath(node.right);
        int leftMax = maxPath(node.left);
        int max = Math.max(rightNax,leftMax);
        return node.data + max;
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

        int res = MaxPathSumRecursive.maxPath(two);
        System.out.println(res);
    }
}
