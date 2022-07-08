package com.sparta.ab.model.sortingAlgorithms;

public class BubbleSorter implements Sorts {

    public BubbleSorter() {
    }


    @Override
    public long timeTaken(int[] array) {
        return bubbleSortTimer(array);
    }

    @Override
    public long timeTaken(int[] array, int arraySize) {
        return 0;
    }

    @Override
    public int[] getSortedArray(int[] unorderedArray, int arraySize){
        return bubbleSort(unorderedArray);
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

            int numberAtPosition = array[i];
            if (array[i] < array[i - 1]) {
                array[i] = array[i - 1];
                array[i - 1] = numberAtPosition;
            }
        }
    }

}
