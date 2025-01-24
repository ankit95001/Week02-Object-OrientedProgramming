/*
Sample Problem 2: Smart Home Devices
Description: Create a hierarchy for a smart home system where Device is the superclass and Thermostat is a subclass.
Tasks:
Define a superclass Device with attributes like deviceId and status.
Create a subclass Thermostat with additional attributes like temperatureSetting.
Implement a method displayStatus() to show each device's current settings.
Goal: Understand single inheritance by adding specific attributes to a subclass, keeping the superclass general.
*/
package SingleInheritance;
class Device{
	protected int deviceId;
	protected String status;
	
	Device(int deviceId, String status){
		this.deviceId=deviceId;
		this.status=status;
	}
}

class Thermostat extends Device{
	protected String temperatureSetting;
	
	Thermostat(int deviceId,String status,String temperatureSetting){
		super(deviceId,status);
		this.temperatureSetting=temperatureSetting;
	}
	
	public void display(){
		System.out.printf("The thermostat with device id %d, with status %s, and temperature setting %s%n",deviceId,status,temperatureSetting);
	}
}
	

class SmartHomeDevices{
	public static void main(String[] args){
		Thermostat thermostat = new Thermostat(101,"Running","increase");
		thermostat.display();
	}
}