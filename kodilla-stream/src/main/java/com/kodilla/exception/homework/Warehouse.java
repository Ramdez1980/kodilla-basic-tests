package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public Order getOrder(String number){
        return getOrder("1/2021") ;
    }
    public void addOrder(Order order) {
        orders.add(order);
    }


}
