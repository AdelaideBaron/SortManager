package com.sparta.ab.model.sortingAlgorithms;

public class MergeSorter implements Sorts {

    public MergeSorter() {
    }

    @Override
    public int[] getSortedArray(int[] arrayToSort, int arraySize){
        return mergeSort(arrayToSort, arraySize);
    }

    @Override
    public long timeTaken(int[] array, int arraySize) {
        long start = System.nanoTime();
        mergeSort(array, arraySize);
        long finish = System.nanoTime();
        long timeTaken = start - finish;
        return timeTaken;
    }

    @Override
    public long timeTaken(int[] array) {
        return 0;
    }


    public static int[] mergeSort(int[] arrayToSort, int arraySize) {
        if (arraySize >= 2) {
            int mid = arraySize / 2;
            int[] l = new int[mid];
            int[] r = new int[arraySize - mid];

            for (int i = 0; i < mid; i++) {
                l[i] = arrayToSort[i];
            }
            for (int i = mid; i < arraySize; i++) {
                r[i - mid] = arrayToSort[i];
            }
            mergeSort(l, mid);
            mergeSort(r, arraySize - mid);

            merge(arrayToSort, l, r, mid, arraySize - mid);
        }
        return arrayToSort;
    }

    public static void merge(int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;

        while (i < left && j < right) {

            if (l[i] <= r[j])
                a[k++] = l[i++];
            else
                a[k++] = r[j++];

        }

        while (i < left)
            a[k++] = l[i++];

        while (j < right)
            a[k++] = r[j++];
    }
}
