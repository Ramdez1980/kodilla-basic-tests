package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
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
    public void increaseSpeed() {
        currentSpeed = currentSpeed  + 15;
    }

    @Override
    public void decreaseSpeed() {
        currentSpeed = currentSpeed - 10;
    }


}
