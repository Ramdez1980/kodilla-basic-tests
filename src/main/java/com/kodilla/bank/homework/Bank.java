package com.kodilla.bank.homework;




public class Bank {

    private String name;
    private CashMachine cashMachine;
    private CashMachine firstCashMachine;
    private CashMachine secondCashMachine;
    private CashMachine thirdCashMachine;
    private int size;


    public Bank() {
        this.firstCashMachine = new CashMachine();
        this.secondCashMachine = new CashMachine();
        this.thirdCashMachine = new CashMachine();
    }

    public int addFirstCashMachineTransactions (int transaction){
         this.firstCashMachine.add(transaction);

        return transaction;
    }

    public double addSecondCashMachineTransactions (){
         return this.secondCashMachine.sumOfTransactions()/*add(transaction)*/;

    }

    public void addThirdCashMachineTransactions (int transaction){
            this.thirdCashMachine.add(transaction);
    }

    public double getFirstCashMachineTransactions() {
        return this.firstCashMachine.getAverage();

    }

    public double getSecondCashMachineTransactions() {
        return this.secondCashMachine.getAverage();
    }

    public double getThirdCashMachineTransactions() {
        return this.thirdCashMachine.getAverage();
    }


}