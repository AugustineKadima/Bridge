package binary_tree;

public class TreeSumRecursive {
    public static class Node{
        Node left;
        Node right;
        int data;

        public Node(int data) {
            this.data = data;
        }
    }

    public static int findSum(Node node){
        if(node == null) return 0;
        return node.data + findSum(node.left) + findSum(node.right);
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

        int result = TreeSumRecursive.findSum(two);
        System.out.println(result);
    }
}
//Time complexity = O(n)
//Space complexity = O(n)
