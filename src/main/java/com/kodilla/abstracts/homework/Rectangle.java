package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{
    private double sideA;
    private double sideB;


    public Rectangle(double sideA, double sideB) {
        this.sideA = sideA;
        this.sideB = sideB;
    }


    @Override
    public double area() {
        return sideA*sideB;
    }

    @Override
    public double perimeter(){
        return 2*sideA + 2*sideB;
    }


}
