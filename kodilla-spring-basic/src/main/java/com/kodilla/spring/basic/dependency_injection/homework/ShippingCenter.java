package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter {

    private DhlDeliveryService dhlDeliveryService  ;
    private DhlNotificationService dhlNotificationService;

    public ShippingCenter(DhlDeliveryService dhlDeliveryService,DhlNotificationService dhlNotificationService) {
        this.dhlDeliveryService = dhlDeliveryService;
        this.dhlNotificationService = dhlNotificationService;
    }

    public void sendPackage(String address, double weight) {
        if (dhlDeliveryService.deliverPackage(address, weight)) {
            dhlNotificationService.success(address);
        } else {
            dhlNotificationService.fail(address);
        }
    }
}
