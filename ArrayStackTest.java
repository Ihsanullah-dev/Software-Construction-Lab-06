package com.mycompany.lab6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayStackTest {

    @Test
    public void testStackLIFO() {

        ArrayStack stack = new ArrayStack(10);

        stack.push(10);
        stack.push(20);
        stack.push(30);

        assertEquals(30, stack.pop());
    }
}