/*
Create a Book class with attributes title, author, and price. 
Provide both default and parameterized constructors.
*/

class Book{
	String title;
	String author;
	String price;
	Book(){
		this.title="Science";
		this.author="Ankit";
		this.price=0;
	}
	Book(String title, String author, int price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
}
public class BookDemo{
	public static void main(String[] args){
		//Creating object of Book class
		Book b = new Book();
		Book b1 = new Book("Maths","Mohan",100);
		
	}
}