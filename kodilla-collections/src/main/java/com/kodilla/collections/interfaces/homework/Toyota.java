package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Toyota implements Car {

    private double currentSpeed;

    public Toyota(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String getName() {
        return "Toyota";
    }

    @Override
    public double getSpeed() {
        return currentSpeed ;
    }

    @Override
    public double increaseSpeed() {

        Random random = new Random();
        return currentSpeed + random.nextDouble() * 100 + 1;
    }

    @Override
    public double decreaseSpeed() {

        return currentSpeed / 1.5;
    }
}
