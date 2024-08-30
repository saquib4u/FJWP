package sorting.algorithms;

public class MergeSort {

	public static void main(String[] args) {
		int arr[]= {5,9,8,1,2,0};
		System.out.println("Original Array:");
		printArray(arr);
		mergeSort(arr, 0, arr.length - 1);
		System.out.println("\nSorted Array:");
		printArray(arr);

	}

	private static void mergeSort(int[] arr, int l, int r) {
		if(l < r) {
			int mid = (l+r) / 2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid + 1, r);
			merge(arr, l, mid, r);
		}

	}
	private static void merge(int arr[], int low, int mid, int high) {
		int k = low, i = low, j = mid + 1;
		// We use this temporary array to store the sorted value.
		// This temporary array holds both values of left and right the subarrays.
		int [] temp=new int [arr.length];
		// while there are elements in the left and right runs
		while (i <= mid && j <= high)
		{
			if (arr[i] <= arr[j]) {
				temp[k++] = arr[i++];
			}
			else {
				temp[k++] = arr[j++];
			}
		}
		// Copy remaining elements

		while (i <= mid) {
			temp[k++] = arr[i++];
		}
		while (j <= high) {
			temp[k++] = arr[j++];
		}
		// copy back to the original array to reflect sorted order
		for (i = low; i <= high; i++) {
			arr[i] = temp[i];
		}
	}
		
	private static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

}