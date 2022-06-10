package com.sparta.ab;


import java.util.Arrays;


public class App
{
    public static void main( String[] args )
    {
        int arraySize;
        int range = 100; //this will be set to user input
        UserInput newInput = new UserInput();
        arraySize = newInput.getArraySize();
        RandomArray myArray = new RandomArray();

        newInput.menuDisplayer();

        int menuChoice = newInput.getMenuChoice();


        output(arraySize, range, myArray, menuChoice);


    }


    //the below will be extracted to another class
    private static void output(int arraySize, int range, RandomArray myArray, int menuChoice) {
        //move the below into output
        System.out.println("Unsorted Array: ");

        int[] arrayToSort = myArray.unorderedArray(arraySize, range);

        System.out.println(Arrays.toString(arrayToSort));

        MenuSwitch chooseAlgorithm = new MenuSwitch();

        System.out.println("Sorted Array: ");

        chooseAlgorithm.getSortedArray(menuChoice, arraySize, arrayToSort);

        OutputToUser newOutput = new OutputToUser();
        newOutput.chosenMenuChoiceDisplayer(menuChoice);
    }
}
