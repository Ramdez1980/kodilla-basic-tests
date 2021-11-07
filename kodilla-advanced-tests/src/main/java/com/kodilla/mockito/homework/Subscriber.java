package com.kodilla.mockito.homework;

public interface Subscriber {

    void send(WeatherNotification weatherNotification);
    void receive(WeatherNotification weatherNotification);

}
