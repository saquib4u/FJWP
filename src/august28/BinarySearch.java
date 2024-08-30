package august28;

public class BinarySearch {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,90,92,99,100};
		//if k element exists then return its index value else return -1.
		int k=92;
		System.out.println(binarySearch(arr, k));

	}

	private static int binarySearch(int[] arr, int k) {
		//Arrays.sort(arr);
		int n=arr.length;
		int l=0;
		int h=n-1;
		while (l <= h) {
            int mid = l + (h - l) / 2; 
            
            if (arr[mid] == k) {
                return mid; 
            } else if (arr[mid] < k) {
                l = mid + 1;
            } else {
                h = mid - 1; 
            }
        }
		return -1;
	}

}
