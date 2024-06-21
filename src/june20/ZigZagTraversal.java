package june20;

//input
//1st line n rows and m columns
//5 5
//4 7 1 1 7
//8 9 9 6 1
//6 4 9 5 1
//7 7 4 7 7
//8 6 2 5 5

//output
//7 1 1 7 4 8 9 9 6 1 1 5 9 4 6 7 7 4 7 7 5 5 2 6 8

// 1st row: last col, 2nd row: 1st col, 3rd r: last c, 4th r: 1st c, 5th r: last c 
public class ZigZagTraversal {
	public static void main(String[] args) {
		int[][] mat = {
				{4,7,1,1,7},
				{8,9,9,6,1},
				{6,4,9,5,1},
				{7,7,4,7,7},
				{8,6,2,5,5}
				};
		
		int c=mat[0].length;

		int r=0;
		while(r<mat.length) {
			if(r % 2==0) {
				for(int i=c-1; i>=0; i--) {
					System.out.print(mat[r][i]+" ");
				}
			}else {
				for(int i=0; i<c; i++) {
					System.out.print(mat[r][i]+" ");
				}
			}
			r++;
		}
		
		
	}
	
}
