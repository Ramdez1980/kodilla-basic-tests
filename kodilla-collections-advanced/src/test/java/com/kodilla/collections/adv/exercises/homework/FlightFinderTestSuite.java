package com.kodilla.collections.adv.exercises.homework;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FlightFinderTestSuite {

    @Test
    public void testFindFlightsFrom(){

        // when
        List <Flight> result = Arrays.asList(new Flight("MADRID","WARSAW"));
        // then
        List <Flight> expectedList = new ArrayList<>();
        expectedList.add(new Flight("MADRID", "WARSAW"));
        assertEquals(expectedList, result);
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