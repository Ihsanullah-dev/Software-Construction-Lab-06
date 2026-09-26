package com.mycompany.lab6;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentCollectionTest1 {

    @Test
    public void testAddStudent() {

        StudentCollection1 collection = new StudentImplementation1();

        Student1 student = new Student1(1, "Ali");

        collection.addStudent(student);

        assertEquals(1, collection.getSize());
    }

    @Test
    public void testRemoveStudent() {

        StudentCollection1 collection =
                new StudentImplementation1();

        collection.addStudent(new Student1(1, "Ali"));
        collection.addStudent(new Student1(2, "Ahmed"));

        collection.removeStudent(1);

        assertEquals(1, collection.getSize());
        assertNull(collection.findStudent(1));
    }

    @Test
    public void testFindStudent() {

        StudentCollection1 collection =
                new StudentImplementation1();

        Student1 student = new Student1(1, "Ali");

        collection.addStudent(student);

        Student1 result = collection.findStudent(1);

        assertNotNull(result);
        assertEquals("Ali", result.getName());
    }

    @Test
    public void testGetSize() {

        StudentCollection1 collection =
                new StudentImplementation1();

        collection.addStudent(new Student1(1, "Ali"));
        collection.addStudent(new Student1(2, "Ahmed"));

        assertEquals(2, collection.getSize());
    }

    @Test
    public void testIsEmpty() {

        StudentCollection1 collection =
                new StudentImplementation1();

        assertTrue(collection.isEmpty());

        collection.addStudent(new Student1(1, "Ali"));

        assertFalse(collection.isEmpty());
    }
}