package carellaprojects.algorithms.sorting;

import java.util.Arrays;

/**
 * <pre>
 * Merge Sort Sorting Algorithm
 * 
 * A recursive algorithm that splits up an  array of numbers, sorts each of them, then combines and
 * sorts them again.
 * 
 * Runtime:
 *     Best Case: O(n log(n))
 *     Average Case: O(n log(n))
 *     Worst Case: O(n log(n))
 *
 * Memory: O(n) (linear)
 * 
 * @author Anthony Carella
 * </pre>
 */
@SuppressWarnings({"unused", "ManualArrayCopy"})
public class MergeSort {
    /**
     * Entry  point for  this algorithm.  Takes an array,  creates a helper array that is the  same
     * length as the array parameter, and passes the array,  helper array,  start position (0)  and
     * end  position  (<code>arr.length - 1</code>) to the <code>parameters</code> method.
     * 
     * @param arr The array of integers that needs to be sorted.
     */
    public static void sort(int[] arr) {
        int[] helper = new int[arr.length];
        mergeSort(arr, helper, 0, arr.length - 1);
    }

    private static void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(arr, helper, low, middle);
            mergeSort(arr, helper, middle + 1, high);
            merge(arr, helper, low, middle, high);
        }
    }

    private static void merge(int[] arr, int[] helper, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }

        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;

        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] <= helper[helperRight]) {
                arr[current] = helper[helperLeft];
                helperLeft++;
            } else {
                arr[current] = helper[helperRight];
                helperRight++;
            }
            current++;
        }

        int remaining = middle - helperLeft;
        for (int i = 0; i <= remaining; i++) {
            arr[current + i] = helper[helperLeft + 1];
        }
    }

    public static void main(String[] args) {
        int[] arr = {99, 34, 68, 1, 72, 285, 70};
        System.out.println(Arrays.toString(arr));
        MergeSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}