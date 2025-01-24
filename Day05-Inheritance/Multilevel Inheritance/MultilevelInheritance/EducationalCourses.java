/*
Sample Problem 2: Educational Course Hierarchy
Description: Model a course system where Course is the base class, OnlineCourse is a subclass, and PaidOnlineCourse extends OnlineCourse.
Tasks:
Define a superclass Course with attributes like courseName and duration.
Define OnlineCourse to add attributes such as platform and isRecorded.
Define PaidOnlineCourse to add fee and discount.
Goal: Demonstrate how each level of inheritance builds on the previous, adding complexity to the system.
 */
package MultilevelInheritance;
class Course {
    String courseName;
    int duration;

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseDetails() {
        return "Course: " + courseName + ", Duration: " + duration + " hours";
    }
}

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    public String getCourseDetails() {
        return super.getCourseDetails() + ", Platform: " + platform + ", Recorded: " + isRecorded;
    }
}

class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; 

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double getDiscountedFee() {
        return fee - (fee * discount / 100);
    }

    @Override
    public String getCourseDetails() {
        return super.getCourseDetails() + ", Fee: $" + fee + ", Discount: " + discount + "%, Discounted Fee: $" + getDiscountedFee();
    }
}

public class EducationalCourses {
    public static void main(String[] args) {
	
        Course course = new Course("Java Basics", 20);
        System.out.println(course.getCourseDetails());

        OnlineCourse onlineCourse = new OnlineCourse("Advanced Java", 30, "Udemy", true);
        System.out.println(onlineCourse.getCourseDetails());

        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Java for Professionals", 40, "Coursera", true, 200, 20);
        System.out.println(paidCourse.getCourseDetails());
    }
}
