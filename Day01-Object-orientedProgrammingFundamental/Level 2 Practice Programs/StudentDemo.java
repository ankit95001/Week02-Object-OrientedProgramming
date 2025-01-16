/*
Problem Statement:
Create a Student class with attributes name, rollNumber, and marks.
Add two methods:
1. To calculate the grade based on the marks.
2. To display the student's details and grade.
*/

class Student {
    String name;
    int rollNumber;
    double marks;
    Student(String name, int rollNumber, double marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
    }
    public char calculateGrade() {
        if (marks >= 90) {
            return 'A';
        } else if (marks >= 75) {
            return 'B';
        } else if (marks >= 60) {
            return 'C';
        } else if (marks >= 40) {
            return 'D';
        } else {
            return 'F'; // Failing grade
        }
    }
    public void displayDetails() {
        char grade = calculateGrade();
        System.out.printf("Student Details:\nName: %s\nRoll Number: %d\nMarks: %.2f\nGrade: %c%n", name, rollNumber, marks, grade);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        // Creating objects of the Student class
        Student student1 = new Student("Ankit Kumar", 101, 92.5);
        Student student2 = new Student("Riya Sharma", 102, 78.0);
        Student student3 = new Student("Aman Gupta", 103, 58.0);

        // Displaying details and grade of each student
        student1.displayDetails();
        student2.displayDetails();
        student3.displayDetails();
    }
}
