import java.util.ArrayList;
import java.util.List;

class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String displayEmployee() {
        return "Employee [Name: " + name + "]";
    }
}

class Department {
    private String name;
    private List<Employee> employees;

    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public String displayDepartment() {
        return "Department [Name: " + name + ", Employees: " + employees + "]";
    }
}

class Company {
    private String name;
    private List<Department> departments;

    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public String displayCompany() {
        return "Company [Name: " + name + ", Departments: " + departments + "]";
    }
}

public class CompositionExampleCompanyAndDepartment {
    public static void main(String[] args) {
        Company company = new Company("TechCorp");

        Department itDepartment = new Department("IT");
        itDepartment.addEmployee(new Employee("John"));
        itDepartment.addEmployee(new Employee("Jane"));

        Department hrDepartment = new Department("HR");
        hrDepartment.addEmployee(new Employee("Alice"));

        company.addDepartment(itDepartment);
        company.addDepartment(hrDepartment);

        System.out.println(company.displayCompany());
    }
}
