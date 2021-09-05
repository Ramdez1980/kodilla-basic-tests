package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;
public class TaskManager {
    public static void main(String[] args) {
        List<String> tasks = TaskRepository.getTasks()
            .stream()
            .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
            .map(TaskManager::getDeadLine)
            .collect(Collectors.toList());
            System.out.println(tasks);
    }

    public static String getDeadLine(Task task) {
        return task.getName() + " " + task.getDeadline() ;
    }
}
