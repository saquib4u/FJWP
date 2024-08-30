package august28;

public class InterpolationSearch {

	public static void main(String[] args) {
		int arr[]= {2,4,6,8,10,16,19,20,22,33,35,45,49};
		int k=33;
		int ans = interpolationSearch(arr, k);
		System.out.println(ans);

	}
	private static int interpolationSearch(int[] arr, int k) {
		int pos;
		int lo=0;
		int hi=arr.length - 1;
		while(lo<=hi) {
			pos = lo + (((hi-lo)*(k-arr[lo]))/ (arr[hi] - arr[lo]));
			//System.out.println(pos);
			if(arr[pos] == k) {
				return pos;
			} else if(arr[pos] < k) {
				lo = pos + 1;
			} else {
				hi = pos - 1;
			}
		}
		return -1;

	}
}
