package com.sparta.ab;

import com.sparta.ab.view.OutputController;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        System.out.println("Please enter 1 to begin ");
        Scanner getkey = new Scanner(System.in);
        int key = Integer.parseInt(getkey.nextLine());

        while (key == 1) {
            OutputController outputs = new OutputController();
            outputs.output();
            System.out.println("Press 1 to restart, anything else to stop");

            Scanner getKey = new Scanner(System.in);
            key = Integer.parseInt(getKey.nextLine());

        }


    }
}
