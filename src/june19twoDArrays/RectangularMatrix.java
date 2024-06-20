package june19twoDArrays;
import java.util.Scanner;
//Rectangular Matrix
//
//Description
//Rectangular Matrix - Single Test Case
//Input
//• The first line of the input contains N and m , the dimensions of the matrix
//• The next N line contains M space separated integers, denoting the elements of the matrix
//Output
//• Print the elements of the matrix, row by row, by adding 1 to each element, as shown in the sample input
//
//
//
//
//Sample Input 1
//3 4
//1 2 3 4
//5 6 7 8
//9 10 11 12 
//
//Sample Output 1
//
//2 3 4 5
//6 7 8 9
//10 11 12 13

import java.util.Scanner;

public class RectangularMatrix {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int M = scn.nextInt();
		int N = scn.nextInt();
		int mat[][]=new int[M][N];
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j]=scn.nextInt();
			}
		}
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j] += 1;
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
	}
}
