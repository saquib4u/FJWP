package august20;
import java.util.Arrays;

public class ElementsWithSumK {

	public static void main(String[] args) {
//		int a[]  = {12,7,6,4,5,33} ;
//		//Arrays.sort(a);
//		
//		int sum =12;
//		for(int k=0; k<a.length; k++) {
//			for(int j=k+1; j<a.length; j++) {
//				if(a[k] + a[j] == sum) { 
//					System.out.println(a[k] + " " + a[j]);
//				}
//			}
//			
//		}
		
		int ar[]  = {12,7,6,4,5,33};
		Arrays.sort(ar);//4,5,6,7,12,33
		int target=12;
		int left=0;
		int right = ar.length - 1;
		while(left<right) {
			int csum= ar[left] + ar[right];
			if(csum == target) {	
				System.out.println(ar[left] + " "+ar[right]);
				break;
			}else if(csum > target) {
				right--;	
			}else {
				left++;
				
			}
		}
		

	}

}
