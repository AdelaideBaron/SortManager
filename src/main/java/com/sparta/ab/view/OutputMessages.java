package com.sparta.ab.view;

import com.sparta.ab.model.sortingAlgorithms.BinaryTreeSorter;
import com.sparta.ab.model.sortingAlgorithms.BubbleSorter;
import com.sparta.ab.model.sortingAlgorithms.MergeSorter;

import java.util.Arrays;

public class OutputMessages {

    public OutputMessages() {
    }

    public void endOfProgramUnsortedArrayPrinter(int[] arrayToSort){
        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println("Sorted Array: ");
    }

    //use generics to combine

    public  void bubblePrinter(int[] arrayToSort){
        BubbleSorter bubble = new BubbleSorter();
        System.out.println(Arrays.toString(bubble.getSortedArray(arrayToSort, 0)));
       // System.out.println("Time taken: ");
       // System.out.println(bubble.timeTaken(arrayToSort) + " nanoseconds");
    }

    public void binaryTreePrinter(int[] arrayToSort, int arraySize){
        BinaryTreeSorter tree = new BinaryTreeSorter(arrayToSort[0]);
        System.out.println(Arrays.toString(tree.getSortedArray(arrayToSort, arraySize)));
      //  System.out.println("Time taken: ");
      //  System.out.println(tree.timeTaken(arrayToSort, arraySize) + " nanoseconds");
    }

    public void mergePrinter(int[] arrayToSort, int arraySize){
        MergeSorter merger = new MergeSorter();
        System.out.println(Arrays.toString(merger.getSortedArray( arrayToSort, arraySize)));
      //  System.out.println("Time taken: ");
      //  System.out.println(merger.timeTaken(arrayToSort, arraySize) + " nanoseconds");
    }


    public static void chosenMenuChoiceDisplayer(int menuChoice){
        chosenMenuChoicePrinter(menuChoice);
    }


    private static void chosenMenuChoicePrinter(int menuChoice){
        String optionOne = "Bubble Sort";
        String optionTwo = "Binary Tree";
        String optionThree = "Merge Sort";
        String chosenOption = "";
        if(menuChoice == 1){
            chosenOption = optionOne;
        } else if (menuChoice == 2) {
            chosenOption = optionTwo;
        } else if (menuChoice == 3){
            chosenOption = optionThree;
        } else {
            chosenOption = "please stop and re-select a valid method";
        }
        String outputChoiceString = "Chosen method: " + chosenOption;
        System.out.println(outputChoiceString);
    }


    //REMOVE TO TIDY
    public static void main(String[] args) {
        chosenMenuChoicePrinter(4);
    }


}
