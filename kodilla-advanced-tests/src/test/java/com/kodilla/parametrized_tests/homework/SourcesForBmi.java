package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;


public class SourcesForBmi {

        static Stream<Arguments> provideNumbersForTestingBmi() {
            return Stream.of(
                    Arguments.of(2.1, 45, ""),
                    Arguments.of(1.8, 45, "Very severely underweight"),
                    Arguments.of(1.77, 50, ""),
                    Arguments.of(1.85, 60, ""),
                    Arguments.of(1.8, 90, ""),
                    Arguments.of(1.8, 100, ""),
                    Arguments.of(1.8, 120, ""),
                    Arguments.of(1.65, 135, ""),
                    Arguments.of(1.65, 150, "")
            );
        }
    }

