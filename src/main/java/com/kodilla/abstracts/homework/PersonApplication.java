package com.kodilla.abstracts.homework;


public class PersonApplication  {
    public static void main(String[] args) {
        Kasia kasia = new Kasia();
        Alicja alicja = new Alicja();
        Barmann barmann = new Barmann();
        Photographer photographer = new Photographer();

        System.out.println("\n W skład firmy XYZ wchodzą pracownik o imieniu: " +
                           "\n " + kasia.firstName() +
                           "\n zatrudniony na stanowisku " + kasia.job() +
                           "\n lat: " +  kasia.age() +
                           "\n Zakres obowiązków: \n "
                           + barmann.getResponsibilities());

        System.out.println("\n W skład firmy XYZ wchodzą pracownik o imieniu: " +
                           "\n " + alicja.firstName() +
                           "\n zatrudniona na stanowisku " + alicja.job() +
                           "\n lat: " +  alicja.age() +
                           "\n Zakres obowiązków: \n " +
                           photographer.getResponsibilities());



    }
}
