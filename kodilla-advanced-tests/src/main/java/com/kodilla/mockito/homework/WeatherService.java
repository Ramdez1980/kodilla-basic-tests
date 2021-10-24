package com.kodilla.mockito.homework;


import com.kodilla.notification.homework.Location;

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
            Set<Subscriber> subscribers = locationSubscribers.get(location);
            locationSubscribers.remove(location, subscribers);
        }

        public void removeAllSubscriber(Subscriber subscriber) {
            Set<Subscriber> subscribers = locationSubscribers.get(subscriber);
            locationSubscribers.remove(subscribers);
        }

        public void removeLocation(Location location) {
            Set<Subscriber> locations = locationSubscribers.get(location);
            locationSubscribers.remove(locations);
        }

}

