package carellaprojects.algorithms.datastructures;

/**
 * Implementation of a binary tree that holds integers.
 * @author Anthony Carella
 *
 */
public class BinaryTree {
    BinaryTreeNode root;

    BinaryTree(int value) {
        root = new BinaryTreeNode(value);
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
        /* Create a new binary tree.
         *         100
         *       /     \
         *     45       76
         *    /  \     /
         *   98  216  11
         */
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.root = new BinaryTreeNode(100);
        binaryTree.root.left = new BinaryTreeNode(45);
        binaryTree.root.right = new BinaryTreeNode(76);
        binaryTree.root.left.left = new BinaryTreeNode(98);
        binaryTree.root.left.right = new BinaryTreeNode(216);
        binaryTree.root.right.left = new BinaryTreeNode(11);

        System.out.println("Getters");
        System.out.println("Get root node: " + binaryTree.root.get());
        System.out.println("Get root's left node: " + binaryTree.root.left.get());
        System.out.println("Get root's right node: " + binaryTree.root.right.get());
        System.out.println("Get root's left node's left node: " + binaryTree.root.left.left.get());
        System.out.println("Get root's left node's right node: " + binaryTree.root.left.right.get());
        System.out.println("Get root's right node's left node: " + binaryTree.root.right.left.get());
        System.out.println("Changing root's left node to 1005...");
        binaryTree.root.left.set(1005);
        System.out.println("Get root's new left node value: " + binaryTree.root.left.get());
        
        // Traverse the tree in three different ways.
        System.out.println("### PRE-ORDER TRAVERSAL ###");
        binaryTree.preOrderTraversal(binaryTree.root);
        System.out.println("### IN-ORDER TRAVERSAL ###");
        binaryTree.inOrderTraversal(binaryTree.root);
        System.out.println("### POST-ORDER TRAVERSAL ###");
        binaryTree.postOrderTraversal(binaryTree.root);
    }
}

class BTNode {
    
}