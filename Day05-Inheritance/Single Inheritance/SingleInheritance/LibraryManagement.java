/*
Sample Problem 1: Library Management with Books and Authors
Description: Model a Book system where Book is the superclass, and Author is a subclass.
Tasks:
Define a superclass Book with attributes like title and publicationYear.
Define a subclass Author with additional attributes like name and bio.
Create a method displayInfo() to show details of the book and its author.
Goal: Practice single inheritance by extending the base class and adding more specific details in the subclass.
*/
package SingleInheritance;
class Books{
	String title;
	int publicationYear;
	
	Books(String title, int publicationYear){
		this.title=title;
		this.publicationYear=publicationYear;
	}
}

class Authors extends Books{
	String name;
	String bio;
	
	Authors(String title, int publicationYear, String name,String bio){
		super(title,publicationYear);
		this.name = name;
		this.bio = bio;
	}
	
	public void displayInfo(){
		System.out.printf("The name of the author who publish book %s, in year %d is %s.%n",title,publicationYear,name);
		System.out.println("About author : "+bio);
	}
}

class LibraryManagement{
	public static void main(String[] args){
		Authors author = new Authors("Java fundamental",2015,"Ankit","Enginnering student");
		author.displayInfo();
	}	
}