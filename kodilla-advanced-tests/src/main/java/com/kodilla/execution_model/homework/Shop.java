package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;


public class Shop {

    private Set<Order> orders = new HashSet<>();

    public void add(Order order) {
        orders.add(order);
    }

    public List<Order> get(LocalDate startDate, LocalDate endDate) {
        return orders.stream()
                .filter(order -> order.getDate().isAfter(startDate) && order.getDate().isBefore(endDate))
                .collect(Collectors.toList());
    }

    public List<Order> get(double minValue, double maxValue) {
        return orders.stream()
                .filter(order -> order.getOrderValue() > minValue && order.getOrderValue() < maxValue)
                .collect(Collectors.toList());
    }

    public int count() {
        return orders.size();
    }

    public double sum() {
        return orders.stream()
                .mapToDouble(order -> order.getOrderValue())
                .sum();
    }

}