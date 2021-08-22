package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {

    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = carSpeed();
        for (Car car : cars)
            CarUtils.displayCarInfo(car);

        }

    private static Car carSpeed() {
        Random random = new Random();

        int drawCarKind = random.nextInt(3);
        if (drawCarKind == 0)
            return new Mazda(130);
        else if (drawCarKind == 1)
            return new Opel(120);
        else
            return new Toyota(120);

    }


}
