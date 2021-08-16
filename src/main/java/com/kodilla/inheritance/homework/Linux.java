package com.kodilla.inheritance.homework;

public class Linux extends OperatingSystem{
    @Override
    public void turnOff()
    {
        System.out.println("Turn Off Linux system");/**/
    }


    @Override
    public void turnOn()
    {
        System.out.println("Turn on Linux system");/**/
    }

    public Linux(int YearOfPublication)
    {
        super(YearOfPublication);
    }
}
