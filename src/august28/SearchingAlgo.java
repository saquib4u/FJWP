package august28;

public class SearchingAlgo {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,0,46,3,5,86,9,43,55,24};
		//if k element exists then return its index value else return -1.
		int k=86;
		System.out.println(search(arr, k));

	}
	// TC: O(n)
	private static int search(int[] arr, int k) {
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==k) {
				return i;
			}
		}
		return -1;
	}

}
