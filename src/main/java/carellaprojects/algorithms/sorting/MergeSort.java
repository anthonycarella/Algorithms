package carellaprojects.algorithms.sorting;

import java.util.Arrays;

/**
 * Merge Sort Sorting Algorithm
 * Runtime: 
 *     Best Case: O(n log(n))
 *     Average Case: O(n log(n))
 *     Worst Case: O(n log(n))
 * Memory: O(n) (linear)
 * 
 * @author Anthony Carella
 *
 */
public class MergeSort {
    public static void mergeSort(int[] arr) {
        int[] helper = new int[arr.length];
        int low = 0;
        int high = arr.length - 1;
        mergeSort(arr, helper, low, high);
    }
    
    public static void mergeSort(int[] arr, int[] helper, int low, int high) {
        if (low < high) {
            int middle = (low + high) / 2;
            mergeSort(arr, helper, low, middle);
            mergeSort(arr, helper, middle + 1, high);
            merge(arr, helper, low, middle, high);
        }
    }
    
    public static void merge(int[] arr, int[] helper, int low, int middle, int high) {
        for (int i = low; i <= high; i++) {
            helper[i] = arr[i];
        }
        
        int helperLeft = low;
        int helperRight = middle + 1;
        int current = low;
        
        while (helperLeft <= middle && helperRight <= high) {
            if (helper[helperLeft] < helper[helperRight]) {
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
            arr[current + i] = helper[helperLeft + i];
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {99, 34, 68, 1, 72, 285, 70};
        System.out.println(Arrays.toString(arr));
        mergeSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}