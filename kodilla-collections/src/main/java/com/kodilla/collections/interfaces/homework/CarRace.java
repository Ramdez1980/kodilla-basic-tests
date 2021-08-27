package com.kodilla.collections.interfaces.homework;

public class CarRace {

    public static void main(String[] args) {
        Mazda mazda = new Mazda(120);
        doRace(mazda);

        Opel opel = new Opel (130);
        doRace(opel);

        Toyota toyota = new Toyota (180);
        doRace(toyota);
    }


    private static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println("Current speed: "  + car.getSpeed()  + " km/h");

    }
}
