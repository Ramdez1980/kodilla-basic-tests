package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldCalculateCorrectsum() {
        Bank bank = new Bank();

        CashMachine FirstCashMachine = new CashMachine();
        CashMachine SecondCashMachine = new CashMachine();
        CashMachine ThirdCashMachine = new CashMachine();

        bank.addFirstCashMachineTransactions(100);
        bank.addFirstCashMachineTransactions(100);
        bank.addFirstCashMachineTransactions(200);

        bank.addSecondCashMachineTransactions(200);
        bank.addSecondCashMachineTransactions();
        bank.addSecondCashMachineTransactions();
/*
        bank.addThirdCashMachineTransactions(100);
        bank.addThirdCashMachineTransactions(100);
        bank.addThirdCashMachineTransactions(100);
*/
        int firstCashMachineSum = bank.addFirstCashMachineTransactions(400);
        /*double secondCashMachineSum = bank.getSecondCashMachineTransactions();*/
        double secondCashMachineSum = bank.addSecondCashMachineTransactions();
        double thirdCashMachineSum = bank.getThirdCashMachineTransactions();


        assertEquals(400, firstCashMachineSum, 0.01);
        assertEquals(600, secondCashMachineSum, 0.01);
        assertEquals(300, thirdCashMachineSum, 0.01);

    }
}

