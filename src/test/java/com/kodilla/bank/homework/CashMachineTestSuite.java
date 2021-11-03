package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    CashMachine cashMachines = new CashMachine();

    @Test
    public void shouldHaveZeroLength() {
        int[] transactions = cashMachines.getTransactions();
        assertEquals(0, transactions.length);
    }

    @Test
    public void shouldCountNumberOfTransactionsEvenIfInvalidTransactionTriedToBeMade() {

        cashMachines.addTransaction(50);
        cashMachines.addTransaction(-100);
        cashMachines.addTransaction(20);
        cashMachines.addTransaction(-20);
        cashMachines.addTransaction(10);
        assertEquals(4, cashMachines.getTransactions().length);
    }


    @Test
    public void shouldCalcBalanceEvenIfInvalidTransactionTriedToBeMade(){

        cashMachines.addTransaction(50);
        cashMachines.addTransaction(-100);
        cashMachines.addTransaction(20);
        cashMachines.addTransaction(-20);
        cashMachines.addTransaction(10);
        assertEquals(60, cashMachines.getBalance());
    }

    @Test
    public void shouldReturnBalanceEqualsZeroIfEmpty(){

        cashMachines.addTransaction(50);
        cashMachines.addTransaction(100);
        cashMachines.addTransaction(20);
        cashMachines.addTransaction(-20);
        cashMachines.addTransaction(-150);
        assertEquals(0, cashMachines.getBalance());
    }

    @Test
    public void shouldReturnBalanceEqualsZeroIfNoTransactionsWereMade(){

        assertEquals(0, cashMachines.getBalance());
    }

    @Test
    public void shouldReturnAverageEqualsZeroIfNoTransactionsWereMade(){

        assertEquals(0.0, cashMachines.getAvgDeposit() + cashMachines.getAvgWithdrawals(), 0.01);
    }

    @Test
    public void shouldNotCountWithdrawTransactionIfEmpty(){

        cashMachines.addTransaction(0);
        cashMachines.addTransaction(0);
        cashMachines.addTransaction(0);
        assertEquals(0,cashMachines.getNumberOfWithdrawals());
    }

    @Test
    public void shouldNotCountWithdrawTransactionIfNotEnoughMoney(){

        cashMachines.addTransaction(50);
        cashMachines.addTransaction(-100);
        cashMachines.addTransaction(100);
        cashMachines.addTransaction(-200);
        cashMachines.addTransaction(100);
        cashMachines.addTransaction(-50);
        cashMachines.addTransaction(-20);
        assertEquals(2,cashMachines.getNumberOfWithdrawals());
    }

    @Test
    public void shouldReturnAverageDepositEqualsZeroIfNoDeposits(){

        assertEquals(0.0, cashMachines.getAvgDeposit(), 0.01);
    }

    @Test
    public void shouldReturnAverageWithdrawalEqualsZeroIfNoWithdrawals(){

        cashMachines.addTransaction(50);
        cashMachines.addTransaction(100);
        cashMachines.addTransaction(200);
        cashMachines.addTransaction(20);
        assertEquals(0.0, cashMachines.getAvgWithdrawals(), 0.02);
    }

}
