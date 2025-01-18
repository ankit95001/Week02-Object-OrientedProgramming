public class Course {
    private String courseName;
    private int duration;
    private double fee;
    private static String instituteName = "Capgemini";

    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName + ", Duration: " + duration + " weeks, Fee: " + fee + ", Institute: " + instituteName);
    }

    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    public static void main(String[] args) {
		//Creating object of COurse class
        Course c1 = new Course("Java Programming", 12, 12000.0);
        Course c2 = new Course("Web Development", 10, 10000.0);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("BridgeLabs");

        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
