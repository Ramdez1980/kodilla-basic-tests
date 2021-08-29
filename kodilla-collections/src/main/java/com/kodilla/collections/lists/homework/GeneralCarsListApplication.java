package com.kodilla.collections.lists.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mazda;
import com.kodilla.collections.interfaces.homework.Opel;
import com.kodilla.collections.interfaces.homework.Toyota;

import java.util.LinkedList;
import java.util.List;


public class GeneralCarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        Mazda mazda = new Mazda(120);
        cars.add(mazda);
        cars.add(new Toyota(120));
        cars.add(new Opel(120));

        cars.remove(1);
        cars.remove(mazda);

        System.out.println(cars.size());


        for (Car car : cars) {
            System.out.println(car + ", name: " + car.getName() +
                    ", speed: " + car.getSpeed());

        }
    }

}
