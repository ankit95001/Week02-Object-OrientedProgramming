/*
Problem 1: Library and Books (Aggregation)
Description: Create a Library class that contains multiple Book objects. 
Model the relationship such that a library can have many books, but a book can exist independently (outside of a specific library).
Tasks:
Define a Library class with an ArrayList of Book objects.
Define a Book class with attributes such as title and author.
Demonstrate the aggregation relationship by creating books and adding them to different libraries.
Goal: Understand aggregation by modeling a real-world relationship where the Library aggregates Book objects
*/

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String display() {
        return "Book [Title: " + title + ", Author: " + author + "]";
    }
}

class Library {
    private String name;
    private List<Book> books;

    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        System.out.println("Library: " + name);
        for (Book book : books) {
            System.out.println(book.display());
        }
    }
}

public class AggregationExampleBookAndLibrary {
    public static void main(String[] args) {
        Book book1 = new Book("1984", "George Orwell");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee");

        Library library1 = new Library("City Library");
        Library library2 = new Library("Town Library");

        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(new Book("The Great Gatsby", "F. Scott Fitzgerald"));

        library1.displayBooks();
        library2.displayBooks();
    }
}
