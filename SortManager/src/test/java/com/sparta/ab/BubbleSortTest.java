package com.sparta.ab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import com.sparta.ab.sorts.BubbleSorter;

public class BubbleSortTest {

    @Test
    @DisplayName("Check that an array of integers is output")
    void checkAnArrayOutputs(){
        int[] expected = {1,2,3,4};
        BubbleSorter bubble = new BubbleSorter();
        int[] actual =  bubble.getSortedArray(new int[]{1, 2, 3, 4});
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Check that the array of integer is sorted into ascending order")
    void checkAnArrayOutputsAscending(){
        int[] expected = {1,2,3,4};
        BubbleSorter bubble = new BubbleSorter();
        int[] actual = bubble.getSortedArray(new int[]{4, 2, 3, 1});
        Assertions.assertArrayEquals(expected, actual);
    }




}
