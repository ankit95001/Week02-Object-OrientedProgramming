/*
Employee Management System
Description: Create an Employee hierarchy for different employee types such as Manager, Developer, and Intern.
Tasks:
Define a base class Employee with attributes like name, id, and salary, and a method displayDetails().
Define subclasses Manager, Developer, and Intern with unique attributes for each, like teamSize for Manager and programmingLanguage for Developer.
Goal: Practice inheritance by creating subclasses with specific attributes and overriding superclass methods.
*/
package AssistedProblems;
class Employee{
	protected String name;
	protected int id;
	protected int salary;
	Employee(){};
	Employee(String name, int id, int salary){
		this.name = name;
		this.id = id;
		this.salary = salary;
	}
	
	public void displayDetails(){
		System.out.println("Nothing to Display");
	}
}

class Manager extends Employee{
	int teamSize;
	Manager(String name, int id, int salary,int teamSize){
		super(name,id,salary);
		this.teamSize=teamSize;
	}
	@Override
	public void displayDetails(){
		System.out.printf("The name of Manager %s with id %d,with team size %d, having salary %d%n",name,id,teamSize,salary);
	}
}

class Developer extends Employee{
	String programmingLanguage;
	Developer(String name, int id, int salary,String programmingLanguage){
		super(name,id,salary);
		this.programmingLanguage=programmingLanguage;
	}
	@Override
	public void displayDetails(){
		System.out.printf("The name of Developer %s with id %d, having salary %d knows programmingLanguage %s%n",name,id,salary,programmingLanguage);
	}
}

class Intern extends Employee{
	
	Intern(String name, int id, int salary){
		super(name,id,salary);
	}
	@Override
	public void displayDetails(){
		System.out.printf("The name of Intern %s with id %d, having salary %d%n",name,id,salary);
	}
}
	

public class EmployeeManagementSystem{
	public static void main(String[] args){
		Employee employee = new Employee();
		employee.displayDetails();
		
		Employee manager = new Manager("Ankit",101,1000000,5);
		manager.displayDetails();
		
		Employee developer = new Developer("Anand",102,100000,"Java");
		developer.displayDetails();
		
		Employee intern = new Intern("Aakrati",103,10000);
		intern.displayDetails();
		
	}
}