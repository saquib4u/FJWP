package june19twoDArrays;
import java.util.Scanner;
//input
//1 3
//1 2 3
//4 5 6
//7 8 9
//output
//6 2 4 8
public class DiamondTraversal {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while(t>0) {
			int N = scn.nextInt();
			
			int mat[][]=new int[N][N];
			for(int i=0; i<N; i++) {
				for(int j=0; j<N; j++) {
					mat[i][j]=scn.nextInt();
				}
			}
			
//			for(int i=N/2; i>=0; i--) {
//				int j=i+N/2;
//				System.out.print(mat[i][j]+" ");
//			}
//			for(int i=1; i<=N/2; i++) {
//				int j=N/2 - i;
//				System.out.print(mat[i][j]+" ");
//			}
//			for(int i=N/2 + 1; i<=N/2; i--) {
//				int j= N/2 -i;
//				System.out.print(mat[i][j]+" ");
//			}
//			for(int i=N/2 - 1; i<N/2; i++) {
//				int j= N/2 + i;
//				System.out.print(mat[i][j]+" ");
//			}
			
			int r=mat.length;
			int c=mat[0].length;
			for (int  i = r/2 , j= c-1 ; i>=0 && j >=c/2 ; i-- , j-- ) {
				System.out.print(mat[i][j]+" ");
			}
			
			
			for (int  i = 1 , j= c/2-1 ; i<= r/2 && j >=0 ; i++ , j-- ) {
				System.out.print(mat[i][j]+" ");
			}


			
			t--;
		}
	}
}
