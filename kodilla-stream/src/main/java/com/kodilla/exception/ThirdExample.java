package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args)  {
        AirportRepository airportRepository = new AirportRepository();
        boolean isVienaInUse = false;
        try {
            isVienaInUse = airportRepository.isAirportInUse("Vienna");
        } catch (AirportNotFoundException e) {
            System.out.println("Sorry, this airport cannot be served by our airlines." );
        }
        System.out.println("Thank you for using Kodilla Airlines");
    }

}
