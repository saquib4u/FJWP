package june12.overloading;

public class Calculator {
//	Create a Calculator class with a method calculateSum() that takes different parameters to calculate the sum of different types of data.
//	Calculate the sum of two integers.
//	Calculate the sum of three doubles.
//	Calculate the sum of an array of integers.
	public static int calculateSum(int a, int b) {
		return a+b;
	}
	public static double calculateSum(double a, double b, double c) {
		return a+b+c;
	}
	public static int calculateSum(int[] a) {
		int sumofArray = 0;
		for(int i=0; i<a.length; i++) {
			sumofArray += a[i];
		}
		return sumofArray;
	}
	public static void main(String args[]) {
		Calculator c1=new Calculator();
		System.out.println(calculateSum(1, 2));
		System.out.println(calculateSum(1.12, 2.12, 3.12));
		System.out.println(calculateSum(new int[]{1,2,3,4}));
	}
}
