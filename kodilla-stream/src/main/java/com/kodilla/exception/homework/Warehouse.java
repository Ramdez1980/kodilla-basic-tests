package com.kodilla.exception.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Warehouse {
    private List<Order> orders = new ArrayList<>();

    public Order getOrder(String number){
        return getOrder(number) ;
    }
    public void addOrder(Order order) {
        orders.add(order);
    }

    public String doesOrderExist (String number) throws OrderDoesntExistException {
        if (orders.contains(number)) {
            return String.valueOf(getOrder("number"));
        }
        throw new OrderDoesntExistException();

    }


}
