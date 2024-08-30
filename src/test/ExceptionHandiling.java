package test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandiling {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        try {
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            
           
            if (b == 0) {
                throw new ArithmeticException("Dividing by zero");
            }

            System.out.println(a / b);
        } catch (InputMismatchException e) {
            
            System.out.println(e);
        } catch (ArithmeticException e) {
            
        	System.out.println(e);
        }

	}

}

