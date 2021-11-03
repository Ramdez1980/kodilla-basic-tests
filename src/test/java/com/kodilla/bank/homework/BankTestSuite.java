package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BankTestSuite {

    @Test
    public void shouldReturnNumberDevices(){
        Bank bank = new Bank(2);
        assertEquals(2, bank.getNumberOfDevices());
    }

    @Test
    public void shouldCountNumberAllTransactions(){
        Bank bank = new Bank(2);
        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        assertEquals(7, bank.getTotalNumberOfDeposits() + bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCountTotalBalance(){
        Bank bank = new Bank(2);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        assertEquals(290, bank.getTotalBalance());
    }

    @Test
    public void shouldCountNumberAllDeposits(){
        Bank bank = new Bank(2);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        assertEquals(6, bank.getTotalNumberOfDeposits());
    }

    @Test
    public void shouldCountNumberAllWithdrawals(){
        Bank bank = new Bank(2);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -100);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, 200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        assertEquals(1, bank.getTotalNumberOfWithdrawals());
    }

    @Test
    public void shouldCalcAverageAllDeposits(){
        Bank bank = new Bank(4);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);

        assertEquals(30.83, bank.getTotalAvgDeposits(), 0.01);
    }

    @Test
    public void shouldCalcAverageAllWithdrawals(){
        Bank bank = new Bank(4);

        bank.addTransaction(0, 50);
        bank.addTransaction(0, 100);
        bank.addTransaction(0, -80);
        bank.addTransaction(0, 10);

        bank.addTransaction(1, 100);
        bank.addTransaction(1, -200);
        bank.addTransaction(1, 100);
        bank.addTransaction(1, 10);


        assertEquals(20.00, bank.getTotalAvgWithdrawals(), 0.01);
    }
}
