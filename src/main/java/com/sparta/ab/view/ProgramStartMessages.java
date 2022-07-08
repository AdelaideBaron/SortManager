package com.sparta.ab.view;

import java.util.Scanner;

public class ProgramStartMessages {

    public ProgramStartMessages() {
    }

    public int startProgram(){
        System.out.println("*** Sort Manager ***");
        System.out.println("\n");
        System.out.println("Please enter 1 to begin ");

        Scanner getkey = new Scanner(System.in);
        int key = Integer.parseInt(getkey.nextLine());
        return key;
    }

    public int rerunProgram(){
        System.out.println("Enter 1 to restart, enter anything else to stop");
        Scanner getKey = new Scanner(System.in);
        int key;
        String keyInput = getKey.nextLine();
        boolean isKeyInt = isKeyInt(keyInput);
        return keyValue(keyInput);
    }

    private int keyValue(String keyInput) {
        int key;
        boolean isKeyInt = isKeyInt(keyInput);
        if (isKeyInt){
            Integer.parseInt(keyInput);
            if(Integer.parseInt(keyInput) == 1){
                key = 1;
            } else{
                key = 0;
            }
            return key;
        } else{
            key = 0;
            return key;
        }
    }

    public boolean isKeyInt(String keyInput){
            try {
                Integer.parseInt(keyInput);
                return true;
            } catch (NumberFormatException ex) {
                return false;
            }

    }

    public void menuDisplayer(){
        String optionOne = "Bubble Sort";
        String optionTwo = "Binary Tree";
        String optionThree = "Merge Sort";
        menuDisplay(optionOne, optionTwo, optionThree);
    }

    public int getMenuChoice() {
       return getMenuChoiceFromUser();
    }

    private int getMenuChoiceFromUser() {
        System.out.println("Please enter a menu choice: ");
        Scanner getMenuChoice = new Scanner(System.in);
        int menuChoice = Integer.parseInt(getMenuChoice.nextLine());
        return menuChoice;
    }

    public int getRandomLimit() {return getRandomLimitFromUser(); }

    private int getRandomLimitFromUser(){
        System.out.println("What is the maximum single value you would like in your random array? ");
        Scanner getLimit = new Scanner(System.in);
        int limit = Integer.parseInt(getLimit.nextLine());
        return limit;
    }

    public int getArraySize(){
        return userInputArraySize();
    }

    private static int setArraySizeFromUser() {
        int arraySize = userInputArraySize();
        return arraySize;
    }

    private static int userInputArraySize() {
        System.out.println("Enter the size of array you wish to generate and sort: ");
        Scanner getArraySizeFromUser = new Scanner(System.in);
        int arraySize = Integer.parseInt(getArraySizeFromUser.nextLine());
        return arraySize;
    }

    private static void menuDisplay(String optionOne, String optionTwo, String optionThree){
        System.out.println("Sorting Algorithm Menu: " );
        System.out.println("1. " + optionOne);
        System.out.println("2. " + optionTwo);
        System.out.println("3. " + optionThree);
    }

    private static void menuChosenChoicePrinter(int menuChoice){
        String optionOne = "Bubble Sort";
        String optionTwo = "Binary Tree";
        String optionThree = "Third Option";
        String chosenOption = "";
        if(menuChoice == 1){
            chosenOption = optionOne;
        } else if (menuChoice == 2) {
            chosenOption = optionTwo;
        } else if (menuChoice == 3){
            chosenOption = optionThree;
        }
        System.out.println("Chosen method: " + chosenOption);
    }

    private static void arraySizePrinter(int arraySize){ //if remove void and put int, could get size?
        System.out.println("Array size is: " + arraySize);
    }


}
