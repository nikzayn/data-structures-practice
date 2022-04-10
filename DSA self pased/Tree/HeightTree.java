class Node {
    int key;
    Node left, right;
    Node(int k) {
        key = k;
        left = null;
        right = null;
    }
}

public class HeightTree {
    static int treeHeight(Node root){
        if(root == null){
            return 0;
        }
        return Math.max((treeHeight.left), (treeHeight.right)) + 1;
    }

    public static void main(String[] args) {
        Node root=new Node(10);
        root.left=new Node(20);
        root.right=new Node(30);
        root.right.left=new Node(40);
        root.right.right=new Node(50);
    }
}
