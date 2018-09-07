package carellaprojects.algorithms;

public class InsertionSort {
    public int[] sort(int[] arr) {
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
    
    public int[] nestedForSort(int[] arr) {
        int temp;
        for (int i = 1; i < arr.length; i++) {
            for (int k = i; k > 0; k--) {
                if (arr[k - 1] > arr[k]) {
                    temp = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = temp;
                }
            }
        }
        return arr;
    }

    public void printArray(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != (arr.length - 1)) System.out.print(", ");
        }
        System.out.println("}");
    }
}