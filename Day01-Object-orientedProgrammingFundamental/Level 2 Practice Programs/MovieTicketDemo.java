/*
Problem Statement:
Create a MovieTicket class with attributes movieName, seatNumber, and price. 
Add methods to:
	1. Book a ticket (assign seat and update price).
	2. Display ticket details.
*/

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;
	
    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = -1;
        this.price = 0.0;
    }

    public void bookTicket(int seatNumber, double price) {
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully!");
    }
	
    public void displayDetails() {
        if (seatNumber == -1) {
            System.out.println("No ticket has been booked yet.");
        } else {
            System.out.printf("Movie: %s\nSeat Number: %d\nPrice: %.2f%n", movieName, seatNumber, price);
        }
    }
}

public class MovieTicketDemo {
    public static void main(String[] args) {
        // Create a MovieTicket object
        MovieTicket ticket = new MovieTicket("Inception");

        // Book a ticket
        ticket.bookTicket(12, 250.50);

        // Display ticket details
        ticket.displayDetails();
    }
}
