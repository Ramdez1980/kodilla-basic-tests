package com.kodilla.collections.adv.exercises.homework;

import java.util.*;


public class FlightFinder {

    Map< String, List<Flight>> flightFinder = new HashMap<>();


    public void addFlight(String airport, Flight flight){
        List<Flight> flights =
                flightFinder.getOrDefault(airport,new ArrayList<>());
        flights.add(flight);
        flightFinder.put(airport, flights);
    }

    public List<Flight> findFlightsFrom(String airport){
        return flightFinder.getOrDefault(airport,Collections.emptyList());
    }


    public List<Flight> findFlightsTo(String airport){
        return flightFinder.getOrDefault(airport,Collections.emptyList());
    }




}
