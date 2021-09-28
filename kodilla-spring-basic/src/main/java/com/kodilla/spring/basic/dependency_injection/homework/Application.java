package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        ShippingCenter shippingCenter = new ShippingCenter(new DhlDeliveryService(),new DhlNotificationService());
        shippingCenter.sendPackage("Warsaw", 15);
    }
}
