package com.kodilla.mockito.homework;


import com.kodilla.notification.homework.Location;
import com.kodilla.notification.homework.WeatherClient;
import com.kodilla.notification.homework.WeatherNotification;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceTestSuite {

    WeatherService weatherService = new WeatherService();
    WeatherClient weatherClient = Mockito.mock(WeatherClient.class);
    Location location = Mockito.mock(Location.class);
    WeatherNotification weatherNotification = Mockito.mock(WeatherNotification.class);

    @Test
    public void notSubscribedClientShouldNotReceiveWeatherNotification() {
        weatherService.sendWeatherNotification(weatherNotification);
        Mockito.verify(weatherClient, Mockito.never()).receiveWeather(weatherNotification);
    }

    @Test
    public void subscribedClientShouldReceiveWeatherNotification() {
        weatherService.addWeatherSubscriber(weatherClient,location);
        weatherService.sendWeatherNotification(weatherNotification);
        Mockito.verify(weatherClient, Mockito.times(1)).receiveWeather(weatherNotification);
    }

    @Test
    public void notificationShouldBeSentToAllSubscribedWeatherClients() {
        WeatherClient secondWeatherClient = Mockito.mock(WeatherClient.class);
        WeatherClient thirdWeatherClient = Mockito.mock(WeatherClient.class);
        Location secondLocation = Mockito.mock(Location.class);
        Location thirdLocation = Mockito.mock(Location.class);
        WeatherNotification secondWeatherNotification = Mockito.mock(WeatherNotification.class);
        WeatherNotification thirdWeatherNotification = Mockito.mock(WeatherNotification.class);
        weatherService.addWeatherSubscriber(weatherClient,location);
        weatherService.addWeatherSubscriber(secondWeatherClient,secondLocation);
        weatherService.addWeatherSubscriber(thirdWeatherClient,thirdLocation);

        weatherService.sendWeatherNotification(weatherNotification);;
        Mockito.verify(weatherClient, Mockito.times(1)).receiveWeather(weatherNotification);
        Mockito.verify(secondWeatherClient, Mockito.times(1)).receiveWeather(secondWeatherNotification);
        Mockito.verify(thirdWeatherClient, Mockito.times(1)).receiveWeather(thirdWeatherNotification);
    }

    @Test
    public void shouldSendOnlyOneNotificationToMultiTimeSubscriber() {
        Location secondLocation = Mockito.mock(Location.class);
        Location thirdLocation = Mockito.mock(Location.class);

        weatherService.addWeatherSubscriber(weatherClient,location);
        weatherService.addWeatherSubscriber(weatherClient,secondLocation);
        weatherService.addWeatherSubscriber(weatherClient,thirdLocation);

        weatherService.sendWeatherNotification(weatherNotification);
        Mockito.verify(weatherClient, Mockito.times(1)).receiveWeather(weatherNotification);
    }

    @Test
    public void unsubscribedClientShouldNotReceiveNotification() {
        weatherService.addWeatherSubscriber(weatherClient,location);
        weatherService.removeWeatherSubscriber(weatherClient,location);

        weatherService.sendWeatherNotification(weatherNotification);
        Mockito.verify(weatherClient, Mockito.never()).receiveWeather(weatherNotification);
    }
}
