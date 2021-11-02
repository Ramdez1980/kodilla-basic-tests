package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;


public class SourcesForBmi {

        static Stream<Arguments> provideNumbersForTestingBmi() {
            return Stream.of(
                    Arguments.of(1.8, 45, "Very severely underweight"),
                    Arguments.of(1.8, 50, "Severely underweight"),
                    Arguments.of(1.77, 55, "Underweight"),
                    Arguments.of(1.85, 70, "Normal (healthy weight)"),
                    Arguments.of(1.75, 80, "Overweight"),
                    Arguments.of(1.8, 100, "Obese Class I (Moderately obese)"),
                    Arguments.of(1.8, 120, "Obese Class II (Severely obese)"),
                    Arguments.of(1.75, 135, "Obese Class III (Very severely obese)"),
                    Arguments.of(1.77, 150, "Obese Class IV (Morbidly obese)"),
                    Arguments.of(1.65, 150, "Obese Class V (Super obese)"),
                    Arguments.of(1.70, 180, "Obese Class VI (Hyper obese)")
            );
        }
    }

/*

public String getBMI() {
        double bmi = weightInKilogram / (heightInMeters * heightInMeters);
        if (bmi < 15) {
            return "Very severely underweight";
        } else if (bmi < 16) {
            return "Severely underweight";
        } else if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi < 25) {
            return "Normal (healthy weight)";
        } else if (bmi < 30) {
            return "Overweight";
        } else if (bmi < 35) {
            return "Obese Class I (Moderately obese)";
        } else if (bmi < 40) {
            return "Obese Class II (Severely obese)";
        } else if (bmi < 45) {
            return "Obese Class III (Very severely obese)";
        } else if (bmi < 50) {
            return "Obese Class IV (Morbidly obese)";
        } else if (bmi < 60) {
            return "Obese Class V (Super obese)";
        }
        return "Obese Class VI (Hyper obese)";
    }
 */