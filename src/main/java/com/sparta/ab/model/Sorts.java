package com.sparta.ab.model;

public interface Sorts {

    int[] getSortedArray(int[] unorderedArray, int arraySize);

    long timeTaken(int[] array, int arraySize);

    long timeTaken(int[] array);

}
