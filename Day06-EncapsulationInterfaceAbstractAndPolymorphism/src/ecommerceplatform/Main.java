package ecommerceplatform;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Electronics laptop = new Electronics(101,"Ideapad gaming 3",50000,10);
        laptop.assignTaxPercentage(18.5);

        Clothing tshirt = new Clothing(102,"T-Shirt", 1000, 15);
        tshirt.assignTaxPercentage(5.0);

        Groceries rice = new Groceries(103, "Rice", 2000,18);

        ArrayList<Product> product = new ArrayList<>();
        product.add(laptop);
        product.add(tshirt);
        product.add(rice);

        for(Product p : product){
            p.displayProductDetails();
            if (p instanceof Taxable) System.out.printf("The tax on %s is %.2f%%%n",p.getName(),((Taxable) p).getTaxDetails());

            System.out.println("The discount amount is :"+p.calculateDiscount());
            if (p instanceof Taxable) {
                System.out.println("After all deduction the new price is :" + (p.getPrice() + ((Taxable) p).calculateTax() - p.calculateDiscount()));
            }else{
                System.out.println("After all deduction the new price is :" + (p.getPrice() - p.calculateDiscount()));
            }

            System.out.println("----------------------------------------");
        }
    }
}
