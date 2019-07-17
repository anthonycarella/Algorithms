package carellaprojects.algorithms.datastructures;

@SuppressWarnings("unused")
public class VectorImpl<E> {
    private int size;
    private E[] arr;
    private final int INITIAL_CAPACITY = 10;

    public VectorImpl() {
        size = 0;
        arr = (E[]) new Object[INITIAL_CAPACITY];
    }

    public void add(E element) {
        arr[size++] = element;
    }

    public E get(int index) {
        return arr[index];
    }

    public void remove() {

    }
}
