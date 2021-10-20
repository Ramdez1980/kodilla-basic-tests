package com.kodilla.mockito.homework;

import com.kodilla.notification.homework.WeatherNotification;

public interface Subscriber {

    void send(WeatherNotification weatherNotification);
}
