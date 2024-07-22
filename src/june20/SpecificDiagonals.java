package june20;

import java.util.Scanner;

public class SpecificDiagonals {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int R=scn.nextInt();
		int C=scn.nextInt();
		int[][]mat=new int[R][C];
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				mat[i][j]=scn.nextInt();
			}
		}
		int k=scn.nextInt();
/*
Sample Input
3 3
1 2 3
4 5 6
7 8 9
6

Output
2 6
6 8
 */
		int kr=0;
		int kc=0;
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
				if(mat[i][j]==k) {
					kr=i;
					kc=j;
				}
			}
		}
//		while(kr--) {
//		for(int i=0; i<R-1; i++) {
//			for(int j=0; j<C-1; j++) {
//				
//			}
//		}
//		
//		}
	}
}
