package carellaprojects.algorithms.datastructures;

/**
 * 
 * @author Anthony Carella
 *
 */
public class Stack {
    private int[] arr;
    private int top;
    private int capacity;

    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }

    public void push(int num) {
        if (isFull()) {
            System.out.println("Stack overflow. Program will be terminated.");
            System.exit(1);
        }
        System.out.println("Inserting " + num);
        arr[++top] = num;
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Program will be terminated.");
            System.exit(1);
        }
        System.out.println("Removing " + peek());
        return arr[top--];
    }

    public int peek() {
        if (!isEmpty()) return arr[top];
        else System.exit(1);
        return -1;
    }

    public int size() {
        return top + 1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public Boolean isEmpty() {
        return top == - 1;
    }
}
