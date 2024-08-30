package dsa.test;

import java.util.Scanner;
//153=
//Armstrong number
//sum of  of each element is equal to no.
public class Question3 {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		boolean ans = findArmstrongNo(n);
		System.out.println(ans);

	}

	private static boolean findArmstrongNo(int n) {
		int num=n;
		int num2=n;
		int sum=0;
		int digits=0;
		while(num2 != 0) {
			num2 /= 10;
			digits++;
		}
		while(num!=0) {
			int r=num%10;
			sum += multiply(r, digits);
			//sum+= Math.pow(r, digits);
			//System.out.println(sum);
			num /= 10;
		}
		if(sum==n) {
			return true;
		}
		return false;
		
	}

	private static double multiply(int r, int digits) {
		int m=1;
		while(digits !=0) {
			m *= r;
			digits--;
		}
		return m;
		
		
	}

	

}
