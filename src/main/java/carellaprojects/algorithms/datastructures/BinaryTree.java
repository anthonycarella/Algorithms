package carellaprojects.algorithms.datastructures;

/**
 * Implementation of a binary tree that uses generic types.
 * @author Anthony Carella
 *
 */
public class BinaryTree<T> {
    /**
     * Inner class of BinaryTreeNode that holds a value, and a reference to the left and right
     * nodes of each node in the binary tree.
     */
    @SuppressWarnings("unused")
    class BinaryTreeNode<V> {
        V value;
        BinaryTreeNode left;
        BinaryTreeNode right;

        BinaryTreeNode(V value) {
            this.value = value;
            right = null;
            left = null;
        }

        BinaryTreeNode() {
            value = null;
        }

        public V get() {
            return this.value;
        }

        public void set(V value) {
            this.value = value;
        }
    }

    private BinaryTreeNode root;

    BinaryTree(T value) {
        root = new BinaryTreeNode(value);
    }

    BinaryTree() {
        root = null;
    }

    public void preOrderTraversal(BinaryTreeNode node) {
        if (node == null) return;
        System.out.println(node.value);
        preOrderTraversal(node.left);
        preOrderTraversal(node.right);
    }

    public void inOrderTraversal(BinaryTreeNode node) {
        if (node == null) return;
        inOrderTraversal(node.left);
        System.out.println(node.value);
        inOrderTraversal(node.right);
    }

    public void postOrderTraversal(BinaryTreeNode node) {
        if (node == null) return;
        postOrderTraversal(node.left);
        postOrderTraversal(node.right);
        System.out.println(node.value);
    }

    public static void main(String[] args) {
        /* Create a new binary tree of integers.
         *         100
         *       /     \
         *     45       76
         *    /  \     /
         *   98  216  11
         */
        BinaryTree<Integer> intBinaryTree = new BinaryTree();
        intBinaryTree.root = intBinaryTree.new BinaryTreeNode<String>();
        intBinaryTree.root = intBinaryTree.new BinaryTreeNode<>(100);
        intBinaryTree.root.left = intBinaryTree.new BinaryTreeNode<>(45);
        intBinaryTree.root.right = intBinaryTree.new BinaryTreeNode<>(76);
        intBinaryTree.root.left.left = intBinaryTree.new BinaryTreeNode<>(98);
        intBinaryTree.root.left.right = intBinaryTree.new BinaryTreeNode<>(216);
        intBinaryTree.root.right.left = intBinaryTree.new BinaryTreeNode<>(11);

        // Traverse the integer tree in three different ways.
        System.out.println("### PRE-ORDER TRAVERSAL ###");
        intBinaryTree.preOrderTraversal(intBinaryTree.root);
        System.out.println("### IN-ORDER TRAVERSAL ###");
        intBinaryTree.inOrderTraversal(intBinaryTree.root);
        System.out.println("### POST-ORDER TRAVERSAL ###");
        intBinaryTree.postOrderTraversal(intBinaryTree.root);

        /*
         * Create a new binary tree of strings.
         *          "The All"
         *         /         \
         *   "Anthony"     "Jennine"
         *   /     \       /        \
         * "Chloe""Benji" "Kaitlyn" "Leeloo"
         */
        BinaryTree<String> stringBinaryTree = new BinaryTree("The All");
        stringBinaryTree.root.left = stringBinaryTree.new BinaryTreeNode<>("Anthony");
        stringBinaryTree.root.right = stringBinaryTree.new BinaryTreeNode<>("Jennine");
        stringBinaryTree.root.left.left = stringBinaryTree.new BinaryTreeNode<>("Chloe");
        stringBinaryTree.root.left.right = stringBinaryTree.new BinaryTreeNode<>("Benji");
        stringBinaryTree.root.right.left = stringBinaryTree.new BinaryTreeNode<>("Kaitlyn");
        stringBinaryTree.root.right.right = stringBinaryTree.new BinaryTreeNode<>("Leeloo");

        BinaryTree b = new BinaryTree();

        // Traverse the string tree in three different ways.
        System.out.println("### PRE-ORDER TRAVERSAL ###");
        stringBinaryTree.preOrderTraversal(stringBinaryTree.root);
        System.out.println("### IN-ORDER TRAVERSAL ###");
        stringBinaryTree.inOrderTraversal(stringBinaryTree.root);
        System.out.println("### POST-ORDER TRAVERSAL ###");
        stringBinaryTree.postOrderTraversal(stringBinaryTree.root);
    }
}