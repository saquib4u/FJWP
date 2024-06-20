package june19twoDArrays;
import java.util.Scanner;


public class ReverseArrayTraversal {
	public static void main(String[] args) {
	 Scanner scn = new Scanner(System.in);
	 	int N = scn.nextInt();
		int M = scn.nextInt();
		int mat[][]=new int[N][M];
		for(int i=0; i<N; i++) {
			for(int j=0; j<M; j++) {
				mat[i][j]=scn.nextInt();
			}
		}
		//sample input
//		4 3
//		1 8 9
//		2 7 10
//		3 6 11
//		4 5 12
		// sample output
		// 9 10 11 12 8 7 6 5 1 2 3 4
		
		for(int q=M-1; q>=0; q--) {
			for(int p=0; p<N; p++) {
				System.out.print(mat[p][q]+" ");
				
			}
			
		}
	}
	 
}
