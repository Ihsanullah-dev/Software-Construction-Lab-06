Lab Task 06 – Abstract Data Types (ADT)

University of Engineering and Technology, Abbottabad Campus

Course: Software Construction
Lab Task: 06 – Fall 2026
Semester: 5th Semester Software Engineering
Date: 22 September 2026
Instructor: Engr. Rizwan Shah
Student: Ihsan Ullah
Registration No: 24ABSWE0026

Objective

The objective of this lab is to implement simple Abstract Data Types (ADTs) in Java, use interfaces to define contracts, and apply abstraction and encapsulation principles.

This lab also demonstrates the use of Java Collections and JUnit testing.

Tools and Technologies

Java

NetBeans IDE

Maven

JUnit 5

GitHub

Package

All Java classes are organized under:

com.mycompany.lab6

Task 1 – Implementing the Stack ADT

Objective

The objective of this task is to implement and test a Stack ADT using the LIFO (Last In, First Out) principle.

Implementation

An array-based Stack ADT was implemented using the ArrayStack class.

The following operations were performed:

push(10)
push(20)
push(30)
pop()

The pop() operation returns 30, demonstrating the LIFO behavior of a stack.

A StackDemo class was used to display the stack operations in the console. A JUnit test was also created to verify the stack operation.

Expected Output

Stack Operations:
Push: 10
Push: 20
Push: 30
Pop: 30
Popped value = 30

Files

ArrayStack.java

StackDemo.java

ArrayStackTest.java

Task 2 – Data Encapsulation

Objective

The objective of this task is to demonstrate data encapsulation by protecting the internal data of a class and providing controlled access through public methods.

Implementation

The Student class contains three private data members:

id

name

cgpa

Public getter methods are provided to access these private variables.

The StudentDemo class is used to enter student information and display the information through the getter methods.

Direct access to the private id variable was also tested. When the private variable was accessed directly from outside the class, the compiler generated a compilation error.

This demonstrates that private data members cannot be accessed directly from outside their class.

Example Output

Enter Student ID: 12
Enter Student Name: ihsan
Enter Student CGPA: 3.34

Student Information:
Student ID: 12
Student Name: ihsan
Student CGPA: 3.34

BUILD SUCCESS

Files

Student.java

StudentDemo.java

Task 3 – Programming to an Abstraction

Objective

The objective of this task is to demonstrate programming to an abstraction using the Java List interface.

Implementation

A List<String> reference was used as the abstraction.

The same list variable was first assigned to an ArrayList, and Ali was added.

The same variable was then reassigned to a LinkedList, and Ahmed was added.

This demonstrates that client code can depend on the List interface instead of directly depending on a specific implementation.

Expected Output

Using ArrayList:
Students: [Ali]

Using LinkedList:
Students: [Ahmed]

BUILD SUCCESS

File

Abstraction.java

Task 4 – Library System ADT Design

Objective

The objective of this task is to design an Abstract Data Type for a Library System using an interface and a concrete implementation.

Data

The Library System contains:

Book

Book ID

Title

Author

Operations

The Library System provides:

addBook()
removeBook()
searchBook()
issueBook()
returnBook()

Implementation

The LibrarySystem interface defines the contract of the Library System.

The LibraryImplementation class provides the concrete implementation using a Java Collection.

The LibrarySystemDemo class is used to demonstrate the library system operations.

Files

LibrarySystem.java

LibraryImplementation.java

LibrarySystemDemo.java

Task 5 – Student Management System

Objective

The objective of this task is to define and implement a Student Collection Abstract Data Type and test its operations using JUnit.

Operations

The Student Collection ADT provides:

addStudent(Student student)
removeStudent(int id)
findStudent(int id)
getSize()
isEmpty()

Implementation

The StudentCollection1 interface defines the Student Collection ADT.

The StudentImplementation1 class provides the concrete implementation of the student collection.

JUnit tests were created to verify the student collection operations.

Files

Student1.java

StudentCollection1.java

StudentImplementation1.java

StudentCollectionTest1.java

Complete Source Files

Abstraction.java
ArrayStack.java
LibraryImplementation.java
LibrarySystem.java
LibrarySystemDemo.java
StackDemo.java
Student.java
Student1.java
StudentCollection1.java
StudentDemo.java
StudentImplementation1.java

JUnit Test Files

ArrayStackTest.java
StudentCollectionTest1.java

Project Structure

lab6
│
├── src
│   ├── main
│   │   └── java
│   │       └── com
│   │           └── mycompany
│   │               └── lab6
│   │                   ├── Abstraction.java
│   │                   ├── ArrayStack.java
│   │                   ├── LibraryImplementation.java
│   │                   ├── LibrarySystem.java
│   │                   ├── LibrarySystemDemo.java
│   │                   ├── StackDemo.java
│   │                   ├── Student.java
│   │                   ├── Student1.java
│   │                   ├── StudentCollection1.java
│   │                   ├── StudentDemo.java
│   │                   └── StudentImplementation1.java
│   │
│   └── test
│       └── java
│           └── com
│               └── mycompany
│                   └── lab6
│                       ├── ArrayStackTest.java
│                       └── StudentCollectionTest1.java
│
├── pom.xml
└── README.md

How to Run the Project

Open the project in NetBeans IDE.

Make sure the Maven project is loaded correctly.

Make sure all required dependencies are available.

Verify the package name:

com.mycompany.lab6

Select the required class containing the main() method.

Run the class.

Check the NetBeans Output window for the result.

Main Classes

com.mycompany.lab6.StackDemo
com.mycompany.lab6.StudentDemo
com.mycompany.lab6.Abstraction
com.mycompany.lab6.LibrarySystemDemo

Running JUnit Tests

The project contains:

ArrayStackTest.java
StudentCollectionTest1.java

To run the tests:

Open the project in NetBeans IDE.

Make sure Maven dependencies are loaded.

Right-click the project.

Select Test.

Wait for the tests to execute.

Check the Test Results window.

Verify the test results.

Concepts Demonstrated

Abstract Data Types (ADT)

Stack ADT

LIFO principle

Data encapsulation

Private variables

Public getter methods

Programming to an abstraction

Java interfaces

ArrayList

LinkedList

Java Collections

Interface-based design

Separation of specification and implementation

Library System ADT

Student Collection ADT

JUnit testing

Learning Outcomes

After completing this lab, the following concepts were practiced:

Implementing simple Abstract Data Types in Java.

Understanding the LIFO principle of a Stack.

Applying data encapsulation using private variables.

Accessing private data through public methods.

Programming to an interface instead of a concrete implementation.

Using different Java Collection implementations.

Designing a Library System using an ADT.

Designing a Student Collection using an ADT.

Separating an interface from its implementation.

Writing JUnit tests for Java functionality.

Conclusion

This lab provided practical experience with Abstract Data Types, abstraction, encapsulation, interfaces, Java Collections, and JUnit testing.

The five tasks demonstrate how ADTs can define the required behavior of a system while keeping the specification separate from its implementation.

The Stack task demonstrated the LIFO principle, the Student task demonstrated data encapsulation, the abstraction task demonstrated programming to an interface, the Library System task demonstrated ADT design, and the Student Management task demonstrated interface-based implementation and JUnit testing.

Author

Ihsan Ullah
Registration No: 24ABSWE0026
Software Engineering – 5th Semester
University of Engineering and Technology, Abbottabad Campus
Course: Software Construction
Instructor: Engr. Rizwan Shah
