package carellaprojects.launcher;

import carellaprojects.algorithms.InsertionSort;

public class App {
    public static void main(String[] args) {
        int[] numbersArray = {9, 2, 7, 3, 5};
        InsertionSort insertionSort = new InsertionSort();
        insertionSort.printArray(numbersArray);
        int[] sortedArray = insertionSort.sort((numbersArray));
        insertionSort.printArray(sortedArray);
    }
}
