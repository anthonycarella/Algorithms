package carellaprojects.algorithms.datastructures;

public class BinaryTreeNode {
    int value;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(int value) {
        this.value = value;
        right = null;
        left = null;
    }

    public int get() {
        return this.value;
    }

    public void set(int value) {
        this.value = value;
    }
}
