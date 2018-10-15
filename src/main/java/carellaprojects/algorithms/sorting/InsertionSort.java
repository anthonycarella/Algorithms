package carellaprojects.algorithms.sorting;

import java.util.Arrays;

/**
 * Insertion Sort Sorting Algorithm
 * Runtime:
 *     Best Case: O(n) (linear)
 *     Average Case:
 *     Worst Case: O(n^2) (quadratic)
 * Memory: O(1) (constant)
 * 
 * @author Anthony Carella
 *
 */
public class InsertionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 9, 2, 10, 6, 11, 4, 3, 21, 1};
        System.out.println(Arrays.toString(arr));
        InsertionSort.sort(arr);
        System.out.println(Arrays.toString(arr));
        
    }
}