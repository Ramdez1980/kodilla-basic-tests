package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.List;

public class WarehouseApp {
    public static void main(String[] args) {
            ArrayList<Order> orders  = new ArrayList<>();
            orders.add(new Order("1/2021"));
            orders.add(new Order("2/2021"));
            orders.add(new Order("3/2021"));
            orders.add(new Order("4/2021"));
            orders.add(new Order("5/2021"));



        for (Order order :  ) {
            String number = order.getNumber();
            orders.add(order);
        }
    }
}
