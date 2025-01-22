import java.util.ArrayList;
import java.util.List;

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String displayProduct() {
        return name + " ($" + price + ")";
    }
}

class Order {
    private List<Product> products;

    public Order() {
        this.products = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void displayOrder() {
        System.out.println("Order Details:");
        for (Product product : products) {
            System.out.println(product.displayProduct());
        }
    }
}

class Customer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public void placeOrder(Order order) {
        System.out.println(name + " placed an order:");
        order.displayOrder();
    }
}

public class EcommerceDemo {
    public static void main(String[] args) {
        Product laptop = new Product("Laptop", 1200);
        Product phone = new Product("Phone", 800);

        Order order = new Order();
        order.addProduct(laptop);
        order.addProduct(phone);

        Customer customer = new Customer("Ankit");
        customer.placeOrder(order);
    }
}
