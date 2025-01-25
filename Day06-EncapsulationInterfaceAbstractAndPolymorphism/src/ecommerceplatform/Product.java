package ecommerceplatform;

public abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public int getProductId() {
        return productId;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    //abstract method
    public abstract double calculateDiscount();

    public void displayProductDetails(){
        System.out.println("The product id is :"+getProductId());
        System.out.println("The product name is :"+getName());
        System.out.println("The product price is :"+getPrice());
    }
}
