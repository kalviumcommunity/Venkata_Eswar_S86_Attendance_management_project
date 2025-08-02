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
            System.out.println("Student: " + student);
        }

        for (Course course : courses) {
            System.out.println("Course: " + course);
        }
    }
}
