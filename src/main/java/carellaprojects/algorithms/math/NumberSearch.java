package carellaprojects.algorithms.math;

import java.util.Arrays;

public class NumberSearch {
    public static int findXHighestNumber(int[] arr, int xHighestNumber) {
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
        int[] arr = {1,9,2,8,3};
        System.out.println(NumberSearch.findXHighestNumber(arr, 5));
    }
}
