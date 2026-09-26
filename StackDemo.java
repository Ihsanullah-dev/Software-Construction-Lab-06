package com.mycompany.lab6;

public class StackDemo {

    public static void main(String[] args) {

        ArrayStack stack = new ArrayStack(10);

        System.out.println("Stack Operations:");

        stack.push(10);
        stack.push(20);
        stack.push(30);

        int value = stack.pop();

        System.out.println("Popped value = " + value);
    }
}