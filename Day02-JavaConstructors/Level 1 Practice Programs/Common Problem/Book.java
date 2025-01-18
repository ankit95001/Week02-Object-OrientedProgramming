public class Book {
    private String title;
    private String author;
    private double price;
    private boolean availability;

    public Book(String title, String author, double price, boolean availability) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.availability = availability;
    }

    public boolean borrowBook() {
        if (availability) {
            availability = false;
            System.out.println("Book borrowed successfully!");
            return true;
        } else {
            System.out.println("Book is not available.");
            return false;
        }
    }

    public String getData() {
        return "Title: " + title + ", Author: " + author + ", Price: " + price + ", Available: " + availability;
    }

    public static void main(String[] args) {
        Book book = new Book("Java Programming", "James Gosling", 499.99, true);
        System.out.println(getData(book));
        book.borrowBook();
        System.out.println(getData(book));
    }
}
