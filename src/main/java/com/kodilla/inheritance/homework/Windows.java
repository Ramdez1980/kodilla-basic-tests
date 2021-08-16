package com.kodilla.inheritance.homework;

public class Windows extends OperatingSystem {
    @Override
    public void turnOff()
    {
        System.out.println("Turn Off Windows system");/**/
    }


    @Override
    public void turnOn()
    {
        System.out.println("Turn on Windows system");/**/
    }

    public Windows(int YearOfPublication)
    {
        super(YearOfPublication);
    }


}
