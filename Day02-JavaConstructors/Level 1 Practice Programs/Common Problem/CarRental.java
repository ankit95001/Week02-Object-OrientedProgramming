public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;

    public CarRental() {
        this.customerName = "Unknown";
        this.carModel = "Standard";
        this.rentalDays = 1;
    }

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    // Method to calculate total cost
    public double calculateTotalCost() {
        double dailyRate;
        switch (carModel.toLowerCase()) {
            case "suv":
                dailyRate = 1000.0;
                break;
            case "sedan":
                dailyRate = 700.0;
                break;
            default:
                dailyRate = 500.0;
                break;
        }
        return dailyRate * rentalDays;
    }

    public String getData() {
        return "Customer Name: " + customerName + ", Car Model: " + carModel + ", Rental Days: " + rentalDays;
    }

    public static void main(String[] args) {
        CarRental defaultRental = new CarRental();
        CarRental customRental = new CarRental("Jane Doe", "SUV", 5);

        System.out.println(getData(defaultRental));
        System.out.println("Total Cost: " + defaultRental.calculateTotalCost());

        System.out.println(getData(customRental));
        System.out.println("Total Cost: " + customRental.calculateTotalCost());
    }
}
