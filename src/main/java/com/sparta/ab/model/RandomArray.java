package com.sparta.ab.model;

import java.util.Arrays;
import java.util.Random;

public class RandomArray {


  //  int[] unorderedRandomArray;

    public RandomArray() {
    }

    public int[] unorderedArray(int arraySize, int range) {
        return randomArrayGenerator(arraySize, range);
    }

    public static void getRandomArray(int arraySize, int range) {
        System.out.println(randomArrayGenerator(arraySize, range));
    }

    public static void getRandomArrayStringOutput(int arraySize, int range) {
        String outputUnorderedArray = Arrays.toString(randomArrayGenerator(arraySize, range));
        System.out.println(outputUnorderedArray);
    }

    private static int[] randomArrayGenerator(int arraySize, int range) {
        Random random = new Random();
        int[] unorderedRandomArray = new int[arraySize]; //will need to change this to take arraySize
        for( int i = 0; i < unorderedRandomArray.length; i++){
            unorderedRandomArray[i] = random.nextInt(range + 1);
        }
        return unorderedRandomArray;

    }



}
