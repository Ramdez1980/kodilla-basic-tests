package com.kodilla.inheritance.homework;

public class SystemWindowsOn extends OperatingSystem {

    public void Chrome() {
        System.out.println("Chrome...");
    }

    @Override
    public void turnOn() {
        System.out.println("Turn On Windows system");
    }

    public void turnOff() {
        System.out.println("Turn Off Windows system");
    }

    public SystemWindowsOn(int YearOfPublication)
        {
            super(YearOfPublication);
        }


    }

