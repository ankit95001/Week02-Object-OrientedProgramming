package ecommerceplatform;

public class Groceries extends Product{
    private double discountRate;

    public Groceries(int productId, String name, int price,double discountRate) {
        super(productId, name, price);
        this.discountRate=discountRate;
    }


    @Override
    public double calculateDiscount() {
        return getPrice()*discountRate/100;
    }

}
