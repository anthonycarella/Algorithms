package carellaprojects.algorithms.datastructures;

public class BinaryTree {
    Node root;

    BinaryTree(int value) {
        root = new Node(value);
    }

    BinaryTree() {
        root = null;
    }

    public int get() {
        return this.root.value;
    }

    public void set(int value) {
        this.root.set(value);
    }

    public static void main(String[] args) {
        /* Create a new binary tree.
         *         100
         *       /     \
         *     45       76
         *    /  \     /
         *   98  216  11
         */
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new Node(100);
        binaryTree.root.left = new Node(45);
        binaryTree.root.right = new Node(76);
        binaryTree.root.left.left = new Node(98);
        binaryTree.root.left.right = new Node(216);
        binaryTree.root.right.left = new Node(11);

        // Traverse the tree in three different ways.
        System.out.println("### PRE-ORDER TRAVERSAL ###");
        binaryTree.preOrderTraversal(binaryTree.root);
        System.out.println("### IN-ORDER TRAVERSAL ###");
        binaryTree.inOrderTraversal(binaryTree.root);
        System.out.println("### POST-ORDER TRAVERSAL ###");
        binaryTree.postOrderTraversal(binaryTree.root);
    }

    public void preOrderTraversal(Node node) {
        if (node == null) return;
        System.out.println(node.value);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(Node node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.println(node.value);
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(Node node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value);
    }
}