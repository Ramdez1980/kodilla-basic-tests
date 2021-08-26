package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;


public class CarUtils {

    public static void describeCar(Car car) {
        System.out.println("-----------------------------");
        System.out.println("Car make " + car.getName());
        System.out.println("Current speed :" + car.getSpeed());

    }

    private static String getCarName(Car car) {
        if (car instanceof Mazda)
            return "Mazda";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Toyota)
            return "Toyota";
        else
            return "Unknown car name";

    }

}
