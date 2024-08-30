package calculate;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner scn= new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("Menu: ");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Exit");
			
			System.out.println("Choose option: ");
			int option = scn.nextInt();
			
			System.out.println("Enter 1st number: ");
			double num1= scn.nextDouble();
			System.out.println("Enter 2nd number: ");
			double num2= scn.nextDouble();
		
			
			switch(option) {
				case 1:
//					System.out.println("Enter 1st number: ");
//					double num1= scn.nextDouble();
//					System.out.println("Enter 2nd number: ");
//					double num2= scn.nextDouble();
					System.out.println("Result: " + add(num1, num2));
					break;
				
				case 2:
//					System.out.println("Enter 1st number: ");
//					num1= scn.nextDouble();
//					System.out.println("Enter 2nd number: ");
//					num2= scn.nextDouble();
					System.out.println("Result: " + subtract(num1, num2));
					break;
				
				case 3:
//					System.out.println("Enter 1st number: ");
//					 num1= scn.nextDouble();
//					System.out.println("Enter 2nd number: ");
//					num2= scn.nextDouble();
					System.out.println("Result: " + multiply(num1, num2));
					break;
				
				case 4:
//					System.out.println("Enter 1st number: ");
//					num1= scn.nextDouble();
//					System.out.println("Enter 2nd number: ");
//					num2= scn.nextDouble();
					
					System.out.println("Result: " + divide(num1, num2));
					break;
				
				case 5:
//					flag=false;
					System.out.println("Exit..");
//					break;
					System.exit(0);
				default:
					System.out.println("Please choose a valid option");
			}
		}
	}
	public static double add(double num1, double num2) {
		return num1 + num2;
	}
	public static double subtract(double num1, double num2) {
		return num1 - num2;
	}
	public static double multiply(double num1, double num2) {
		return num1 * num2;
	}
	public static double divide(double num1, double num2) {
		if(num2 == 0) {
			throw new ArithmeticException();
		}
		return num1 / num2;
	}
	public void calculate() {
		// TODO Auto-generated method stub
		
	}


}
