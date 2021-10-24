package com.kodilla.mockito.homework;


import com.kodilla.notification.homework.Location;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {

    WeatherService weatherService = new WeatherService();
    Subscriber subscriber = Mockito.mock(Subscriber.class);
    Location location = Mockito.mock(Location.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

    @Test
    public void noSubscreiberShouldNotReceiveWeatherNotification() {
        weatherService.sendWeatherNotification(weatherNotification,location);
        Mockito.verify(location, Mockito.never()).receiveWeather(weatherNotification);
    }

    @Test
    public void subscribedClientShouldReceiveWeatherNotification() {
        weatherService.addSubscriberToLocations(subscriber, location);
        weatherService.sendWeatherNotification(weatherNotification,location);
     /*Mockito.verify(subscriber, Mockito.times(1)).receive(weatherNotification);*/
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedWeatherClients() {
        Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
        Subscriber thirdSubscriber = Mockito.mock(Subscriber.class);
        Location secondLocation = Mockito.mock(Location.class);
        Location thirdLocation = Mockito.mock(Location.class);
        WeatherNotification secondWeatherNotification = Mockito.mock(WeatherNotification.class);
        WeatherNotification thirdWeatherNotification = Mockito.mock(WeatherNotification.class);
        weatherService.addSubscriberToLocations(subscriber,location);
        weatherService.addSubscriberToLocations(secondSubscriber,secondLocation);
        weatherService.addSubscriberToLocations(thirdSubscriber,thirdLocation);

        weatherService.sendWeatherNotification(weatherNotification,location);;
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        Location secondLocation = Mockito.mock(Location.class);
        Location thirdLocation = Mockito.mock(Location.class);
        Subscriber secondSubscriber = Mockito.mock(Subscriber.class);
        Subscriber thirdSubscriber = Mockito.mock(Subscriber.class);

        weatherService.addSubscriberToLocations(subscriber,location);
        weatherService.addSubscriberToLocations(secondSubscriber,location);
        weatherService.addSubscriberToLocations(thirdSubscriber,secondLocation);

        weatherService.sendWeatherNotification(weatherNotification,location);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        weatherService.addSubscriberToLocations(subscriber,location);
        weatherService.removeWeatherSubscriber(subscriber,location);

        weatherService.sendWeatherNotification(weatherNotification,location);
        Mockito.verify(subscriber, Mockito.never()).receive(weatherNotification);
    }
}
