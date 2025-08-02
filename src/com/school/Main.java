package com.school;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student();
        students[1] = new Student();

        Course[] courses = new Course[2];
        courses[0] = new Course();
        courses[1] = new Course();

        for (Student student : students) {
            System.err.println("Successfully created a Student object.");
            System.out.println("Student: " + student);
        }

        for (Course course : courses) {
            System.err.println("Successfully created a Course object.");
            System.out.println("Course: " + course);
        }
    }
}
