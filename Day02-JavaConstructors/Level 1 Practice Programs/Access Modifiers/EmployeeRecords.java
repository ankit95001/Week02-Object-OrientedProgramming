class Employee {
    public int employeeID;
    protected String department;
    private double salary;

    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public void setSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    public double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    private String teamName;

    public Manager(int employeeID, String department, double salary, String teamName) {
        super(employeeID, department, salary);
        this.teamName = teamName;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + employeeID + ", Department: " + department + ", Salary: " + getSalary() + ", Team Name: " + teamName);
    }
}

public class EmployeeRecords {
    public static void main(String[] args) {
		//Creating object of Manager class
        Manager manager = new Manager(1001, "IT", 75000.0, "Development");
        manager.displayDetails();
        manager.setSalary(80000.0);
        manager.displayDetails();
    }
}
