package com.mycompany.lab6;

public class ArrayStack {

    private int[] stack;
    private int top;

    public ArrayStack(int capacity) {
        stack = new int[capacity];
        top = -1;
    }

    public void push(int value) {

        if (top == stack.length - 1) {
            throw new IllegalStateException("Stack is full");
        }

        top++;
        stack[top] = value;

        System.out.println("Push: " + value);
    }

    public int pop() {

        if (top == -1) {
            throw new IllegalStateException("Stack is empty");
        }

        int value = stack[top];
        top--;

        System.out.println("Pop: " + value);

        return value;
    }

    public boolean isEmpty() {
        return top == -1;
    }
}