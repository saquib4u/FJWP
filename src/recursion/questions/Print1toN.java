package recursion.questions;

import java.util.Scanner;

public class Print1toN {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int N =scn.nextInt();
		print(N);
	}
	private static void print(int N) {
		if (N > 0) {
            print(N - 1);
            System.out.print(N + " ");
        }
	}

}
