package com.kodilla.abstracts.homework;

public class Parallelogram extends Shape {
    int result = 0;

    public Parallelogram() {
        super(10, 10, 10);
    }

    @Override
    public int perimeter(int sideA, int sideB, int height)
    {
    result = 2*sideA + 2*sideB  ;
        return result ;
    }

    @Override
    public int area(int sideA, int sideB, int height) {
        return sideA * height;
    }
}
