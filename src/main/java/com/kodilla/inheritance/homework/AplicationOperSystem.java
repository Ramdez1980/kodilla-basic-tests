package com.kodilla.inheritance.homework;

public class AplicationOperSystem {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1980);
        operatingSystem.getYearOfPublication(); /**/


        SystemWindowsOn systemWindowsOn = new SystemWindowsOn(1999);
        systemWindowsOn.turnOn();

        SystemWindowsOff systemWindowsOff = new SystemWindowsOff(2021);
        systemWindowsOff.turnOff();
    }


}
