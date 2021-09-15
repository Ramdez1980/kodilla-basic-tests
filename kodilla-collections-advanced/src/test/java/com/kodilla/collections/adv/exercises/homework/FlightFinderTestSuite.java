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
    public void testFindFlightsTo(){

        List <Flight> result = Arrays.asList(new Flight("MADRID","WARSAW"));
        // then
        List <Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("MADRID", "WARSAW"));
        assertEquals(expectedList, result);
    }

}