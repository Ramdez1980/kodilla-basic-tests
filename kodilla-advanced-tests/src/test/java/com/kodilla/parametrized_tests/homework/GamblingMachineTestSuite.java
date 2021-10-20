package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

public class GamblingMachineTestSuite {

    private GamblingMachine gamblingMachine = new GamblingMachine();

    @ParameterizedTest
    @CsvFileSource(resources = "/sixRandomNumbersFromFourtyNineFalse.csv", delimiter = ';')
    public void shouldThrowException(String numbers) {
        Set<Integer> nums = parse(numbers);
        assertThrows(InvalidNumbersException.class, () -> gamblingMachine.howManyWins(nums));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/sixRandomNumbersFromFourtyNineTrue.csv", delimiter = ';')
    public void shouldReturnNumber(String numbers) throws InvalidNumbersException {
        Set<Integer> nums = parse(numbers);
        int result = gamblingMachine.howManyWins(nums);
        assertTrue(result >= 0 && result <=6);
    }

    private static Set<Integer> parse(String str) {
        return Arrays.stream(str.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toSet());
    }
}



