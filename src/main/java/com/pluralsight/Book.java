package com.pluralsight;

public class Book {
    // Fields representing the book's attributes
    private int id;             // Unique identifier for the book
    private String isbn;        // International Standard Book Number
    private String title;       // Title of the book
    private boolean isCheckedOut; // Whether the book is checked out or not
    private String checkedOutTo;  // The name of the person the book is checked out to

    // Constructor to initialize a book with all the properties
    public Book(int id, String isbn, String title, boolean isCheckedOut, String checkedOutTo) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = isCheckedOut;
        this.checkedOutTo = checkedOutTo;
    }

    // Getter for the book's ID
    public int getId() {
        return id;
    }

    // Setter for the book's ID
    public void setId(int id) {
        this.id = id;
    }

    // Getter for the book's title
    public String getTitle() {
        return title;
    }

    // Setter for the book's title
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for the book's ISBN
    public String getIsbn() {
        return isbn;
    }

    // Setter for the book's ISBN
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    // Getter to check if the book is checked out
    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    // Setter to set the status of the book (checked in or checked out)
    public void setCheckedOut(boolean checkedOut) {
        isCheckedOut = checkedOut;
    }

    // Getter for the name of the person who checked out the book
    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // Setter for the name of the person who checked out the book
    public void setCheckedOutTo(String checkedOutTo) {
        this.checkedOutTo = checkedOutTo;
    }

    // Override the toString method to provide a string representation of the book
    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", isbn='" + isbn + '\'' +
                ", title='" + title + '\'' +
                ", isCheckedOut=" + isCheckedOut +
                ", checkedOutTo='" + checkedOutTo + '\'' +
                '}';
    }

    // Method to check out the book to a person
    public void checkOut(String personName) {
        isCheckedOut = true;  // Set the book's status to checked out
        checkedOutTo = personName;  // Assign the name of the person who checked out the book
    }

    // Method to check the book back in
    public void checkIn() {
        isCheckedOut = false;  // Set the book's status to not checked out
        checkedOutTo = "";     // Clear the person’s name who checked out the book
    }
}

