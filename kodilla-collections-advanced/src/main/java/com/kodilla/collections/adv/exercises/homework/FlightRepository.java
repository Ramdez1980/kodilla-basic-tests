package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class FlightRepository {


    public static List<Flight> getFlightsTable() {
        List<Flight> flights = new ArrayList<>();
        flights.add(new Flight("BERLIN", "16:30","15:30" ));
        flights.add(new Flight("WARSAW", "15:50", "14:50" ));
        flights.add(new Flight("AMSTERDAM","16:50", "15:50"));
        flights.add(new Flight("STOKHOLM","13:30", "12:30"));
        return flights;
    }


}
