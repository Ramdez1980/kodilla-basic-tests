package com.kodilla.optional.homework;

import java.util.*;

public class Application {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Jan kowalski",new Teacher("Nauczyciel 1")));
        students.add(new Student("Ziuta Spychalska", new Teacher("Nauczyciel 2")));
        students.add(new Student("Maria Awaria", null));

        for (Student student : students) {
            Optional<Teacher> maybeTeacher = Optional.ofNullable(student.getTeacher());
            System.out.println("Name: " + student.getStudentName() + " teacher: " + maybeTeacher.map(teacher -> teacher.getTeacherName()).orElse("<undefined>"));
        }
    }
}
