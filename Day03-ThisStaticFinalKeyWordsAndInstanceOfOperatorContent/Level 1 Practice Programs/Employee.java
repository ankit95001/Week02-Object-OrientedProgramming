/*
Sample Program 3: Employee Management System
Design an Employee class with the following features:
Static:
A static variable companyName shared by all employees.
A static method displayTotalEmployees() to show the total number of employees.
This:
Use this to initialize name, id, and designation in the constructor.
Final:
Use a final variable id for the employee ID, which cannot be modified after assignment.
Instanceof:
Check if a given object is an instance of the Employee class before printing the employee details.
*/

public class Employee{
	static String companyName = "Abc Pvt. Ltd.";
	final int id;
	String name;
	String designation;
	static int totalEmployee=0;
	
	Employee(String name, String designation, int id){
		this.name=name;
		this.designation=designation;
		this.id = id;
		totalEmployee++;
	}
	
	static int getTotalAccounts(){
		return totalEmployee;
	}
	
	public void display(){
		System.out.printf("Hii %s, you are working in company %s, with employee id %d, having designation %s",name,companyName,id,designation);
	}
	public static void main(String[] args){
		Employee e1 = new Employee("Ankit", "Developer",101);
		Employee e2 = new Employee("Aakrati", "HR",102);
		Employee e3 = new Employee("Anand", "Manager",103);
		
		System.out.printf("This company have total %s employee%n",Employee.totalEmployee);
		
		if(e2 instanceof Employee){
			e2.display();
		}else{
			System.out.println("This account is not belongs to this bank");
		}
	}
}