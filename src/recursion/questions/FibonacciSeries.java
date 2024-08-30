package recursion.questions;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N =scn.nextInt();
		int n1=0, n2=1;
		printFibonacci(n1, n2, N);
	}
//5: 0 1 1 2 3
	private static void printFibonacci(int N, int n1, int n2) {
		
		int n3=n1+n2;
		//int n1=0, n2=1, n3=0;
		if(N>1) {
			n3=n1+n2;
			n1=n2;
			n2=n3;
			System.out.println(n3);
			printFibonacci(N-1, n1, n2);
		}else if(N==0) {
			System.out.println(0);
		}else {
			System.out.println(1);
		}
		
	}

}
