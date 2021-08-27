package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Mazda(120));
        cars.add(new Toyota(120));
        cars.add(new Opel(120));




        for (Car car : cars) {
            System.out.println("-----------------------------");
            System.out.println("Car make " + car.getName());
            System.out.println("Current speed :" + car.getSpeed());
        }

    }
}