package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private double sideA;

    public Square(double sideA) {
        this.sideA = sideA;
    }


    @Override
    public double area() {
        return sideA*sideA;
    }

    @Override
    public double perimeter(){
        return 2*sideA;
    }
}
