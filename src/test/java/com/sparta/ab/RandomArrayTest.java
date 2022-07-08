package com.sparta.ab;

import com.sparta.ab.model.RandomArray;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomArrayTest {

    //test that I can output a random array of length 5

    @Test
    @DisplayName("Check that I can output an array of given length")
    void checkAnArrayOutputs(){
        int[] expected = {0,0,0,0,0};
        RandomArray random = new RandomArray();
        int[] actual = random.unorderedArray(5,0);
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Check that ")
    void checkThat (){
    }


    //test that I can
}
