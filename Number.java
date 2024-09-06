public class Number {
    private double value;

    // Constructor to initialize the instance variable
    public Number(double value) {
        this.value = value;
    }

    // Method to check if the number is zero
    public boolean isZero() {
        return value == 0;
    }

    // Method to check if the number is positive
    public boolean isPositive() {
        return value > 0;
    }

    // Method to check if the number is negative
    public boolean isNegative() {
        return value < 0;
    }

    // Method to check if the number is odd
    public boolean isOdd() {
        if (value % 1 != 0) {
            return false; // Non-integer values cannot be odd
        }
        return ((int) value) % 2 != 0;
    }

    // Method to check if the number is even
    public boolean isEven() {
        if (value % 1 != 0) {
            return false; // Non-integer values cannot be even
        }
        return ((int) value) % 2 == 0;
    }

    // Method to get the factorial of the number
    public double getFactorial() {
        if (value < 0 || value != (int) value) {
            // Factorial is not defined for negative or non-integer values
            throw new IllegalArgumentException("Factorial is only defined for non-negative integers.");
        }
        int intValue = (int) value;
        double result = 1;
        for (int i = 1; i <= intValue; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        // Create instances of Number class
        Number num1 = new Number(5.0);
        Number num2 = new Number(-3.0);
        Number num3 = new Number(0.0);
        Number num4 = new Number(7.0);
        Number num5 = new Number(4.5); // Non-integer value

        // Test the Number class methods
        System.out.println("Number: " + num1.value);
        System.out.println("isZero: " + num1.isZero());
        System.out.println("isPositive: " + num1.isPositive());
        System.out.println("isNegative: " + num1.isNegative());
        System.out.println("isOdd: " + num1.isOdd());
        System.out.println("isEven: " + num1.isEven());
        try {
            System.out.println("Factorial: " + num1.getFactorial());
        } catch (IllegalArgumentException e) {
            System.out.println("Factorial: " + e.getMessage());
        }

        System.out.println("\nNumber: " + num2.value);
        System.out.println("isZero: " + num2.isZero());
        System.out.println("isPositive: " + num2.isPositive());
        System.out.println("isNegative: " + num2.isNegative());
        System.out.println("isOdd: " + num2.isOdd());
        System.out.println("isEven: " + num2.isEven());
        try {
            System.out.println("Factorial: " + num2.getFactorial());
        } catch (IllegalArgumentException e) {
            System.out.println("Factorial: " + e.getMessage());
        }

        System.out.println("\nNumber: " + num3.value);
        System.out.println("isZero: " + num3.isZero());
        System.out.println("isPositive: " + num3.isPositive());
        System.out.println("isNegative: " + num3.isNegative());
        System.out.println("isOdd: " + num3.isOdd());
        System.out.println("isEven: " + num3.isEven());
        try {
            System.out.println("Factorial: " + num3.getFactorial());
        } catch (IllegalArgumentException e) {
            System.out.println("Factorial: " + e.getMessage());
        }

        System.out.println("\nNumber: " + num4.value);
        System.out.println("isZero: " + num4.isZero());
        System.out.println("isPositive: " + num4.isPositive());
        System.out.println("isNegative: " + num4.isNegative());
        System.out.println("isOdd: " + num4.isOdd());
        System.out.println("isEven: " + num4.isEven());
        try {
            System.out.println("Factorial: " + num4.getFactorial());
        } catch (IllegalArgumentException e) {
            System.out.println("Factorial: " + e.getMessage());
        }

        System.out.println("\nNumber: " + num5.value);
        System.out.println("isZero: " + num5.isZero());
        System.out.println("isPositive: " + num5.isPositive());
        System.out.println("isNegative: " + num5.isNegative());
        System.out.println("isOdd: " + num5.isOdd());
        System.out.println("isEven: " + num5.isEven());
        try {
            System.out.println("Factorial: " + num5.getFactorial());
        } catch (IllegalArgumentException e) {
            System.out.println("Factorial: " + e.getMessage());
        }
    }
}
