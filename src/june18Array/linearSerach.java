package june18Array;

import java.util.Arrays;

public class linearSerach {
	public static void main(String [] args) {
		int [] arr  = {23,27,64,75,90,83,24}  ;// you have to find weather 83 is //present 
		boolean flag=false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==83) {
				flag=true;
				System.out.println("Yes");
				break;
			}
		}
		if(flag==false)
			System.out.println("No");
		
//	find those two value whose sum  == 13
		int a[]  = {4,6,71,8,5} ;
		Arrays.sort(a);
		
		int sum =13;
		for(int k=0; k<a.length; k++) {
			for(int j=k+1; j<a.length; j++) {
				if(a[k] + a[j] == sum) {
					System.out.println("Using two loops");
					System.out.println(a[k] + " " + a[j]);
				}
			}
			
		}
//		
//		for(int s = 0; s<a.length; s++) {
//			if(a[s] + a[a.length - s - 1] == sum) {
//				System.out.println("Using only one loop");
//				System.out.println(a[s] + " " + a[a.length - s -1]);
//			}
//		}
		int ar[]  = {4,6,71,8,5} ;
		int target=13;
		int left=ar[0];
		int right = ar.length - 1;
		while(left<right) {
			int csum= ar[left] + ar[right];
			if(csum == target) {	
				System.out.println(ar[left] + " "+ar[right]);
				break;
			}else if(csum != target && left != right - 1) {
				right--;
				
			}else {
				left++;
				right = ar.length-1;
			}
		}
	}
}
