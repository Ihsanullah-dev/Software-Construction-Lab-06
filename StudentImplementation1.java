package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.List;

public class StudentImplementation1 implements StudentCollection1 {

    private List<Student1> students = new ArrayList<>();

    @Override
    public void addStudent(Student1 student) {
        students.add(student);
    }

    @Override
    public void removeStudent(int id) {
        students.removeIf(student -> student.getId() == id);
    }

    @Override
    public Student1 findStudent(int id) {
        for (Student1 student : students) {
            if (student.getId() == id) {
                return student;
            }
        }

        return null;
    }

    @Override
    public int getSize() {
        return students.size();
    }

    @Override
    public boolean isEmpty() {
        return students.isEmpty();
    }
}