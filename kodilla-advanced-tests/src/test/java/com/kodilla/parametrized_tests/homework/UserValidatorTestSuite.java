package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {

    private UserValidator validator = new UserValidator();

   @ParameterizedTest
   @CsvSource(value = {"RAmdez12345"})
    public void shouldValidateUsername(String username) {
        assertTrue(validator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"1$23456TSa,d"})
    public void shouldInvalidateUsername(String username) {
        assertFalse(validator.validateUsername(username));
    }

    @ParameterizedTest
    @CsvSource(value = {"jan.nowakow.gmail.com"})
    public void shouldInvalidateEmailAdress(String email) {
        assertFalse(validator.validateEmail(email));
    }

    @ParameterizedTest
    @CsvSource(value = {"jan.nowakow@gmail.com"})
    public void shouldValidateEmailAdress(String email) {
        assertTrue(validator.validateEmail(email));
    }
}
