package ecommerceplatform;

public class Clothing extends Product implements Taxable{
    private double discountRate;
    private double taxPercentage;


    public Clothing(int productId, String name, int price,double discountRate) {
        super(productId, name, price);
        this.discountRate=discountRate;
    }


    @Override
    public double calculateDiscount() {
        return getPrice()*discountRate/100;
    }

    @Override
    public void assignTaxPercentage(double taxPercentage) {
        this.taxPercentage=taxPercentage;
    }

    @Override
    public double calculateTax(){
        return getPrice()*(taxPercentage/100);
    }

    @Override
    public double getTaxDetails() {
        return taxPercentage;
    }
}
