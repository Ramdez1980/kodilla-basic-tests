package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {
    GamblingMachineTestSuite randomNumbers = new GamblingMachineTestSuite();
    /*private boolean InvalidNumbersException;
    private boolean howManyWins;*/

    @ParameterizedTest
    @CsvFileSource(resources = "/sixRandomNumbersFromFourtyNineFalse.csv", numLinesToSkip = 1)
    public void shouldReverseFalseTest(int Number, int RandomNumber) {
       assertFalse(randomNumbers.);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sixRandomNumbersFromFourtyNineTrue.csv", numLinesToSkip = 1)
    public void shouldReverseTrueTest(int Number, int RandomNumber) {
        if(   Number >= 0 && Number <=6 )
            assertTrue();
        }

    }

}


