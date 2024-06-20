package june19twoDArrays;
//Transpose the Matrix
//
//Description
//The transpose of a matrix is an operator which flips a matrix over its diagonal, that is it switches the row and column of the matrix by producing another matrix_
//See sample test case for better understanding
//So, given an array of n rows and m columns, generate the transpose of the matrix.
//Input
//Input Format:
//First line contains two integers n and m
//Next n lines contain m integers which represents each row of 2d array
//Constraints:
//n,m <= 500
//
//Output
//Print the transposed array
//
//Sample Input 
// 
//3 4
//0 0 0 0
//1 1 1 1
//2 2 2 2
//
//
//Sample output 
//
//0 1 2
//0 1 2
//0 1 2
//0 1 2

import java.util.Scanner;

public class TransposeMatrix {
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
		
		int tm[][]=new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				tm[i][j]=mat[j][i];
				System.out.print(tm[i][j] +" ");
			}
			System.out.println();
		}
	}
}
