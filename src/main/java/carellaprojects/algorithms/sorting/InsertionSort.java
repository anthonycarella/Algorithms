package carellaprojects.algorithms.sorting;

import java.util.Arrays;

/**
 * Insertion Sort Sorting Algorithm
 * Runtime:
 *     Best Case: O(n) (linear)
 *     Average Case:
 *     Worst Case: O(n^2) (quadratic)
 * Memory:
 * @author Anthony Carella
 *
 */
public class InsertionSort {
    public static int[] sort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            int k = i;
            while (k > 0 && (arr[k] < arr[k - 1])) {
                temp = arr[k];
                arr[k] = arr[k - 1];
                arr [k - 1] = temp;
                k--;
            }
        }
        return arr;
    }

    public static void printArray(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = {99,5,143,77};
        System.out.println("=====Insertion Sort=====");
        System.out.print("Before the sort: ");
        InsertionSort.printArray(arr);
        InsertionSort.sort(arr);
        System.out.print("After the sort: ");
        InsertionSort.printArray(arr);
    }
}