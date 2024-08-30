package lab16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleInputmismatchException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean validInput = false;
        int number = 0;

        while (!validInput) {
            try {
                System.out.print("Enter an integer: ");
                number = scanner.nextInt();
                validInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                scanner.next(); // discard the invalid input
            }
        }

        System.out.println("You entered: " + number);
        scanner.close();
    }
}
