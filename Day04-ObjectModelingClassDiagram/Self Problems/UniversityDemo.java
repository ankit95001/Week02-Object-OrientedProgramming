import java.util.ArrayList;
import java.util.List;

class Faculty {
    private String name;

    public Faculty(String name) {
        this.name = name;
    }
	
    public String displayFaculty() {
        return "Faculty [Name: " + name + "]";
    }
}

class Department {
    private String name;

    public Department(String name) {
        this.name = name;
    }

    public String displayDepratment() {
        return "Department [Name: " + name + "]";
    }
}

class University {
    private String name;
    private List<Department> departments;
    private List<Faculty> faculties;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
        this.faculties = new ArrayList<>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }
	
    public String displayUniversity() {
        return "University [Name: " + name + ", Departments: " + departments + ", Faculties: " + faculties + "]";
    }
}

public class UniversityDemo {
    public static void main(String[] args) {
        University university = new University("RGPV University");

        Department cs = new Department("Computer Science");
        Department mech = new Department("Mechanical");

        Faculty profJohn = new Faculty("Prof. Ankit");
        Faculty profAlice = new Faculty("Prof. Aakrati");

        university.addDepartment(cs);
        university.addDepartment(mech);

        university.addFaculty(profJohn);
        university.addFaculty(profAlice);

        System.out.println(university.displayUniversity());
    }
}
