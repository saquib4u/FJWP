package august25;

public class ImplementMergeSort {
	
	
	public static void  divide(int arr[]  ,int si , int ei ) {
		if(si>=ei) {
			return ;
		}
		int mid  =  si+ (ei - si)/ 2  ;
		divide(arr,si  , mid) ;
		divide(arr, mid+1 , ei);
		mergeS(arr, si , mid  , ei) ;
		}
	
	public static void mergeS(int arr[] , int si  , int mid , int ei) {
		
		int[]merged  =  new int [ei-si+1];
		
		int idx1  = si  ;
		int idx2  = mid+1 ;
		int x  =  0  ;
		
		while (idx1 <= mid && idx2 <=ei) {
			if(arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++] ;
			}else {
				merged[x++] = arr[idx2++] ;
			}
		}
		while(idx1<=mid) {
			merged[x++] = arr[idx1++] ;
		}
		
		while(idx2<=ei) {
			merged[x++] = arr[idx2++] ;
		}
		
		for (int i=0  , j  = si ; i< merged.length ;i++ , j++) {
			arr[j] =merged[i] ;
			
		}
		
	}
	
	
	//// 7 8 , 3 , 5  , 4 
	public static void main(String[] args) {
		
		int[] arr  = {6,3,9,5, 2,8};
		
		// 2  3 5 6 8 9 
		
		divide(arr , 0 , 5 );
		
		for ( int jj:arr) {
			System.out.print(jj+" ");
		}
		
	}

}
