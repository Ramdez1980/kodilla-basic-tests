package com.kodilla.mockito.homework;

import com.kodilla.notification.homework.Location;
import java.util.*;
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

        public void removeWeatherSubscriber(Subscriber subscriber, Location location) {
            Set<Subscriber> subscribers = locationSubscribers.get(location);
            subscribers.remove(subscriber);
        }

        public void removeAllLocations(Subscriber subscriber) {
            //locationSubscribers.keySet().forEach(location -> removeWeatherSubscriber(subscriber, location));   -- inna mozliwosc
            locationSubscribers.forEach((location, subscribers) -> subscribers.remove(subscriber));
        }

        public void sendWeatherNotification(WeatherNotification weatherNotification, Location location) {
            Set<Subscriber> subscribersToNotify = locationSubscribers.get(location);
            if (subscribersToNotify != null) {
                subscribersToNotify.forEach(subscriber -> subscriber.send(weatherNotification));
            }
        }

        public void sendToAll(WeatherNotification weatherNotification) {
            Set<Subscriber> allSubscribers = locationSubscribers.values().stream()
                    .flatMap(Collection::stream)
                    .collect(Collectors.toSet());
            allSubscribers.forEach(subscriber -> subscriber.send(weatherNotification));
        }

        public void removeLocation(Location location) {
            locationSubscribers.remove(location);
        }

        public Map<Location, Set<Subscriber>> getLocationSubscribers() {
            return locationSubscribers;
        }

}

