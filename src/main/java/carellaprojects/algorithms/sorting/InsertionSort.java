package carellaprojects.algorithms.sorting;

import java.util.Arrays;

/**
 * Insertion Sort Sorting Algorithm
 * Explanation:
 *     Insertion sort "inserts" the lesser of two numbers where the number belongs.
 *     It loops through each element in an array of integers. For the position of each  of
 *     the elements,  loop backwards to the beginning of the array.  For each element that
 *     is being loop backwards on,  compare that element to the previous element.  If  the
 *     current element is less than the previous element,  swap the two; store the current
 *     element in a variable (temp),  place the previous element in the  current element's
 *     position, and place the temp variable in the previous element's position.
 * Runtime:
 *     Best Case: O(n) (linear)
 *     Average Case: O(n^2) (quadratic)
 *     Worst Case: O(n^2) (quadratic)
 * Memory:
 *     O(1) (constant)
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