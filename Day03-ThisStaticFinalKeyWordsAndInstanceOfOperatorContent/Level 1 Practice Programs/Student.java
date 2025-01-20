/*
Sample Program 5: University Student Management
Create a Student class to manage student data with the following features:
Static:
A static variable universityName shared across all students.
A static method displayTotalStudents() to show the number of students enrolled.
This:
Use this in the constructor to initialize name, rollNumber, and grade.
Final:
Use a final variable rollNumber for each student that cannot be changed.
Instanceof:
Check if a given object is an instance of the Student class before performing operations like displaying or updating grades.
*/

public class Student{
	static String universityName = "RGPV";
	final String rollNumber;
	String name;
	char grade;
	static int totalStudents = 0;
	
	Student(String name, String rollNumber,char grade){
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
		totalStudents++;
	}
	
	static int getTotalStudents(){
		return totalStudents;
	}
	
	public void display(){
		System.out.printf("Your name %s with rollNumber %s having geade %c studing in %s%n",name,rollNumber,grade,universityName);
	}
	public static void main(String[] args){
		Student s1 = new Student("Ankit","0191CS211039",'A');
		Student s1 = new Student("Anand","0191CS211034",'B');
		Student s1 = new Student("Aakrati","0191CS211001",'C');
		
		System.out.printf("This university have total %d students%n",BankAccount.totalAccounts);
		
		if(s1 instanceOf BankAccount){
			s1.display();
		}else{
			System.out.println("This account is not belongs to this bank");
		}
	}
}