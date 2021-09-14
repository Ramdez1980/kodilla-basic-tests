package com.kodilla.collections.adv.exercises.homework;

import java.util.*;


public class FlightFinder {

    Map< String, List<Flight>> flightFinder = new HashMap<>();


    public List <Flight> findFlightsFrom(String arrival){
        List <Flight>  flights = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(arrival)) {
                flights.add(flight);
            }
        }
        return flights;
    }


    public List<Flight> findFlightsTo (String departure){
        List <Flight> flights = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                flights.add(flight);
            }
        }
        return flights;
    }
}
