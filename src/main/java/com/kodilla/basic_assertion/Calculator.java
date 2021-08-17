package com.kodilla.basic_assertion;

public class Calculator {

    int result;

    double adingNumber(double numberA, double numberB) {
        return numberA + numberB;
    } /**/

    double substractNumber(double numberA, double numberB) {
        return numberA - numberB;

    }

    double power(double numberC, double numberD)                              //zadanie domowe 3.5.2//
    {
        if (numberC > 0) {
            return Math.pow(numberC, numberD);                             //zadanie domowe 3.5.2//
        } else if (numberC == 0) {
            return 0;
        } else if (numberC < 0) {
            return Math.pow(numberC, numberD);

        }
        return Math.pow(numberC, numberD);
    }
}






