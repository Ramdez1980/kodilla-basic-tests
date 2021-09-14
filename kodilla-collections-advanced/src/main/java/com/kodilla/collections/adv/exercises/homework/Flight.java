package com.kodilla.collections.adv.exercises.homework;

import java.util.Objects;

public class Flight {
    private String airport;
    private String departure;
    private String arrival;

    public Flight(String airport,String departure, String arrival) {
        this.airport = airport;
        this.departure = departure;
        this.arrival = arrival;


    }

    public String getDeparture() {
        return departure;
    }

    public String getArrival() {
        return arrival;
    }

    public String getAirport() {
        return airport;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Flight flight = (Flight) o;
        return Objects.equals(airport, flight.airport) && Objects.equals(departure, flight.departure) && Objects.equals(arrival, flight.arrival);
    }

    @Override
    public int hashCode() {
        return Objects.hash(airport, departure, arrival);
    }

    @Override
    public String toString() {
        return "Flight{" +
                "airport='" + airport + '\'' +
                ", departure='" + departure + '\'' +
                ", arrival='" + arrival + '\'' +
                '}';
    }
}


