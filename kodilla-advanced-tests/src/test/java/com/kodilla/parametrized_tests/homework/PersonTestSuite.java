package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class PersonTestSuite {

   private Person person = new Person(1.80,50);

    @Test
    public void testBMI() {
        assertEquals("Very severely underweight", Person.getBMI(1.80, 45));
        assertEquals("Severely underweight", Person.getBMI(1.77, 50));
        assertEquals("Underweight", Person.getBMI(1.85, 60));
        assertEquals("Normal (healthy weight)", Person.getBMI(1.85, 70));
        assertEquals("Overweight", Person.getBMI(1.8, 90));
        assertEquals("Obese Class I (Moderately obese)", Person.getBMI(1.8, 100));
        assertEquals("Obese Class II (Severely obese)", Person.getBMI(1.8, 120));
        assertEquals("Obese Class III (Very severely obese)", Person.getBMI(1.7, 130));
        assertEquals("Obese Class IV (Morbidly obese)", Person.getBMI(1.65, 135));
        assertEquals("Obese Class V (Super obese)", Person.getBMI(1.65, 150));

    }

}


