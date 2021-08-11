package com.kodilla.abstracts.homework;

public class Person {
    String job;



    public static void main(String[] args) {
        String[] firstName = new String[] {"Jan", "Katarzyna", "Alicja"};
        int[] age = new int[] { 40 , 35 , 29 };



    Photographer photographer = new Photographer( 0,"");

    System.out.println(firstName[1] + " lat " + age[1] + " posiada następujące obowiązki:\n "+ photographer.responsibilities() + "\n Miesieczne wynagrodzenie to  " + photographer.salary() + " złotych netto" );

    Barmann barmann = new Barmann(0, "");

    System.out.println("\n"  + firstName[2] + " lat " + age[2] + " posiada następujące obowiązki:\n "+ barmann.responsibilities() + "\n Płacą jej za to " + barmann.salary() + " złotych netto" );


    }



}
