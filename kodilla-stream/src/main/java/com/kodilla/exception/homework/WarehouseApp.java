package com.kodilla.exception.homework;

import com.kodilla.exception.AirportNotFoundException;

import java.util.ArrayList;

public class WarehouseApp {

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addOrder(new Order("1/2021"));
        warehouse.addOrder(new Order("2/2021"));
        warehouse.addOrder(new Order("3/2021"));
        warehouse.addOrder(new Order("4/2021"));
        warehouse.addOrder(new Order("5/2021"));

        String number = "100/2021";

        try {
            warehouse.getOrder(number);
        } catch (OrderDoesntExistException exception) {
            System.out.println("Order with number " + number + " does not exist");
        }
    }
}
