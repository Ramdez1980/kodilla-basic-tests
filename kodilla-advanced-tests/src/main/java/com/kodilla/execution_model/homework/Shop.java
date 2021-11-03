package com.kodilla.execution_model.homework;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Shop {

    LocalDate current = LocalDate.now();
    LocalDate oneYear = current.minusYears(1);
    int max = 0;
    int min = 500;

    private List<Order> orders = new ArrayList<>();

   public void addOrder(Order order) {
        this.orders.add(order);
    }


   public Order orderDate(LocalDate current, LocalDate oneYear) {
        if (current.isAfter(oneYear)) {
        }
        return null;
    }

    public double getMaxValue() {
        int a = 0;
        if (a < min) {
            min = a;
        }
        return min;
    }

    public void getMinValue() {
        int a = 0;
        if (a > max) {
            max = a;
        }
        return;

    }

    public int getSize() {
        return this.orders.size();
    }

    public double sum() {
        int sum = 0;
        for (int i = 0; i < orders.size(); i++) {
            sum += orders.get(i).getOrderValue();
        }
        return sum;
    }


}
