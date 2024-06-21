package june20;
import java.util.Scanner;

public class SwastikaSum {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int[][]mat=new int[n][m];
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				mat[i][j]=scn.nextInt();
			}
		}
		/*
		sample input:
		3 5
		1 2 3 4 5
		6 7 8 9 10
		11 12 13 14 15

		sample output:
		0
		*/
		
		
		//sum1: top right to mid col then bisects vertically then goes to bottom left
		//top right: r=n-1, c=m-1 to m/2
		//bisect:  r=1 to n-1, c=m/2
		//bottom left: r=n-1, c=m/2 to 0
		int sum1 = 0;
		for(int c=m-1; c>=m/2; c--) {
			int r=0;
			sum1 += mat[r][c];
			//System.out.print(mat[r][c]+" ");
		}
		for(int r=1; r<n-1; r++) {
			int c=m/2;
			sum1 += mat[r][c];
		}
		for(int c=m/2; c>=0; c--) {
			int r=n-1;
			sum1 += mat[r][c];
		}
		System.out.println(sum1);
		//sum2: top left to mid row then bisects horizontally then goes to bottom right
		//top left: r=0 to n/2 - 1, c=0
		//bisect: r=n/2, c=0 to m
		//bottom right: r=n/2 + 1 to n, c=m-1
		int sum2 = 0;
		for(int r=0; r<=n/2 - 1; r++) {
			int c=0;
			sum2 += mat[r][c];
		}
		for(int c=0; c<m; c++) {
			int r=n/2;
			sum2 += mat[r][c];
		}
		for(int r = n/2 + 1; r<n; r++) {
			int c=m-1;
			sum2 += mat[r][c];
		}
		
		System.out.println(sum2);
		System.out.println(sum1 - sum2);
	}
}
