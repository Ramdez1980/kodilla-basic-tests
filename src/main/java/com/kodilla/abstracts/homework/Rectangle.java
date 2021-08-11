package com.kodilla.abstracts.homework;

public class Rectangle extends Shape{

    public Rectangle() {
        super(5, 10, 0);
    }

    @Override
    public int area(int sideA, int sideB, int height) {
        return sideA * sideB;
    }

    @Override
    public int perimeter(int sideA, int sideB, int height) {
        return 2*(sideA+sideB);
    }


}
