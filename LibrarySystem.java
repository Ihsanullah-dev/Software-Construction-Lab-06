package com.mycompany.lab6;

public interface LibrarySystem {

    void addBook(String bookId, String title, String author);

    void removeBook(String bookId);

    String searchBook(String bookId);

    void issueBook(String bookId);

    void returnBook(String bookId);
}