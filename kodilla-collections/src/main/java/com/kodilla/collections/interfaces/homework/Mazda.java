package com.kodilla.collections.interfaces.homework;

import java.util.Random;

public class Mazda implements Car {
    private double currentSpeed;
    /*private double highSpeed;*/



    public Mazda(double currentSpeed/*, double highSpeed*/) {
        this.currentSpeed = currentSpeed;
        /*this.highSpeed = highSpeed;*/

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
       Random random = new Random();
        return currentSpeed + random.nextDouble() * 100 + 1/*currentSpeed * 1.3*/ ;
    }

    @Override
    public double decreaseSpeed() {
        return  currentSpeed / 2 ;
    }
}
