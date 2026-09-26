package com.mycompany.lab6;

import java.util.HashMap;
import java.util.Map;

public class LibraryImplementation implements LibrarySystem {

    private Map<String, Book> books = new HashMap<>();

    @Override
    public void addBook(String bookId, String title, String author) {
        Book book = new Book(bookId, title, author, false);
        books.put(bookId, book);
    }

    @Override
    public void removeBook(String bookId) {
        books.remove(bookId);
    }

    @Override
    public String searchBook(String bookId) {
        Book book = books.get(bookId);

        if (book != null) {
            return book.toString();
        }

        return "Book not found";
    }

    @Override
    public void issueBook(String bookId) {
        Book book = books.get(bookId);

        if (book != null && !book.isIssued()) {
            book.setIssued(true);
        }
    }

    @Override
    public void returnBook(String bookId) {
        Book book = books.get(bookId);

        if (book != null && book.isIssued()) {
            book.setIssued(false);
        }
    }

    private static class Book {

        private String bookId;
        private String title;
        private String author;
        private boolean issued;

        public Book(String bookId, String title, String author, boolean issued) {
            this.bookId = bookId;
            this.title = title;
            this.author = author;
            this.issued = issued;
        }

        public boolean isIssued() {
            return issued;
        }

        public void setIssued(boolean issued) {
            this.issued = issued;
        }

        @Override
        public String toString() {
            return "Book ID: " + bookId
                    + ", Title: " + title
                    + ", Author: " + author
                    + ", Status: " + (issued ? "Issued" : "Available");
        }
    }
}