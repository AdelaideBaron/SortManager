package com.sparta.ab.sorts;

public class MergeSorter implements Sorts {
    @Override
    public int[] getSortedArray() {
        return new int[0];
    }

    public MergeSorter() {
    }

    public int[] getSortedArray(int[] arrayToSort, int arraySize){
        return mergeSort(arrayToSort, arraySize);
    }

    public static void main(String[] args) {
        int[] arrayToSort = { 5, 1, 6, 2, 3, 4 };
        mergeSort(arrayToSort, arrayToSort.length);
        for (int i = 0; i < arrayToSort.length; i++)
            System.out.println(arrayToSort[i]);
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
