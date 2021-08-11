package com.kodilla.abstracts.homework;

public  class Square extends Shape{

    public Square() {
        super(2,5,0);
    }

    @Override
    public int area(int sideA, int sideB, int height) {
        return sideA*sideA;
    }

    @Override
    public int perimeter(int sideA, int sideB, int height) {
        return 4*sideA;
    }

}
