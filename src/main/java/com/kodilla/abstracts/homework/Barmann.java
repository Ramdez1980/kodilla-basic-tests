package com.kodilla.abstracts.homework;

public class Barmann extends Job{


    public Barmann() {
        super(2000, "1. Przyjmowanie zamówień \n 2. Nalewanie drinków \n 3. Wykonywanie zadań zleconych przez Kierownika zmiany");    }


    @Override
    public String jobName() {
    return   "Barmann" ;
    }

}

