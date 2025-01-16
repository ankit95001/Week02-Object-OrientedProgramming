/*
Problem Statement:
Write a program to create a Circle class with an attribute radius. 
Add methods to calculate and display the area and circumference of the circle.
*/
class Circle {
    double radius;
	static double pi = 3.14;
    Circle(double radius) {
        this.radius = radius;
    }
	
	public double calculateArea(){
		return pi*radius*radius;
	}
	
	public double calculateCircumference(){
		return pi*2*radius;
	}
}

public class CircleClassDemo {
    public static void main(String[] args) {
        // Creating object of Circle class
        Circle c1 = new Circle(5.2);
		
		double area = c1.calculateArea();
		double circumference = c1.calculateCircumference();

        // Displaying result
        System.out.printf("The Circumference and Area of circle with radius : %.2f is  %.2f %.2f%n",c1.radius, circumference, area);
    }
}