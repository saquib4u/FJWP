package june19twoDArrays;
import java.util.Scanner;
//Square Matrix - Single Test Case
//Input
//• The first line of the input contains N the dimensions of the square matrix
//• The next N lines contains N space separated integers, denoting the elements of the matrix
//Output
//• Print the elements of the matrix row by row, by adding 1 to each element, as shown in the sample test case
//
//You have to take input by yourself  and out put should be like this not in string it should be number 
//
//Sample Input 1
//3
//1 2 3
//4 5 6 
//7 8 9
//
//Sample Output 1
//
//2 3 4 
//5 6  7
//8 9 10

public class PrintMatrix {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int mat[][]=new int[n][n];
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j]=scn.nextInt();
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				mat[i][j] += 1;
			}
		}
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(mat[i][j]);
			}
			System.out.println();
		}
	}
}
