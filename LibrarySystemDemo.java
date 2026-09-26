package com.mycompany.lab6;

public class LibrarySystemDemo {

    public static void main(String[] args) {

        LibrarySystem library = new LibraryImplementation();

        library.addBook("B010", "Software Construction", "Engr Rizwan Shah");
        library.addBook("B020", "Operating System", "Engr Munazza Razzaq");

        System.out.println(library.searchBook("B010"));

        library.issueBook("B010");
        System.out.println(library.searchBook("B010"));

        library.returnBook("B010");
        System.out.println(library.searchBook("B010"));

        library.removeBook("B020");
        System.out.println(library.searchBook("B020"));
    }
}