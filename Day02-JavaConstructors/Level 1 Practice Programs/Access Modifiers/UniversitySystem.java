class Student {
    public int rollNumber;
    protected String name;
    private double CGPA;

    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    public double getCGPA() {
        return CGPA;
    }

    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value.");
        }
    }
}

class PostgraduateStudent extends Student {
    private String postGraduationSubject;

    public PostgraduateStudent(int rollNumber, String name, double CGPA, String postGraduationSubject) {
        super(rollNumber, name, CGPA);
        this.postGraduationSubject = postGraduationSubject;
    }

    public void displayDetails() {
        System.out.println("Roll Number: " + rollNumber + ", Name: " + name + ", CGPA: " + getCGPA() + ", Thesis Title: " + postGraduationSubject);
    }
}

public class UniversitySystem {
    public static void main(String[] args) {
        PostgraduateStudent pgStudent = new PostgraduateStudent(101, "Ankit", 9.0, "AI in Education");
        pgStudent.displayDetails();
        pgStudent.setCGPA(9.5);
        pgStudent.displayDetails();
    }
}
