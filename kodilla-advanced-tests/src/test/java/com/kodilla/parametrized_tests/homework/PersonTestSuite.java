package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.homework.SourcesForBmi#provideNumbersForTestingBmi")
    public void shouldCalculateBmi(double height, double weight, String expected) {
        // given
        Person person = new Person(height, weight);

        // when
        String result = person.getBMI();

        // then
        assertEquals(expected, result);
    }

}


