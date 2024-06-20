package june19twoDArrays;
import java.util.Scanner;
public class NTraversal {
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
		//7 4 1 5 9 6 3
		//Traversal logic 
		//20 10 00 11 22 12 02
		// Not 01 21
		while(t>0) {
			//answer matrix first column filling, starting from last row
			for(int i=N-1; i>=1; i--) {
				int j=0;
				System.out.print(mat[i][j] + " ");
			}
			for(int i=0; i<N-1; i++) {
				
				int j=i;
				System.out.print(mat[i][j]+" ");
			}
			for(int i=N-1; i>=0; i--) {
				int j=N-1;
				System.out.print(mat[i][j]+" ");
			}
			
			t--;
		}
		
	}
}
