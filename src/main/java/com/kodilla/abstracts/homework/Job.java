package com.kodilla.abstracts.homework;

public abstract class Job {
    private int salary;
    private String responsibilities;


    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;

    }

    public int getSalary()
    {
        return salary;
    }

    public String getresponsibilities()
    {
        return responsibilities;
    }

    public abstract int salary();
    public abstract String responsibilities();

}
