/*
Problem Statement: 
Write a program to create a Book class with attributes title, author, and price. 
Add a method to display the book details.
*/
class Book {
    String title;
    String author;
    int price;
    Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
    public void display() {
		System.out.printf("The Title of the book is %s , the Author is  %s  and price is : %d%n", this.title, this.author, this.price);
	}
}

public class BookClassDemo {
    public static void main(String[] args) {
        // Creating object of Employee class
        Book b1 = new Book("Java", "Ankit", 100);

        // Displaying result
        b1.display();
    }
}