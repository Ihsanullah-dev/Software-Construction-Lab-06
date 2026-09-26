package com.mycompany.lab6;

import java.util.Scanner;

public class StudentDemo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter Student ID: ");
        int id = input.nextInt();

        input.nextLine();

        System.out.print("Enter Student Name: ");
        String name = input.nextLine();

        System.out.print("Enter Student CGPA: ");
        double cgpa = input.nextDouble();

        Student student = new Student(id, name, cgpa);

        System.out.println("\nStudent Information:");
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student CGPA: " + student.getCgpa());

        input.close();
    }
}