/*
Vehicle and Transport System
Description: Design a vehicle hierarchy where Vehicle is the superclass, and Car, Truck, and Motorcycle are subclasses with unique attributes.
Tasks:
Define a superclass Vehicle with maxSpeed and fuelType attributes and a method displayInfo().
Define subclasses Car, Truck, and Motorcycle, each with additional attributes, such as seatCapacity for Car.
Demonstrate polymorphism by storing objects of different subclasses in an array of Vehicle type and calling displayInfo() on each.
Goal: Understand how inheritance helps in organizing shared and unique features across subclasses and use polymorphism for dynamic method calls.

*/
package AssistedProblems;
class Vehicle{
	protected int maxSpeed;
	protected String fuelType;
	
	Vehicle(){}
	
	Vehicle(int maxSpeed, String fuelType){
		this.maxSpeed=maxSpeed;
		this.fuelType=fuelType;
	}
	public void displayInfo(){
		System.out.println("Nothing to display");
	}
}

class Car extends Vehicle{
	int seatCapacity;
	Car(int maxSpeed,String fuelType, int seatCapacity){
		super(maxSpeed,fuelType);
		this.seatCapacity=seatCapacity;
	}
	@Override
	public void displayInfo(){
		System.out.printf("The Car have max speed of %dkmph, having fuel type %s, and total capacity is %d%n",maxSpeed,fuelType,seatCapacity);
	}
}
class Truck extends Vehicle{
	int numberOfVehicle;
	Truck(int maxSpeed,String fuelType, int numberOfVehicle){
		super(maxSpeed,fuelType);
		this.numberOfVehicle=numberOfVehicle;
	}
	@Override
	public void displayInfo(){
		System.out.printf("The Truck have max speed of %dkmph, having fuel type %s, and total number of vehicle in truck is %d%n",maxSpeed,fuelType,numberOfVehicle);
	}
}
class Motorcycle extends Vehicle{
	Motorcycle(int maxSpeed,String fuelType){
		super(maxSpeed,fuelType);
	}
	@Override
	public void displayInfo(){
		System.out.printf("The Motorcycle have max speed of %dkmph, having fuel type %s%n",maxSpeed,fuelType);
	}
}

public class TransportSystem{
	public static void main(String[] args){
		Vehicle vehicle = new Vehicle();
		vehicle.displayInfo();
		
		Vehicle car = new 	Car(200,"petrol",8);
		car.displayInfo();
		
		Vehicle truck = new Truck(80,"diesel",12);
		truck.displayInfo();
		
		Vehicle motorCycle = new Motorcycle(100,"Petrol");
		motorCycle.displayInfo();
	}
}