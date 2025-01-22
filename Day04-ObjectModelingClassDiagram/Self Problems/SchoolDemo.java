import java.util.ArrayList;
import java.util.List;

class Course {
    private String courseName;
    private List<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("Course: " + courseName);
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
}

class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void enrollInCourse(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public void displayCourses() {
        System.out.println("Student: " + name + " is enrolled in:");
        for (Course course : courses) {
            System.out.println(course.courseName);
        }
    }
}

class School {
    private String name;
    private List<Student> students;

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void displayStudents() {
        System.out.println("School: " + name);
        for (Student student : students) {
            System.out.println("Student: " + student.getName());
        }
    }
}

public class SchoolDemo {
    public static void main(String[] args) {
        School school = new School("Green Valley High");

        Student ankit = new Student("ankit");
        Student aakrati = new Student("aakrati");

        Course math = new Course("Math");
        Course science = new Course("Science");

        ankit.enrollInCourse(math);
        ankit.enrollInCourse(science);

        aakrati.enrollInCourse(math);

        school.addStudent(ankit);
        school.addStudent(aakrati);

        school.displayStudents();
        math.displayStudents();
        ankit.displayCourses();
    }
}
