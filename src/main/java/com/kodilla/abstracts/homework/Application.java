package com.kodilla.abstracts.homework;

public class Application {

    public static void main(String[] args) {


            Square square = new Square(1);

            System.out.println("Obwod kwadratu wynosi:" + square.perimeter());
            System.out.println("Pole kwadratu wynosi:" + square.area());


            Rectangle rectangle = new Rectangle(1,2);

            System.out.println("\n" +"Obwod prostokata wynosi:" + rectangle.perimeter() );
            System.out.println("Pole prostokata wynosi:" + rectangle.area());

            Parallelogram parallelogram = new Parallelogram(1,2,3);

            System.out.println("\n" + "Obwod równoległoboku wynosi:" + parallelogram.perimeter());
            System.out.println("Pole równoległoboku wynosi:" + parallelogram.area());

            Circle circle = new Circle(3.54);

            System.out.println("\n" + "Obwod koła wynosi:" + circle.perimeter());
            System.out.println("Pole koła wynosi:" + circle.area());

        }
    }

