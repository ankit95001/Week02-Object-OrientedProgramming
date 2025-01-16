/*
Problem Statement:
Create a MobilePhone class with attributes brand, model, and price.
Add a method to display all the details of the phone.
*/

class MobilePhone {
    String brand;
    String model;
    double price;
    MobilePhone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Method to display details of the phone
    public void displayDetails() {
        System.out.printf("Mobile Phone Details:\nBrand: %s\nModel: %s\nPrice: %.2f%n", brand, model, price);
    }
}

public class MobilePhoneDemo {
    public static void main(String[] args) {
        // Creating objects of MobilePhone class
        MobilePhone phone1 = new MobilePhone("Apple", "iPhone 13", 79999.99);
        MobilePhone phone2 = new MobilePhone("Samsung", "Galaxy S22", 69999.49);

        // Displaying details of each phone
        phone1.displayDetails();
        phone2.displayDetails();
    }
}
