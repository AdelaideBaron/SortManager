package com.sparta.ab.controller;


import com.sparta.ab.controller.MenuSwitch;
import com.sparta.ab.model.RandomArray;
import com.sparta.ab.view.OutputMessages;
import com.sparta.ab.view.ProgramStartMessages;


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
        ProgramStartMessages programStart = new ProgramStartMessages();
        RandomArray myArray = new RandomArray();

        arraySize = programStart.getArraySize();
        range = programStart.getRandomLimit();

        int[] arrayToSort = myArray.unorderedArray(arraySize, range);

        programStart.menuDisplayer();
        menuChoice = programStart.getMenuChoice();

        output(arraySize, arrayToSort, menuChoice);
    }


    private static void output(int arraySize, int[] arrayToSort, int menuChoice) {
        //move the below into output
        OutputMessages newOutput = new OutputMessages();
        MenuSwitch chooseAlgorithm = new MenuSwitch();

        newOutput.endOfProgramUnsortedArrayPrinter(arrayToSort);
        chooseAlgorithm.getSortedArray(menuChoice, arraySize, arrayToSort);
        newOutput.chosenMenuChoiceDisplayer(menuChoice);
    }


}
