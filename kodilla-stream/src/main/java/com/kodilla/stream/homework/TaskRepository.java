package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("zakup ubrań", LocalDate.of(2021,01,04),LocalDate.of(2021,03,31)));
        tasks.add(new Task("trasnport ubrań", LocalDate.of(2021,04,01),LocalDate.of(2021,06,30)));
        tasks.add(new Task("zatowarowanie ubrań", LocalDate.of(2021,07,01),LocalDate.of(2021,10,28)));
        tasks.add(new Task("sprzedaż ubrań", LocalDate.of(2021,07,01),LocalDate.of(2021,12,30)));
        return tasks;
    }

}
