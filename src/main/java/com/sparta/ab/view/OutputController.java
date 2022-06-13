package com.sparta.ab.view;


import com.sparta.ab.controller.MenuSwitch;
import com.sparta.ab.model.RandomArray;

import java.util.Arrays;


public class OutputController
{

    public OutputController(){

    }

    public void output(){
        programOutputs();
    }

    private static void programOutputs() {
        int arraySize;
        int range = 1;
        int menuChoice;
        InputMessages newInput = new InputMessages();
        RandomArray myArray = new RandomArray();

        System.out.println("\n");
        System.out.println("*** Sort Manager ***");
        arraySize = newInput.getArraySize();
        range = newInput.getRandomLimit();

        int[] arrayToSort = myArray.unorderedArray(arraySize, range);

        newInput.menuDisplayer();
        menuChoice = newInput.getMenuChoice();

        output(arraySize, arrayToSort, menuChoice);
    }


    private static void output(int arraySize, int[] arrayToSort, int menuChoice) {
        //move the below into output

        MenuSwitch chooseAlgorithm = new MenuSwitch();

        System.out.println("Unsorted Array: ");
        System.out.println(Arrays.toString(arrayToSort));
        System.out.println("Sorted Array: ");
        chooseAlgorithm.getSortedArray(menuChoice, arraySize, arrayToSort);

        OutputMessages newOutput = new OutputMessages();
        newOutput.chosenMenuChoiceDisplayer(menuChoice);
    }


}
