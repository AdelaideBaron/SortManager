package com.sparta.ab.model;

public interface Sorts {
    //something that all sorters do
    int[] getSortedArray(int[] unorderedArray, int arraySize);

    long timeTaken(int[] array, int arraySize);

    long timeTaken(int[] array);
    //getInt and returnIntArray perhaps?

   // long timeTaken();
}
