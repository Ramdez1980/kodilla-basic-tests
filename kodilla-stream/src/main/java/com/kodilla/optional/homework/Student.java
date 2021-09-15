package com.kodilla.optional.homework;

import java.util.List;

public class Student {

    private String studentName;
    private List<String> teacher;

    public Student(String studentName, List<String> teacher) {
        this.studentName = studentName;
        this.teacher = teacher;
    }

    public String getStudentName() {
        return studentName;
    }

    public List<String> getTeacher() {
        return teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentName='" + studentName + '\'' +
                ", teacher=" + teacher +
                '}';
    }
}

