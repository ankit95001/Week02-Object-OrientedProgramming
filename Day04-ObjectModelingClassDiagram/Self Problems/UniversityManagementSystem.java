import java.util.ArrayList;
import java.util.List;

class Professor {
    private String name;

    public Professor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String name;

    public Course(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void enrollCourse(Course course) {
        System.out.println(name + " enrolled in " + course.getName());
    }
}

public class UniversityManagementSystem {
    public static void main(String[] args) {
        Student student = new Student("Aakrati");
        Professor professor = new Professor("Dr. Ankit");
        Course course = new Course("Data Structures");

        System.out.println(professor.getName() + " is teaching " + course.getName());
        student.enrollCourse(course);
    }
}
