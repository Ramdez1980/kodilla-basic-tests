package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Mazda implements Car{

    private double currentSpeed;

    public Mazda(double currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    @Override
    public String getName() {
        return "Mazda";
    }

    @Override
    public double getSpeed() {
        return currentSpeed;
    }

    @Override
    public double increaseSpeed() {
        {return currentSpeed * 1.3; }
    }

    @Override
    public double decreaseSpeed() {

        return currentSpeed / 1.2;
    }
}
