/*
Sample Program 4: Shopping Cart System
Create a Product class to manage shopping cart items with the following features:
Static:
A static variable discount shared by all products.
A static method updateDiscount() to modify the discount percentage.
This:
Use this to initialize productName, price, and quantity in the constructor.
Final:
Use a final variable productID to ensure each product has a unique identifier that cannot be changed.
Instanceof:
Validate whether an object is an instance of the Product class before processing its details.
*/
class Product{
	static int discount=5;
	String productName;
	int price;
	int quantity;
	final String productID;
	Product(String productName, String productID,int price,int quantity){
		this.productName=productName;
		this.productID=productID;
		this.price=price;
		this.quantity=quantity;
	}
	static void updateDiscount(int updatedDiscount){
		discount=updatedDiscount;
	}
	void display(){
		System.out.printf("The %s with productID %s having price %d. The total quantity is %d",productName,productID,price,quantity);
	}
	public static void main(String[] args){
		Product p1 = new Product("Lux","S01",10,100);
		Product p2 = new Product("Dettol","S02",10,100);
		Product p3 = new Product("Face Powder","FP01",100,5);
		
		if(p1 instanceof Product){
			p3.display();
		}else{
			System.out.println("This objcet do not belogns to Product class");
		}
	}
}