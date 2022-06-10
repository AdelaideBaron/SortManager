package com.sparta.ab.sorts;

import com.sparta.ab.logs.runtimeExceptionCatcher;

public class BubbleSorter implements Sorts{

    public BubbleSorter() {
    }

    @Override //not sure this has been done correctly
    public int[] getSortedArray() {
        return new int[0];
    }

    public long timeTaken(int[] array) {
        return bubbleSortTimer(array);
    }

    public int[] getSortedArray(int[] array){
        return bubbleSort(array);
    }

    private static long bubbleSortTimer(int[] array){
        long start = System.nanoTime();
        int arrayLength = array.length;
        for (int j = 1; j < arrayLength; j++) {
            sorter(array, arrayLength);
        }
        long finish = System.nanoTime();
        long timeTaken = finish - start;
        return timeTaken;
    }

    private static int[] bubbleSort(int[] array){
        int arrayLength = array.length;
        for (int j = 1; j < arrayLength; j++) {
            sorter(array, arrayLength);
        }
        return array;
    }

    private static void sorter(int[] array, int arrayLength) {
        for (int i = 1; i < arrayLength; i++) {
           // logger.log(Level.INFO, "iterating through comparing sizes");
            int numberAtPosition = array[i];
            if (array[i] < array[i - 1]) {
                array[i] = array[i - 1];
                array[i - 1] = numberAtPosition;
            }
        }
    }

    //add the logging bits too, runtimeExceptionCatcher etc.
}
