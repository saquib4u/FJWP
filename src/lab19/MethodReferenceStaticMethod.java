package lab19;

import java.util.function.Function;

public class MethodReferenceStaticMethod {
    // Functional interface
    interface SquareCalculator {
        double calculate(double number);
    }

    public static void main(String[] args) {
        // Method reference to a static method
        SquareCalculator calculator = MathOperations::square;

        double result = calculator.calculate(5.0);
        System.out.println("Square of 5.0: " + result);
    }
}

class MathOperations {
    public static double square(double number) {
        return number * number;
    }
}