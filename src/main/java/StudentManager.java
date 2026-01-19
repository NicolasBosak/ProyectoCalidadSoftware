package com.example.students;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class StudentManager {
    private static final Logger logger = Logger.getLogger(StudentManager.class.getName());
    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, double grade) {
        students.add(new Student(name, grade));
        logger.info("Student added.");
    }

    public void listStudents() {
        for (Student s : students) {
            logger.info(s.toString());
        }
    }

    public static void main(String[] args) {
        StudentManager sm = new StudentManager();
        sm.addStudent("John Doe", 85.5);
        sm.listStudents();
    }
}