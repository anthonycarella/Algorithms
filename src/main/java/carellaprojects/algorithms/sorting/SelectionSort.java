package carellaprojects.algorithms.sorting;

import java.util.Arrays;

/**
 * Selection Sort Sorting Algorithm
 * Explanation:
 *     Selection sort "selects"  the smallest number in the  array and puts it at the beginning  of
 *     the place of the array that the algorithm is at.
 *     Here,  the algorithm is finding the smallest  number and placing it a  whichever part of the
 *     array it is iterating on.  For i = 0 and as long as i  is less than the array's  length, the
 *     algorithm then  iterates through the rest of the array (variable j)  and compares the  index
 *     of i to j.  If j is less than the index,  then whichever part of the array j  was on becomes
 *     the  new index.  At the end  of j's iteration,  index will hold the  smallest number in  the
 *     rest of the array.
 *     The index variable then  switches with whatever i originally was,  and i moves on to the next
 *     part of the array.
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