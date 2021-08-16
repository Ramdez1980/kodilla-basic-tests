package com.kodilla.abstracts.homework;

public class Parallelogram extends Shape {


        private double sideA;
        private double sideB;
        private double height;

        public Parallelogram(double sideA, double sideB, double height) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideB = height;
        }


        @Override
        public double area() {
            return sideA * sideB;
        }

        @Override
        public double perimeter() {
            return 2 * sideA + 2 * sideB;
        }
    }