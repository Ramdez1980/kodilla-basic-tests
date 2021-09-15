package com.kodilla.optional.homework;

import java.util.*;


import com.kodilla.optional.homework.Teacher;

public class Application {


    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan kowalski", Arrays.asList("Nauczyciel 1")));
        students.add(new Student("Ziuta Spychalska", Arrays.asList("Nauczyciel 2 ")));
        students.add(new Student("Maria Awaria", null));


        Optional<Student> optionalStudent = Optional.ofNullable(students);

        String studentName =
                optionalStudent.orElse(new Student("", "")).getStudentName();

        for (Student student : students) {
            System.out.println(students);
        }

    }
}
