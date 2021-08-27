package com.kodilla.collections.interfaces.homework;

import java.util.Objects;
import java.util.Random;

public class Mazda implements Car {

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
    public void increaseSpeed() {
       currentSpeed = currentSpeed + 30;
    }

    @Override
    public void decreaseSpeed() {
        currentSpeed = currentSpeed - 20;
    }

    @Override
    public String toString() {
        return "Mazda{" +
                "currentSpeed=" + currentSpeed +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mazda mazda = (Mazda) o;
        return Double.compare(mazda.currentSpeed, currentSpeed) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(currentSpeed);
    }


}