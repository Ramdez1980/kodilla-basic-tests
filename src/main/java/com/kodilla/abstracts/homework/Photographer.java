package com.kodilla.abstracts.homework;

public class Photographer extends Job {


    public Photographer() {
        super(2000, "1. Wykonywanie zdjęć biznesowych oraz weselnych" +
                " \n 2. Korygowanie w programach graficznych typu:" +
                " \n a.Photoshop," +
                " \n b.Lightroom. " +
                " \n 3. spotyka się z klientami ");
    }

    @Override
    public String jobName() {
        return "Photographer";
    }

}


