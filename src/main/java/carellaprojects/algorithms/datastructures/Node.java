package carellaprojects.algorithms.datastructures;

public class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
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
