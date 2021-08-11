package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {


        Square square = new Square();

        System.out.println("obwod kwadratu wynosi:" + square.perimeter(2,0,0));
        System.out.println("pole kwadratu wynosi:" + square.area(2,0, 0));


        Rectangle rectangle = new Rectangle();

        System.out.println("obwod prostokata wynosi:" + rectangle.perimeter(50,50,0) );
        System.out.println("pole prostokata wynosi:" + rectangle.area(50,50,0));

        Parallelogram parallelogram = new Parallelogram();

        System.out.println("obwod równoległoboku wynosi:" + parallelogram.perimeter(10,10,10));
        System.out.println("pole równoległoboku wynosi:" + parallelogram.area(10,10,10));

}
}
