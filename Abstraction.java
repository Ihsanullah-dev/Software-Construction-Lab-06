package com.mycompany.lab6;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Abstraction {

    public static void main(String[] args) {

        List<String> students;

        // Using ArrayList
        students = new ArrayList<>();
        students.add("Ihsan Ullah");

        System.out.println("Using ArrayList:");
        System.out.println("Students: " + students);

        // Using LinkedList
        students = new LinkedList<>();
        students.add("Faizan");

        System.out.println("Using LinkedList:");
        System.out.println("Students: " + students);
    }
}