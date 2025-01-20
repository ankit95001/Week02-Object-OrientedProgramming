/*
Sample Program 2: Library Management System
Create a Book class to manage library books with the following features:
Static:
A static variable libraryName shared across all books.
A static method displayLibraryName() to print the library name.
This:
Use this to initialize title, author, and isbn in the constructor.
Final:
Use a final variable isbn to ensure the unique identifier of a book cannot be changed.
Instanceof:
Verify if an object is an instance of the Book class before displaying its details.
*/

public class Book{
	static String libraryName = "Ankit's library";
	final int isbn;
	String title;
	String author;
	
	BankAccount(String title, String author,int isbn){
		this.title=title;
		this.author=author;
		this.isbn=isbn;
	}
	
	static void displayLibraryName(){
		System.out.println("Name of library is : "+libraryName);
	}
	
	public void display(){
		System.out.printf("The author of book %s, with title %s has isbn no %d",author,title,isbn);
	}
	public static void main(String[] args){
		Book b1 = new Book("JAVA", "Ankit", 101);
		Book b1 = new Book("C++", "Anand", 102);
		Book b1 = new Book("Python", "Aakrati", 103);
		
		Book.displayLibraryName();
		
		if(b2 instanceOf Bank){
			b2.display();
		}else{
			System.out.println("This account is not belongs to this bank");
		}
	}
}
