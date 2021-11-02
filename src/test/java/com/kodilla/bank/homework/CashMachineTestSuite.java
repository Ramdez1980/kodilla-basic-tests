package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {



        @Test
        public void shouldHaveZeroLength() {
            CashMachine cashMachines = new CashMachine();
            int[] transactions = cashMachines.getTransactions();
            assertEquals(0, transactions.length);
        }

        @Test
        public void shouldAddElementsToArray() {
            CashMachine cashMachines = new CashMachine();
            cashMachines.add(400);
            cashMachines.add(200);

            int[] transactions = cashMachines.getTransactions();
            assertEquals(2, transactions.length);
            assertEquals(400, transactions[0]);
            assertEquals(200, transactions[1]);
        }
    }



