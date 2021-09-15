package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightRepository {

    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("BERLIN", "WARSAW"));
        flights.add(new Flight("WARSAW", "AMSTERDAM" ));
        flights.add(new Flight("AMSTERDAM","STOKHOLM"));
        flights.add(new Flight("STOKHOLM","BERLIN"));
        return flights;
    }
}
