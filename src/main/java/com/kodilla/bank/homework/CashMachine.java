package com.kodilla.bank.homework;


public class CashMachine {

    private int[] transactions;
    private int balance;
    private int size;
    private int depositSize;
    private int withdrawalSize;
    private String name;

    public CashMachine() {
        this.transactions = new int[0];
        this.balance = balance;
        this.size = 0;
        this.depositSize = depositSize;
        this.withdrawalSize = withdrawalSize;
        this.name = name;
    }

    public void add(int value) {
        this.size++;
        int[] newTransactions = new int[this.size];
        System.arraycopy(transactions, 0, newTransactions, 0, transactions.length);
        newTransactions[this.size - 1] = value;
        this.transactions = newTransactions;

    }

    public int[] getTransactions() {
        return transactions;
    }

    public double getAverage() {
        if (this.transactions.length == 0) {
            return 0;
        }
        double sum = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            sum += this.transactions[i];
        }
        return sum / this.transactions.length;
    }

    public int sumOfTransactions() {
        int counter = 0;
        for (int i = 0; i < this.transactions.length; i++) {
            counter += this.transactions[i];

        }
        return counter;

    }
}
