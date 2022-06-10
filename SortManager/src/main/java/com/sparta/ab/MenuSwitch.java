package com.sparta.ab;

import com.sparta.ab.sorts.BubbleSorter;
import com.sparta.ab.sorts.MergeSorter;

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
                System.out.println(Arrays.toString(bubble.getSortedArray(arrayToSort)));
                System.out.println("Time taken: ");
                System.out.println(bubble.timeTaken(arrayToSort) + " nanoseconds");
                break;
            case 2:
                System.out.println("I'm sorry, this functionality is not yet working.\n " +
                        "please retry with another sorter, or come back after the weekend");
                break;
            case 3:
               // System.out.println("You have chosen the third sort algorithm");
                MergeSorter merger = new MergeSorter();
               // int[] sortedArray = merger.getSortedArray( arrayToSort, arraySize);
                System.out.println(Arrays.toString(merger.getSortedArray( arrayToSort, arraySize)));
                System.out.println("Time taken: ");
        }
        return null;
    }
}
