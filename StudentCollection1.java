package com.mycompany.lab6;

public interface StudentCollection1 {

    void addStudent(Student1 student);

    void removeStudent(int id);

    Student1 findStudent(int id);

    int getSize();

    boolean isEmpty();
}