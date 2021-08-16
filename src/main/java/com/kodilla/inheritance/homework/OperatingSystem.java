package com.kodilla.inheritance.homework;

public class OperatingSystem {

    private int YearOfPublication;

    public void turnOn() {
        System.out.println("System is turned on");
    }

    public void turnOff() {
        System.out.println("System is turned off");
    }

    public OperatingSystem(int YearOfPublication) {
        this.YearOfPublication = YearOfPublication;
    }

    public int getYearOfPublication() {
        return YearOfPublication;
    }

}