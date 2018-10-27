package carellaprojects.algorithms.sorting;

import java.util.Arrays;

/**
 * Selection Sort Sorting Algorithm
 * Runtime:
 *     Best Case: O(n^2) (quadratic)
 *     Average Case: O(n^2) (quadratic)
 *     Worst Case: O(n^2) (quadratic)
 * Memory: O(1) (constant)
 * 
 * @author Anthony Carella
 *
 */
public class SelectionSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int index = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }
    }

    public static void main(String[] args) {
        int[] arr = {90, 1, 65, 30, 2, 77, 84, 3};
        System.out.println(Arrays.toString(arr));
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}