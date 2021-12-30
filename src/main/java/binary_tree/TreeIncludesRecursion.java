package binary_tree;

public class TreeIncludesRecursion {
    public static boolean treeIncludes(Node node, char target){
        if(node == null) return false;
        if(node.data == target) return  true;
        return treeIncludes(node.left, target) || treeIncludes(node.right, target);
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
        boolean result = TreeIncludesRecursion.treeIncludes(a, 'l');
        System.out.println(result);
    }
}
//Space complexity = O(n)
//Space complexity = O(n)