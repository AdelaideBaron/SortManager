package com.sparta.ab;

import java.util.Scanner;

public class UserInput {
    int arraySize;
    int menuChoice;
    String optionOne;
    String optionTwo;
    String optionThree;

    public UserInput() {
            }

    public static void main(String[] args) {
        int arraySize = 5; //again want to be the output of getArraySize
        // int menuChoice = 2; //change to output of getMenuChoice
        String optionOne = "Bubble Sort";
        String optionTwo = "Binary Tree";
        String optionThree = "Third Option";
        setArraySizeFromUser();
        menuDisplay(optionOne, optionTwo, optionThree);
        // getMenuChoice();


        //trouble putting values from set/getArray size and menu choice into the below
        arraySizePrinter(5);
        menuChosenChoicePrinter(3);
    }

    public int setMenuChoice(){
        return getMenuChoice();
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
        Scanner getMenuChoice = new Scanner(System.in); //creating the object arraySize
        int menuChoice = Integer.parseInt(getMenuChoice.nextLine());
        return menuChoice;
    }

    public int getArraySize(){
        return userInputArraySize();
    }

    private static int setArraySizeFromUser() {
        int arraySize = userInputArraySize();
        return arraySize;
        // System.out.println("Array size is: " + arraySize);
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

    private static void menuChosenChoicePrinter(int menuChoice){ //should really go in another class
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
        } //need something in place for menu choice > 3, < 1 - although should be prevented/caught elsewhere
        System.out.println("Chosen method: " + chosenOption);
    }

    private static void arraySizePrinter(int arraySize){ //if remove void and put int, could get size?
        System.out.println("Array size is: " + arraySize);
    }


}
