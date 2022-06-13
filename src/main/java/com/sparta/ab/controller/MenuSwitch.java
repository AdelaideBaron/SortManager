package com.sparta.ab.controller;

import com.sparta.ab.model.BinaryTreeSorter;
import com.sparta.ab.model.BubbleSorter;
import com.sparta.ab.model.MergeSorter;

import java.util.Arrays;
public class MenuSwitch {
    public MenuSwitch() {
    }

    public String getSortedArray(int menuChoice, int arraySize, int[] arrayToSort){
        String output = menuChoiceInput(menuChoice, arraySize, arrayToSort);
        return output;
    }

    private static String menuChoiceInput(int menuChoice, int arraySize, int[] arrayToSort) {

        switch (menuChoice){
            case 1:
                BubbleSorter bubble = new BubbleSorter();
                // int[] sortedArray = bubble.getSortedArray(arrayToSort);
                System.out.println(Arrays.toString(bubble.getSortedArray(arrayToSort, 0)));
                System.out.println("Time taken: ");
                System.out.println(bubble.timeTaken(arrayToSort) + " nanoseconds");
                break;
            case 2:
                BinaryTreeSorter tree = new BinaryTreeSorter(arrayToSort[0]);
                System.out.println(Arrays.toString(tree.getSortedArray(arrayToSort, arraySize)));
                System.out.println("Time taken: ");
                System.out.println(tree.timeTaken(arrayToSort, arraySize) + " nanoseconds");
                break;
            case 3:
               // System.out.println("You have chosen the third sort algorithm");
                MergeSorter merger = new MergeSorter();
               // int[] sortedArray = merger.getSortedArray( arrayToSort, arraySize);
                System.out.println(Arrays.toString(merger.getSortedArray( arrayToSort, arraySize)));
                System.out.println("Time taken: ");
                System.out.println(merger.timeTaken(arrayToSort, arraySize) + " nanoseconds");
        }
        return null;
    }
}
