package com.school;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Alice", "Grade 10");
        Teacher teacher = new Teacher("Mr. Smith", "Mathematics");
        Staff staff = new Staff("John", "Librarian");

        student.displayDetails();
        teacher.displayDetails();
        staff.displayDetails();

        // Example usage in AttendanceRecord
        System.out.println("Attendance recorded for student with ID: " + student.getId());
    }
}
