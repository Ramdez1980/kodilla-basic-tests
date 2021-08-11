package com.kodilla.abstracts.homework;

public abstract class Shape {

    private int sideA;
    private int sideB;
    private int height;



    public Shape(int sideA, int sideB, int height) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.height = height;

    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }
    public int getHeight() {
        return height;
    }


    public abstract int perimeter(int sideA, int sideB, int height );



    public abstract int area(int sideA, int sideB, int height);
}