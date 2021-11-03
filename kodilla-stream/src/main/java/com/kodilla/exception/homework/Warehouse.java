package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public Order getOrder(String number) throws OrderDoesntExistException {
        return orders.stream()
                .filter(order -> number.equals(order.getNumber()))
                .findFirst()
                .orElseThrow(() -> new OrderDoesntExistException());
    }

    public void addOrder(Order order) {
        orders.add(order);
    }
}
