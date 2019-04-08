package carellaprojects.algorithms.math;

import java.util.Arrays;

/**
 * Find the highest number in an array of integers
 * Explanation:
 *     Pass an array of integers,  and the X highest number (xHighestNumber as a variable)
 *     you would like  to find in that array as  parameters to a method.  This method will
 *     sort an array, then choose the X number from the end of the array.  For example, if
 *     you pass 0  as xHighestNumber,  the algorithm will  find the highest  number in the
 *     array of integers.
 *
 * @author Anthony Carella
 *
 */
public class NumberSearch {
    public static int findXHighestNumber(int[] arr, int xHighestNumber) {
        if (xHighestNumber == 0) xHighestNumber = 1;
        System.out.println("Unsorted array : " + Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println("Sorted array   : " + Arrays.toString(arr));
        if (xHighestNumber > arr.length) {
            System.out.println("Warning: " + xHighestNumber + " is too big. Returning lowest numnber in sorted array...");
            return arr[0];
        }
        return arr[arr.length - xHighestNumber];
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 9, 2, 8, 3};
        System.out.println("Highest Number: " + NumberSearch.findXHighestNumber(arr, 0));
    }
}
