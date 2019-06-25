package carellaprojects.algorithms.datastructures;

import java.util.Arrays;

/**
 * Stack data structure using generics.
 * @author Anthony Carella
 *
 */
@SuppressWarnings("unused")
public class Stack<T> {
    private T[] arr;
    private int top;
    private int capacity;
    private final int DEFAULT_INITIAL_CAPACITY = 10;

    Stack() {
        capacity = DEFAULT_INITIAL_CAPACITY;
        //arr = new T[DEFAULT_INITIAL_CAPACITY];
        arr = (T[]) new Object[DEFAULT_INITIAL_CAPACITY];
        top = -1;
    }

    Stack(int size) {
        arr = (T[]) new Object[size];
        capacity = size;
        top = -1;
    }

    public void push(T num) {
        if (isFull()) {
            System.out.println("Stack overflow. Program will be terminated.");
            System.exit(1);
        }
        System.out.println("Inserting " + num);
        arr[++top] = num;
    }

    public T pop() {
        if (isEmpty()) {
            System.out.println("Stack underflow. Program will be terminated.");
            System.exit(1);
        }
        System.out.println("pop() method: removing " + peek() + " from top of the stack.");
        return arr[top--];
    }

    public T peek() {
        if (!isEmpty()) {
            System.out.println("peek() method: value at top of stack = " + arr[top]);
            return arr[top];
        } else System.exit(1);
        return null;
    }

    public int size() {
        return top + 1;
    }

    public Boolean isFull() {
        return top == capacity - 1;
    }

    public Boolean isEmpty() {
        return top == -1;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            if (i == 0) str.append("[ ");
            str.append(arr[i]);
            if (i != top) str.append(", ");
            if (i == top) str.append(" ]");
        }
        return str.toString();
    }

}

class Main {
    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Twelve");
        stringStack.push("Noni");
        stringStack.push("Anthony");
        stringStack.peek();
        System.out.println(stringStack.toString());
        stringStack.pop();
        System.out.println(stringStack.toString());

        Stack<Integer> intStack = new Stack<>();
        intStack.push(42);
        intStack.push(new Integer(99999));
        intStack.push(958);
        stringStack.peek();
        System.out.println(intStack.toString());
        intStack.pop();
        intStack.pop();
        System.out.println(intStack.toString());

    }
}
