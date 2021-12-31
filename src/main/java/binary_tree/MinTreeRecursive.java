package binary_tree;

public class MinTreeRecursive {
    public static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }
    public static int findMin(Node node){
        if(node == null) return Integer.MAX_VALUE;
        int left = findMin(node.left);
        int right = findMin(node.right);
        int i = Math.min(right, left);
        return Math.min(i,node.data);
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

        int res = MinTreeRecursive.findMin(two);
        System.out.println(res);
    }
}
