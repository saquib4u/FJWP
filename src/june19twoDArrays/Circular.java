package june19twoDArrays;

import java.util.Scanner;

public class Circular {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		int N = scn.nextInt();
		int mat[][]=new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				mat[i][j]=scn.nextInt();
			}
		}
		
		//input
//		1
//		3
//		1 2 3
//		4 5 6
//		7 8 9
		
		//output
		//7 4 1 2 3 6 9 8
		
		while(t>0) {
			//i:rows, j:columns
			
			for(int i=N-1; i>=0; i--) {
				int j=0;
				System.out.print(mat[i][j] + " ");
			}
			for(int j=1; j<N-1; j++) {
				
				int i=0;
				System.out.print(mat[i][j]+" ");
			}
			for(int i=0; i<N; i++) {
				int j=N-1;
				System.out.print(mat[i][j]+" ");
			}
			for(int j=N-2; j>0; j--) {
				int i=N-1;
				System.out.print(mat[i][j]+" ");
			}
			
			t--;
		}
	}
}
