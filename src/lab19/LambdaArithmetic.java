package lab19;

public class LambdaArithmetic {
    public static void main(String[] args) {
        double num1 = 10.0;
        double num2 = 2.0;

        // Lambda expression for addition
        java.util.function.BiFunction<Double, Double, Double> add = (a, b) -> a + b;
        System.out.println("Addition: " + add.apply(num1, num2));

        // Lambda expression for subtraction
        java.util.function.BiFunction<Double, Double, Double> subtract = (a, b) -> a - b;
        System.out.println("Subtraction: " + subtract.apply(num1, num2));

        // Lambda expression for multiplication
        java.util.function.BiFunction<Double, Double, Double> multiply = (a, b) -> a * b;
        System.out.println("Multiplication: " + multiply.apply(num1, num2));

        // Lambda expression for division
        java.util.function.BiFunction<Double, Double, Double> divide = (a, b) -> b != 0 ? a / b : Double.NaN;
        System.out.println("Division: " + divide.apply(num1, num2));
    }
}