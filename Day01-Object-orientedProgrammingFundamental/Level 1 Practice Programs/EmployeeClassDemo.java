/*
Problem Statement: 
Write a program to create an Employee class with attributes name, id, and salary. 
Add a method to display the details.
*/
class Employee {
    String name;
    int id;
    int salary;
    Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }
    public void display() {
		System.out.printf("The name of employee with ID: %d is: %s and salary is: %d%n", this.id, this.name, this.salary);
	}
}

public class EmployeeClassDemo {
    public static void main(String[] args) {
        // Creating object of Employee class
        Employee e1 = new Employee("Ankit", 101, 250000);

        // Displaying result
        e1.display();
    }
}
