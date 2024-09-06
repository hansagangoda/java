public class Circle {
    private double x; // x-coordinate of the center
    private double y; // y-coordinate of the center
    private double r; // radius of the circle

    // Default constructor
    public Circle() {
        this.x = 0;
        this.y = 0;
        this.r = 1; // Default radius
    }

    // Constructor with radius
    public Circle(double r) {
        this.x = 0;
        this.y = 0;
        this.r = r;
    }

    // Constructor with x, y, and radius
    public Circle(double x, double y, double r) {
        this.x = x;
        this.y = y;
        this.r = r;
    }

    // Method to calculate and return the area of the circle
    public double area() {
        return Math.PI * r * r;
    }

    // Method to calculate and return the circumference of the circle
    public double circumference() {
        return 2 * Math.PI * r;
    }

    // Method to calculate and return the diameter of the circle
    public double diameter() {
        return 2 * r;
    }

    // Main method to test the Circle class
    public static void main(String[] args) {
        // Create instances of Circle class
        Circle circle1 = new Circle(); // Default constructor
        Circle circle2 = new Circle(5); // Constructor with radius
        Circle circle3 = new Circle(2, 3, 7); // Constructor with x, y, and radius

        // Test Circle class methods
        System.out.println("Circle 1 (default):");
        System.out.println("Area: " + circle1.area());
        System.out.println("Circumference: " + circle1.circumference());
        System.out.println("Diameter: " + circle1.diameter());

        System.out.println("\nCircle 2 (radius 5):");
        System.out.println("Area: " + circle2.area());
        System.out.println("Circumference: " + circle2.circumference());
        System.out.println("Diameter: " + circle2.diameter());

        System.out.println("\nCircle 3 (center at (2, 3) with radius 7):");
        System.out.println("Area: " + circle3.area());
        System.out.println("Circumference: " + circle3.circumference());
        System.out.println("Diameter: " + circle3.diameter());
    }
}
