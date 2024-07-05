package lab7;

public class Calculator {

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
		System.out.println(calculateSum(2, 3));
		System.out.println(calculateSum(1.2, 2.3, 3.4));
		System.out.println(calculateSum(new int[]{1,2,3,4,5}));
	}
}

