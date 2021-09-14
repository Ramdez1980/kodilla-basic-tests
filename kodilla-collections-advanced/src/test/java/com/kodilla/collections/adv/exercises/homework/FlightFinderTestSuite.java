package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom(){
      Flight flight = new Flight("BERLIN", "WARSAW");
        // when
         List<Flight> result = flight.getDeparture();
        // then
        List <Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("BERLIN", "WARSAW"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindFlightsTo(){

    }

}