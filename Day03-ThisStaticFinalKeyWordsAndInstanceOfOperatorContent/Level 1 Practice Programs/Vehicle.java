/*
Sample Program 6: Vehicle Registration System
Create a Vehicle class with the following features:
Static:
A static variable registrationFee common for all vehicles.
A static method updateRegistrationFee() to modify the fee.
This:
Use this to initialize ownerName, vehicleType, and registrationNumber in the constructor.
Final:
Use a final variable registrationNumber to uniquely identify each vehicle.
Instanceof:
Check if an object belongs to the Vehicle class before displaying its registration details.
*/
class Vehicle {
    private static double registrationFee = 500.0;
    private final String registrationNumber;
    private String ownerName;
    private String vehicleType;

    public Vehicle(String registrationNumber, String ownerName, String vehicleType) {
        this.registrationNumber = registrationNumber;
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }

    public void displayDetails() {
        if (this instanceof Vehicle) {
            System.out.println("Registration Number: " + registrationNumber);
            System.out.println("Owner Name: " + ownerName);
            System.out.println("Vehicle Type: " + vehicleType);
            System.out.println("Registration Fee: " + registrationFee);
        } else {
            System.out.println("Not a valid Vehicle object.");
        }
    }

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("V123", "ANKIT", "Car");
        Vehicle vehicle2 = new Vehicle("V456", "ANAND", "Bike");

        vehicle1.displayDetails();
        vehicle2.displayDetails();

        Vehicle.updateRegistrationFee(600.0);

        System.out.println("\nAfter updating registration fee:");
        vehicle1.displayDetails();
    }
}
