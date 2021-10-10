package com.kodilla.spring.basic.spring_dependency_injection.homework;


import org.springframework.stereotype.Component;

@Component
public class Calculator {


    private Display display;

    public Calculator(Display display) {
        this.display = display;
    }

    double add(double a, double b) {
        return  a + b;
    }

    double substract(double a, double b) {
        return  a - b;
    }

    double multiply(double a, double b) {
        return  a * b;
    }

    double divide(double a, double b) {
        return  a / b;
    }




}
