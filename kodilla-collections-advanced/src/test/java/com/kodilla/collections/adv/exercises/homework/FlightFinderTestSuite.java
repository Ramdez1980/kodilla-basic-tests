package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    private FlightFinder flightFinder = new FlightFinder();

    @Test
    public void testFindFlightsFromWhenFlightExist(){
        //given
        List<Flight> expected = Arrays.asList(new Flight("BERLIN", "WARSAW"));
        // when
        List<Flight> result = flightFinder.findFlightsFrom("BERLIN");
        // then
        assertEquals(expected,result);
    }

    @Test
    public void testFindFlightsFromWhenFlightDoesNotExist(){
        //given
        List<Flight> expected = Arrays.asList(new Flight("BERLIN", "WARSAW"));
        // when
        List<Flight> result = flightFinder.findFlightsFrom("ROME");
        // then
        assertEquals(expected,result);
    }

    @Test
    public void testFindFlightsToWhenFlightExist(){
        //given
        List<Flight> expected = Arrays.asList(new Flight("STOKHOLM", "BERLIN"));
        // when
        List<Flight> result = flightFinder.findFlightsTo("BERLIN");
        // then
        assertEquals(expected,result);
    }

    @Test
    public void testFindFlightsToWhenFlightDoesNotExist(){
        //given
        List<Flight> expected = Arrays.asList();
        // when
        List<Flight> result = flightFinder.findFlightsTo("MONACO");
        // then
        assertEquals(expected,result);
    }

}