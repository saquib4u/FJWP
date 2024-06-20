package june19twoDArrays;
import java.util.Scanner;

public class ReverseNTraversal {
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
		//1 4 7 5 3 6 9
		while(t>0) {
					//first column
					for(int i=0; i<N; i++) {
						int j=0;
						System.out.print(mat[i][j] + " ");
					}
					//diagonal elements
					for(int i=N-2; i>0; i--) {
						int j=N-i-1;
						System.out.print(mat[i][j]+" ");
					}
//					//last column
					for(int i=0; i<N; i++) {
						int j=N-1;
						System.out.print(mat[i][j]+" ");
					}
					
					t--;
				}
	}
}
