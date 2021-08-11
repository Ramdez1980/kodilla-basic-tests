package com.kodilla.inheritance.homework;

public class SystemWindowsOff extends SystemWindowsOn{
    @Override
    public void turnOff()
    {
        System.out.println("Turn Off Windows system");/**/
    }

    public SystemWindowsOff(int YearOfPublication)
    {
        super(YearOfPublication);
    }
}
