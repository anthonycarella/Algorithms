package carellaprojects.algorithms.sorting;

import java.util.Arrays;

/**
 * Bubble Sort Sorting Algorithm
 * Runtime: 
 *     Best Case:
 *     Average Case:
 *     Worst Case:
 * Memory:
 * 
 * @author Anthony Carella
 *
 */
public class BubbleSort {
    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {9, 2, 6, 3};
        System.out.println(Arrays.toString(arr));
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
