package com.kodilla.inheritance.homework;

public class AplicationOperSystem {
    public static void main(String[] args) {




        Windows windows = new Windows(1980);
        windows.turnOn();
        windows.turnOff();

        Linux linux = new Linux(2000);
        linux.turnOn();
        linux.turnOff();

    }


}
