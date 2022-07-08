package com.sparta.ab.controller;

import com.sparta.ab.view.ProgramStartMessages;

public class Controller {
    public Controller() {
    }

    public void runProgram(){
        ProgramStartMessages programStart = new ProgramStartMessages();
        OutputController outputs = new OutputController();

        int key = programStart.startProgram();

        while (key == 1) {
            outputs.output();
            key = programStart.rerunProgram();
        }

    }

}
