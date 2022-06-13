package com.sparta.ab.view;

public class OutputMessages {

    public OutputMessages() {
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
        } else {
            chosenOption = "please stop and re-select a valid method";
        }
        String outputChoiceString = "Chosen method: " + chosenOption;
        System.out.println(outputChoiceString);
    }


    public static void main(String[] args) {
        chosenMenuChoicePrinter(4);
    }


}
