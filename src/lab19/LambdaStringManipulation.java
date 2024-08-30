package lab19;

import java.util.function.UnaryOperator;

public class LambdaStringManipulation {
    public static void main(String[] args) {
        String originalString = "I'm Saquib!";

        // Lambda expression to convert to uppercase
        UnaryOperator<String> toUpperCase = s -> s.toUpperCase();
        System.out.println("Original: " + originalString);
        System.out.println("Uppercase: " + toUpperCase.apply(originalString));

        // Lambda expression to convert to lowercase
        UnaryOperator<String> toLowerCase = s -> s.toLowerCase();
        System.out.println("Lowercase: " + toLowerCase.apply(originalString));

        // Lambda expression to reverse the string
        UnaryOperator<String> reverse = s -> new StringBuilder(s).reverse().toString();
        System.out.println("Reversed: " + reverse.apply(originalString));
    }
}