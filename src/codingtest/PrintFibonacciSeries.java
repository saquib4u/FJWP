package codingtest;
import java.util.Scanner;

//Print first n fibonacci series
public class PrintFibonacciSeries {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		//Taking user input as no. of terms to be printed
		System.out.print("Enter no. of terms: ");
		int n=scn.nextInt();
		
		//checking if user entered negative integer
		if(n<=0) {
			System.out.println("Error: n should be greter than 0");
		}
		else {
			//print Fibonacci series upto n term
			System.out.println("Printing Fibonacci series: ");
			int a=0; //1st term is 0
			int b=1; //2nd term is 1
			for(int i=0; i<n; i++) {
				System.out.print(a+" ");
				//swap and update value
				int temp=a;				//temp: 0 1 1
				a=b;					//a:    1 1 2
				b += temp;				//b:    1 2 3
			}
		}
	}

}
