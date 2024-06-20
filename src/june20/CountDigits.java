package june20;
import java.util.Arrays;
import java.util.Scanner;
//count 0s, 1s, and 2s in array
public class CountDigits {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int[] arr=new int[n];
		for(int i=0; i<n; i++) {
			arr[i]=scn.nextInt();
		}
		
		int countZero=0, countOne=0, countTwo=0;
		for(int i=0; i<n; i++) {
			if(arr[i]==0) countZero++;
			else if(arr[i]==1) countOne++;
			else countTwo++;
		}
		System.out.println(countZero +" " + countOne +" "+countTwo);
		
		//optimized approach
//		Arrays.sort(arr);
//		for(int i=0; i<n; i++) {
//			if(arr[i]!=arr[i+1]) {
//				countZero=i;
//				countOne=i;
//			}
//		}
		
		
	}
	
}
