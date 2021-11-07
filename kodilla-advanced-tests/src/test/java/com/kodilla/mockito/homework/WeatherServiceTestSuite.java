package com.kodilla.mockito.homework;


import com.kodilla.notification.homework.Location;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Set;
import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherServiceTestSuite {

    private WeatherService weatherService = new WeatherService();

    @Test
    public void should_addSubscriberToLocations() {

        // given
        Subscriber subscriber = Mockito.mock(Subscriber.class);
        Location location = Mockito.mock(Location.class);
        Set<Subscriber> expected = new HashSet<>();
        expected.add(subscriber);

        // when
        weatherService.addSubscriberToLocations(subscriber, location);

        // then
        assertEquals(expected, weatherService.getLocationSubscribers().get(location));
    }

    @Test
    public void should_removeWeatherSubscriber() {

        // given
        Subscriber subscriber1 = Mockito.mock(Subscriber.class);
        Subscriber subscriber2 = Mockito.mock(Subscriber.class);
        Location location = Mockito.mock(Location.class);
        weatherService.addSubscriberToLocations(subscriber1, location);
        weatherService.addSubscriberToLocations(subscriber2, location);
        Set<Subscriber> expected = new HashSet<>();
        expected.add(subscriber2);

        // when
        weatherService.removeWeatherSubscriber(subscriber1, location);

        // then
        assertEquals(expected, weatherService.getLocationSubscribers().get(location));
    }

    @Test
    public void should_removeAllLocations() {

        // given
        Subscriber subscriber1 = Mockito.mock(Subscriber.class);
        Subscriber subscriber2 = Mockito.mock(Subscriber.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        weatherService.addSubscriberToLocations(subscriber1, location1);
        weatherService.addSubscriberToLocations(subscriber1, location2);
        weatherService.addSubscriberToLocations(subscriber2, location1);
        weatherService.addSubscriberToLocations(subscriber2, location2);

        Set<Subscriber> subscribers = new HashSet<>();
        subscribers.add(subscriber2);
        Map<Location, Set<Subscriber>> expected = new HashMap<>();
        expected.put(location1, subscribers);
        expected.put(location2, subscribers);

        // when
        weatherService.removeAllLocations(subscriber1);

        // then
        assertEquals(expected, weatherService.getLocationSubscribers());
    }

    @Test
    public void should_sendWeatherNotification() {
        // Given
        Location location = Mockito.mock(Location.class);
        WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);
        Subscriber subscriber = Mockito.mock(Subscriber.class);

        weatherService.addSubscriberToLocations(subscriber, location);

        // When
        weatherService.sendWeatherNotification(weatherNotification, location);

        // Then
        Mockito.verify(subscriber).send(weatherNotification);
    }

    @Test
    public void should_sendToAll() {
        // Given
        WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        Subscriber subscriber1 = Mockito.mock(Subscriber.class);
        Subscriber subscriber2 = Mockito.mock(Subscriber.class);

        weatherService.addSubscriberToLocations(subscriber1, location1);
        weatherService.addSubscriberToLocations(subscriber2, location1);
        weatherService.addSubscriberToLocations(subscriber2, location2);

        // When
        weatherService.sendToAll(weatherNotification);

        // Then
        Mockito.verify(subscriber1, Mockito.times(1)).send(weatherNotification);
        Mockito.verify(subscriber2, Mockito.times(1)).send(weatherNotification);
    }

    @Test
    public void should_removeLocation() {
        // Given
        Location location1 = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        Subscriber subscriber = Mockito.mock(Subscriber.class);

        weatherService.addSubscriberToLocations(subscriber, location1);
        weatherService.addSubscriberToLocations(subscriber, location2);

        Set<Subscriber> subscribers = new HashSet<>();
        subscribers.add(subscriber);
        Map<Location, Set<Subscriber>> expected = new HashMap<>();
        expected.put(location2, subscribers);

        // When
        weatherService.removeLocation(location1);

        // Then
        assertEquals(expected, weatherService.getLocationSubscribers());
    }
}
