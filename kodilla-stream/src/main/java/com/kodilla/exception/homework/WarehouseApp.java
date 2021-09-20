package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class WarehouseApp {
    public static void main(String[] args) {


        List<Order> orders = new ArrayList<>();
        for (Order order : Warehouse.addOrder()) {
            String number = order.getNumber();
            orders.add(order);
        }
    }
}
