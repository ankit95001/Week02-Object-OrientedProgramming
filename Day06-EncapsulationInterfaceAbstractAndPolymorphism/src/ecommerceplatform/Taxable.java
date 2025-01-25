package ecommerceplatform;

public interface Taxable {
    void assignTaxPercentage(double taxPercentage);
    double calculateTax();

    double getTaxDetails();
}
