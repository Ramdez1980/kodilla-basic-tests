package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Toyota;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {

    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15) + 1];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }

    private static Car drawCar() {
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
