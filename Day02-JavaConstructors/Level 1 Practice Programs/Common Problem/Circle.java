public class Circle {
    private double radius;

    public Circle() {
        this(1.0);
    }
	
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius > 0) {
            this.radius = radius;
        } else {
            System.out.println("Radius must be positive.");
        }
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
        // Create a circle with default radius
        Circle defaultCircle = new Circle();
        System.out.println("Default Radius: " + defaultCircle.getRadius());
        System.out.println("Default Area: " + defaultCircle.getArea());

        // Create a circle with a user-provided radius
        Circle customCircle = new Circle(5.0);
        System.out.println("Custom Radius: " + customCircle.getRadius());
        System.out.println("Custom Area: " + customCircle.getArea());
    }
}
