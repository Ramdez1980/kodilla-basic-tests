package com.kodilla.mockito.homework;


import com.kodilla.notification.homework.Location;
import com.kodilla.notification.homework.WeatherClient;
import com.kodilla.notification.homework.WeatherNotification;

import java.util.HashMap;
import java.util.Map;

public class WeatherService {

    Map<WeatherClient, Location> weatherClients = new HashMap<>();


        public void addWeatherSubscriber(WeatherClient weatherClient, Location location) {
            this.weatherClients.put(weatherClient,location);
        }

        public void sendWeatherNotification(WeatherNotification weatherNotification) {
            this.weatherClients.forEach((weatherClient, location) -> weatherClients.get(weatherNotification));
        }

        public void removeWeatherSubscriber(WeatherClient weatherClient, Location location) {
            this.weatherClients.remove(weatherClient, location);
        }

}

