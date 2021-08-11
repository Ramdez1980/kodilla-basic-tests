package com.kodilla.abstracts.homework;

public class Barmann extends Job{


    public Barmann(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    @Override
    public int salary() {
        return 5000;
    }

    @Override
    public String responsibilities() {
        return "1. Przyjmowanie zamówień \n 2. Nalewanie drinków \n 3. Wykonywanie zadań zleconych przez Kierownika zmiany";
    }
}
