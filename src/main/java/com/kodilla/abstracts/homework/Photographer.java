package com.kodilla.abstracts.homework;

public class Photographer extends Job{


    public Photographer(int salary, String responsibilities) {
        super(2000, "robi co chce i kiedy chce i jeszcze za to płacą");
    }

    @Override
    public int salary() {
        return 8000;
    }

    @Override
    public String responsibilities() {
        return "1. Wykonywanie zdjęć biznesowych oraz weselnych  \n 2. Korygowanie w programach graficznych typu: \n    a.Photoshop, \n    b.Lightroom. \n 3. spotyka się z klientami ";
    }
}
