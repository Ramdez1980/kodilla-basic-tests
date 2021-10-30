package com.kodilla.mockito.homework;


import com.kodilla.notification.homework.Location;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import java.util.Set;
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
        Location location = Mockito.mock(Location.class);
        Location location1 = Mockito.mock(Location.class);
        Set<Location> expected = new HashSet<>();
        expected.add(location1);

        // when
        weatherService.removeLocation(location);

        // then
        assertEquals(expected,weatherService.getLocationSubscribers().get(location));
    }

    @Test
    public void should_sendWeatherNotification() {
        Location location = Mockito.mock(Location.class);
        Location location2 = Mockito.mock(Location.class);
        Location location3 = Mockito.mock(Location.class);
        Subscriber subscriber = Mockito.mock(Subscriber.class);
        Subscriber subscriber2 = Mockito.mock(Subscriber.class);
        Subscriber subscriber3 = Mockito.mock(Subscriber.class);

        weatherService.addSubscriberToLocations(subscriber, location);
        weatherService.addSubscriberToLocations(subscriber2,location);
        weatherService.addSubscriberToLocations(subscriber3,location);
        WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);


        weatherService.sendWeatherNotification(weatherNotification,location);
        Mockito.verify(location, Mockito.times(55)).receiveWeather(weatherNotification);

    }







//
//    @Test
//    public void noSubscreiberShouldNotReceiveWeatherNotification() {
//        weatherService.sendWeatherNotification(weatherNotification,location);
//        Mockito.verify(location, Mockito.never()).receiveWeather(weatherNotification);
//    }
//
//    @Test
//    public void subscribedClientShouldReceiveWeatherNotification() {
//        weatherService.addSubscriberToLocations(subscriber, location);
//        weatherService.sendWeatherNotification(weatherNotification,location);
//     /*Mockito.verify(subscriber, Mockito.times(1)).receive(weatherNotification);*/
//    }
//
//    @Test
//    public void notificationShouldBeSentToAllSubscribedWeatherClients() {
//        Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
//        Subscriber thirdSubscriber = Mockito.mock(Subscriber.class);
//        Location secondLocation = Mockito.mock(Location.class);
//        Location thirdLocation = Mockito.mock(Location.class);
//        WeatherNotification secondWeatherNotification = Mockito.mock(WeatherNotification.class);
//        WeatherNotification thirdWeatherNotification = Mockito.mock(WeatherNotification.class);
//        weatherService.addSubscriberToLocations(subscriber,location);
//        weatherService.addSubscriberToLocations(secondSubscriber,secondLocation);
//        weatherService.addSubscriberToLocations(thirdSubscriber,thirdLocation);
//
//        weatherService.sendWeatherNotification(weatherNotification,location);;
//    }
//
//    @Test
//    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
//        Location secondLocation = Mockito.mock(Location.class);
//        Location thirdLocation = Mockito.mock(Location.class);
//        Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
//        Subscriber thirdSubscriber = Mockito.mock(Subscriber.class);
//
//        weatherService.addSubscriberToLocations(subscriber,location);
//        weatherService.addSubscriberToLocations(secondSubscriber,location);
//        weatherService.addSubscriberToLocations(thirdSubscriber,secondLocation);
//
//        weatherService.sendWeatherNotification(weatherNotification,location);
//    }
//
//    @Test
//    public void unsubscribedClientShouldNotReceiveNotification() {
//        weatherService.addSubscriberToLocations(subscriber,location);
//        weatherService.removeWeatherSubscriber(subscriber,location);
//
//        weatherService.sendWeatherNotification(weatherNotification,location);
//        Mockito.verify(subscriber, Mockito.never()).receive(weatherNotification);
//    }
}
