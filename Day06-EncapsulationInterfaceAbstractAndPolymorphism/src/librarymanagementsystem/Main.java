package librarymanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<LibraryItem> libraryItems = new ArrayList<>();

        // Adding Items
        Book book = new Book("B001", "The Great Gatsby", "F. Scott Fitzgerald");
        Magazine magazine = new Magazine("M001", "National Geographic", "Various Authors");
        DVD dvd = new DVD("D001", "Inception", "Christopher Nolan");

        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(dvd);

        // Processing Library Items
        for (LibraryItem item : libraryItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                Reservable reservable = (Reservable) item;
                System.out.println("Availability: " + (reservable.checkAvailability() ? "Available" : "Not Available"));
                reservable.reserveItem("John Doe");
            }

            System.out.println("--------------------------------");
        }
    }
}
