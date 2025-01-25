package employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        // Adding Employees
        FullTimeEmployee emp1 = new FullTimeEmployee(1, "Ankit kumar", 50000);
        emp1.assignDepartment("IT");

        PartTimeEmployee emp2 = new PartTimeEmployee(2, "Aakrati Barsaiyan", 0, 20, 50);
        emp2.assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        // Display Employee Details
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println("Calculated Salary: " + emp.calculateSalary());

            // Polymorphic Behavior for Department
            if (emp instanceof Department) {
                System.out.println(((Department) emp).getDepartmentDetails());
            }
            System.out.println("***************************************");
        }
    }
}