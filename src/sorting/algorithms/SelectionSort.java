package sorting.algorithms;

public class SelectionSort {

	public static void main(String[] args) {
		int arr[]= {5,9,8,1,2};
		System.out.println("Original Array:");
		printArray(arr);
		// Perform Selection Sort
		selectionSort(arr);
		System.out.println("\nSorted Array:");
		printArray(arr);

	}

	private static void selectionSort(int[] arr) {
		int n=arr.length;
		// Find the minimum element in the unsorted portion
		for(int i=0; i<n-1; i++) {
			int minIdx=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[minIdx]) {
					minIdx=j;
				}
			}
			//Swap the found minimum element with the first element of the unsorted portion
			int temp=arr[minIdx];
			arr[minIdx]=arr[i];
			arr[i]=temp;
		}
	}
	private static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

}
