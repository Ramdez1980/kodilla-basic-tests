package com.kodilla.abstracts;

public class Dog extends Animal {


    public Dog(int numberOfLegs) {
        super(5);
    }

    @Override
    public void giveVoice() {
        System.out.println("how how");
    }
}
