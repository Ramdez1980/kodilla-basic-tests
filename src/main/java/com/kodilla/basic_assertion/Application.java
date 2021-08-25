package com.kodilla.basic_assertion;
public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        double numberA = 5; //**/
        double numberB = 8;
        double numberC = 9;
        double numberD = 2;
        double sumResult = calculator.adingNumber(numberA, numberB);
        double subResult = calculator.substractNumber(numberA, numberB); // zadanie domowe 3.5.1//
        double powerResult = calculator.power(numberC, numberD);

        boolean correct = ResultChecker.assertEquals(13, sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + numberA + " i " + numberB);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + numberA + " i " + numberB);
        }

        boolean correctSubstract = ResultChecker.assertEquals(-3, subResult);                // zadanie domowe 3.5.1//
        if (correctSubstract) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + numberA + " i " + numberB); // zadanie domowe 3.5.1//
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + numberA + " i " + numberB); // zadanie domowe 3.5.1//
        }

        boolean correctPower = ResultChecker.assertEquals(81,powerResult);
        if (correctPower) {
            System.out.println("Metoda potegowania do kwadratu  działa poprawnie dla liczb " + numberC + " i " + numberD);
        } else {
            System.out.println("Metoda potegowania do kwadratu  nie działa poprawnie dla liczb " + numberC + " i " + numberD);
        }
    }
}