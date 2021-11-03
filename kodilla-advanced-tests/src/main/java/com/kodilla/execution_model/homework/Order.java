package com.kodilla.execution_model.homework;

public class Order {
    private double orderValue;
    private double date;
    private String customerLogin;

    public Order(double orderValue, double date, String customerLogin) {
        this.orderValue = orderValue;
        this.date = date;
        this.customerLogin = customerLogin;
    }

    public double getOrderValue() {
        return orderValue;
    }

    public double getDate() {
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

}
