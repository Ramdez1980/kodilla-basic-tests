package com.kodilla.execution_model.homework;

import java.time.LocalDate;
import java.util.Objects;

public class Order {
    private double orderValue;
    private LocalDate date;
    private String customerLogin;

    public Order(double orderValue, LocalDate date, String customerLogin) {
        this.orderValue = orderValue;
        this.date = date;
        this.customerLogin = customerLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getCustomerLogin() {
        return customerLogin;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", date=" + date +
                ", customerLogin='" + customerLogin + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return Double.compare(order.getOrderValue(), getOrderValue()) == 0 && getDate().equals(order.getDate()) && getCustomerLogin().equals(order.getCustomerLogin());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getOrderValue(), getDate(), getCustomerLogin());
    }
}
