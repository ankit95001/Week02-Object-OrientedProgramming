package onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FoodItem> foodOrder = new ArrayList<>();

        // Adding Food Items
        VegItem vegItem = new VegItem("Paneer Butter Masala", 200.0, 2);
        NonVegItem nonVegItem = new NonVegItem("Chicken Biryani", 300.0, 1);

        vegItem.applyDiscount(10.0);
        nonVegItem.applyDiscount(5.0);

        foodOrder.add(vegItem);
        foodOrder.add(nonVegItem);

        // Processing Food Items
        for (FoodItem item : foodOrder) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                System.out.println(discountable.getDiscountDetails());
            }
            System.out.println("Total Price: " + item.calculateTotalPrice());
            System.out.println("--------------------------------");
        }
    }
}
