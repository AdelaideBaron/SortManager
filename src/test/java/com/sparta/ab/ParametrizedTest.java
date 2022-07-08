package com.sparta.ab;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParametrizedTest {

    @ParameterizedTest(name = "[{index}] Testing for value = {arguments}")
    @ValueSource(ints = {2,3,4,5,6,7,8,9,10, 11})
    @DisplayName("Basic Parameterized Test")
    void basicParameterizedTest(int number){
        Assertions.assertTrue(number < 5);
    }
}
