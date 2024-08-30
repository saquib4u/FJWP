package sorting.algorithms;

public class BubbleSort {

	public static void main(String[] args) {
		int arr[]= {5,9,8,1,2,0};
		System.out.println("Original Array:");
		printArray(arr);
		bubbleSort(arr);
		System.out.println("\nSorted Array:");
		printArray(arr);

	}

	private static void bubbleSort(int[] arr) {
		int n=arr.length;
		for(int i=0; i<n-1; i++) {
			// Last i elements are already sorted, so no need to check them
			for(int j=0; j<n-i-1; j++) {
				// Compare adjacent elements and swap them if they are in the wrong order
				if(arr[j] > arr[j+1]) {
					// Swap arr[j] and arr[j + 1]
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

	private static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

}
