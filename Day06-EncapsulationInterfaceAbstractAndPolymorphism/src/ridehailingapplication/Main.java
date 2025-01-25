package ridehailingapplication;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("C001", "Ankit", 15.0);
        Vehicle bike = new Bike("B001", "Aakrati", 10.0);
        Vehicle auto = new Auto("A001", "Anand", 12.0);

        // Update and Display GPS Locations
        GPS carGPS = (Car) car;
        carGPS.updateLocation("Downtown");
        System.out.println("Car Location: " + carGPS.getCurrentLocation());

        GPS bikeGPS = (Bike) bike;
        bikeGPS.updateLocation("City Square");
        System.out.println("Bike Location: " + bikeGPS.getCurrentLocation());

        GPS autoGPS = (Auto) auto;
        autoGPS.updateLocation("Mall Road");
        System.out.println("Auto Location: " + autoGPS.getCurrentLocation());

        // Calculate and Display Fares
        double distance = 10.5; // Distance in Km
        System.out.println("\nFare Details:");
        System.out.println("Car Fare: " + car.calculateFare(distance));
        System.out.println("Bike Fare: " + bike.calculateFare(distance));
        System.out.println("Auto Fare: " + auto.calculateFare(distance));
    }
}