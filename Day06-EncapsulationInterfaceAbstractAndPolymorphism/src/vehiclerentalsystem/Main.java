package vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicles = new ArrayList<>();

        // Adding Vehicles
        Car car = new Car("CAR123", 1000, "INS12345");
        Bike bike = new Bike("BIKE456", 500);
        Truck truck = new Truck("TRUCK789", 2000, "INS67890");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Display Rental and Insurance Details
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Type: " + vehicle.getType());
            System.out.println("Vehicle Number: " + vehicle.getVehicleNumber());
            System.out.println("Rental Cost for 5 days: " + vehicle.calculateRentalCost(5));

            if (vehicle instanceof Insurable insurable) {
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                System.out.println(insurable.getInsuranceDetails());
            }

            System.out.println("----------------------------------------");
        }
    }
}
