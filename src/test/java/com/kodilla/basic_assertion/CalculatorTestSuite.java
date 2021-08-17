package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class CalculatorTestSuite { /**/

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        double sumResult = calculator.adingNumber(5, 8);
        assertEquals(13, sumResult,0.1);

    }

    @Test
    public void testSubstract() {
        Calculator calculator = new Calculator();

        double substractResult = calculator.substractNumber(2, 0.88);
        assertEquals(1.12,substractResult,0.1);
    }

    @Test
    public void testPower(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(2.1,2);
        assertEquals(4.43,powerResult,0.01);
    }


}
