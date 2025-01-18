class Book {
    public String ISBN;
    protected String title;
    private String author;

    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class EBook extends Book {
    private String fileFormat;

    public EBook(String ISBN, String title, String author, String fileFormat) {
        super(ISBN, title, author);
        this.fileFormat = fileFormat;
    }

    public void displayDetails() {
        System.out.println("ISBN: " + ISBN + ", Title: " + title + ", File Format: " + fileFormat);
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
		//creating object for EBook
        EBook ebook = new EBook("123-456-789", "Java Programming", "James Gosling", "PDF");
        ebook.displayDetails();
        System.out.println("Author: " + ebook.getAuthor());
    }
}
