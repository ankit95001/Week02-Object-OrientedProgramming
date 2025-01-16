/*
Problem Statement: 
Create a CartItem class with attributes itemName, price, and quantity. 
Add methods to:
	Add an item to the cart.
	Remove an item from the cart.
	Display the total cost.
*/


import java.util.ArrayList;

class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor for CartItem
    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

class CartItemDemo {
    ArrayList<CartItem> items;

    // Constructor to initialize the cart
    CartItemDemo() {
        this.items = new ArrayList<>();
    }

    // Method to add an item to the cart
    public void addItem(String itemName, double price, int quantity) {
        items.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to the cart.");
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        boolean found = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(itemName)) {
                items.remove(i);
                System.out.println(itemName + " removed from the cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println(itemName + " not found in the cart.");
        }
    }

    // Method to display the total cost of items in the cart
    public void displayTotalCost() {
        double totalCost = 0.0;
        for (CartItem item : items) {
            totalCost += item.price * item.quantity;
        }
        System.out.printf("Total cost: %.2f%n", totalCost);
    }

    // Main method
    public static void main(String[] args) {
        // Create a cart object
        CartItemDemo cart = new CartItemDemo();

        // Add items to the cart
        cart.addItem("Laptop", 50000, 1);
        cart.addItem("Mouse", 1500, 2);
        cart.addItem("Keyboard", 2000, 1);

        // Display total cost
        cart.displayTotalCost();

        // Remove an item from the cart
        cart.removeItem("Mouse");

        // Display total cost after removing an item
        cart.displayTotalCost();
    }
}
