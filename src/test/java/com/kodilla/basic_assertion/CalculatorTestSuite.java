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
    public void testForPositiveBaseAndPositivePower(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(2.1,2);
        assertEquals(4.42,powerResult,0.01);

    }

    @Test
    public void testForZeroBaseAndPositivePower(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(0,2);
        assertEquals(0, powerResult,0.01);
    }

    @Test
    public void testForNegativeBaseAndPositivePower(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(-2,2);
        assertEquals(4, powerResult,0.01);
    }

    @Test
    public void testForPositiveBaseAndNegativePower(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(2,-1);
        assertEquals(0.5, powerResult,0.01);
    }

    @Test
    public void testForPositiveBaseAndZeroPower(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(2,0);
        assertEquals(1, powerResult,0.01);
    }

    @Test
    public void testForZeroBaseAndZeroPower(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(0,0);
        assertEquals(1, powerResult,0.01);
    }

    @Test
    public void testForNegativeBaseAndNegativePower(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(-2,-1);
        assertEquals(-0.5, powerResult,0.01);
    }

    @Test
    public void testForNegativeBaseAndNegativePowerMinusTwo(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(-2,-2);
        assertEquals(0.25, powerResult,0.01);
    }


    @Test
    public void testForNegativeBaseAndZeroPower(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(-2,0);
        assertEquals(1, powerResult,0.01);
    }

    @Test
    public void testForNegativeBaseAndPositivePowerMinusThird(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(-2,3);
        assertEquals(-8, powerResult,0.01);
    }

    @Test
    public void testFoZeroBaseAndNegativePower(){
        Calculator calculator = new Calculator();

        double powerResult = calculator.power(0,-1);
        assertEquals(0, powerResult,0.01);
    }










}
