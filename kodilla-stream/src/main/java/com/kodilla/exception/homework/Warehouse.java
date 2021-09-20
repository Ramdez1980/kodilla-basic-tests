package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class Warehouse {
    public static List<Order> addOrder() {
        List<Order> orders = new ArrayList<>();
        orders.add(new Order("1/2021"));
        orders.add(new Order("2/2021"));
        orders.add(new Order("3/2021"));
        orders.add(new Order("4/2021"));
        orders.add(new Order("5/2021"));

        return orders;
    }

    public static Order getOrder(String number) {
        return getOrder("6/2021");
    }






}
