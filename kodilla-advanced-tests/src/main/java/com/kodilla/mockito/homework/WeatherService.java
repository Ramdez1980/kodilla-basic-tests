package com.kodilla.mockito.homework;


import com.kodilla.notification.homework.Location;
import com.kodilla.notification.homework.WeatherClient;
import com.kodilla.notification.homework.WeatherNotification;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class WeatherService {

    private Map<Location, Set<Subscriber>> locationSubscribers = new HashMap<>();

        public void addSubscriberToLocations(Subscriber subscriber, Location location) {
            Set<Subscriber> subscribers = locationSubscribers.get(location);
            if (subscribers == null) {
                subscribers = new HashSet<>();
            }
            subscribers.add(subscriber);
            locationSubscribers.put(location, subscribers);
        }

        public void sendWeatherNotification(WeatherNotification weatherNotification, Location location) {
            Set<Subscriber> subscribersToNotify = locationSubscribers.get(location);
            if (subscribersToNotify != null) {
                subscribersToNotify.forEach(subscriber -> subscriber.send(weatherNotification));
            }
        }

        public void sendToAll(WeatherNotification weatherNotification) {
            Set<Subscriber> allSubscribers = locationSubscribers.values().stream()
                    .flatMap(x -> x.stream())
                    .collect(Collectors.toSet());
            allSubscribers.forEach(subscriber -> subscriber.send(weatherNotification));
        }

        public void removeWeatherSubscriber(Subscriber subscriber, Location location) {
            //...
        }

        public void removeWeatherSubscriber(Subscriber subscriber) {
            //...
        }

        public void removeLocation(Location location) {
            locationSubscribers.remove(location);
        }

}

