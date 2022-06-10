package com.sparta.ab;

public class OutputToUser {

    public OutputToUser() {
    }

    public static void chosenMenuChoiceDisplayer(int menuChoice){
        chosenMenuChoicePrinter(menuChoice);
    }


    private static void chosenMenuChoicePrinter(int menuChoice){
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
        String outputChoiceString = "Chosen method: " + chosenOption;
        System.out.println(outputChoiceString); //outputChoiceString;
    }


}
