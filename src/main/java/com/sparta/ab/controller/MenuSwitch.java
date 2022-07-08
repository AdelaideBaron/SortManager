package com.sparta.ab.controller;

import com.sparta.ab.model.sortingAlgorithms.BinaryTreeSorter;
import com.sparta.ab.model.sortingAlgorithms.BubbleSorter;
import com.sparta.ab.model.sortingAlgorithms.MergeSorter;
import com.sparta.ab.view.OutputMessages;

import java.util.Arrays;
public class MenuSwitch {

    public static OutputMessages newOutput;
    public MenuSwitch() {
    }

    public String getSortedArray(int menuChoice, int arraySize, int[] arrayToSort){
        String output = menuChoiceInput(menuChoice, arraySize, arrayToSort);
        return output;
    }

    private static String menuChoiceInput(int menuChoice, int arraySize, int[] arrayToSort) {

        newOutput = new OutputMessages();

        switch (menuChoice){
            case 1:
                newOutput.bubblePrinter(arrayToSort);
                break;
            case 2:
                newOutput.binaryTreePrinter(arrayToSort, arraySize);
                break;
            case 3:
                newOutput.mergePrinter(arrayToSort, arraySize);
                break;
        }
        return null;
    }
}
