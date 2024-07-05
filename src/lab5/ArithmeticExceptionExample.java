package lab5;

public class ArithmeticExceptionExample {
	public static void main(String[] args) {
		try {
			int num = 25;
			int d=0;
			int result = num/d;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("Arithmetic Exception: Division by zero is not allowed.");
		}
	}
}
