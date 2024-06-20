package june19twoDArrays;
import java.util.Scanner;
public class SpiralTraversal {
		public static void main(String[] args) {
			Scanner scn = new Scanner(System.in);
			int t = scn.nextInt();
			while(t>0) {
				int N = scn.nextInt();//row
				int M = scn.nextInt();//col
				int mat[][]=new int[N][M];
				for(int i=0; i<N; i++) {
					for(int j=0; j<M; j++) {
						mat[i][j]=scn.nextInt();
					}
				}
				
//				input			
//				2
//				3 4
//				1 2 3 4
//				5 6 7 8
//				9 10 11 12
				
//				4 3
//				1 2 3
//				4 5 6
//				7 8 9
//				10 11 12
				
//				output
//				1 5 9 10 11 12 8 4 3 2 6 7
//				1 4 7 10 11 12 9 6 3 2 5 8
				
				//1st column
				for(int i=0; i<N; i++) {
					int j=0;
					System.out.print(mat[i][j]+" ");
				}
				//last row
				for(int j=1; j<M-1; j++) {
					int i=N-1;
					System.out.print(mat[i][j]+" ");
				}
				//last column
				for(int i=N-1; i>=0; i--) {
					int j=M-1;
					System.out.print(mat[i][j]+" ");
				}
				//1st row
				for(int j=M-2; j>0; j--) {
					int i=0;
					System.out.print(mat[i][j]+" ");
				}
				//2nd column down
				for(int i=1; i<N-1; i++) {
					int j=1;
					System.out.print(mat[i][j]+" ");
				}
				//last 2nd row
				for(int j=2; j<M-1; j++) {
					int i=N-2;
					System.out.print(mat[i][j]+" ");
				}
				
				
				
			t--;
			}
			
			
			
		}
}
