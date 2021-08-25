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
    public double increaseSpeed() {

        {return currentSpeed * 1.1; }
    }

    @Override
    public double decreaseSpeed() {

        return currentSpeed / 1.5;
    }

    //4.3//


    @Override
    public String toString() {
        return "Toyota{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toyota toyota = (Toyota) o;
        return Double.compare(toyota.currentSpeed, currentSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentSpeed);
    }
}
