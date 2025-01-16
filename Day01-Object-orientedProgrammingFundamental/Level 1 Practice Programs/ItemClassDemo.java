/*
Problem Statement: 
Create an Item class with attributes itemCode, itemName, and price. 
Add a method to display item details and calculate the total cost for a given quantity.
*/
class Item {
    int itemCode;
    String itemName;
    int price;
    Item(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }
    public void display(int quantity) {
		int totalPrice = quantity*this.price;
		System.out.printf("The Item Code for %s is : %d and price of each unit is :$%d%n", this.itemName, this.itemCode, this.price);
		System.out.printf("Total price for %d units are $%d",quantity,totalPrice);
	}
}

public class ItemClassDemo {
    public static void main(String[] args) {
        Item i1 = new Item(101, "Cream", 50);

        // Displaying result
        i1.display(100);
    }
}