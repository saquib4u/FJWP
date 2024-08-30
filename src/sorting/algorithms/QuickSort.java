package sorting.algorithms;

public class QuickSort {

	public static void main(String[] args) {
		int arr[]= {5,9,8,1,2,0,7,7};
		System.out.println("Original Array:");
		printArray(arr);
		quickSort(arr, 0, arr.length - 1);
		System.out.println("\nSorted Array:");
		printArray(arr);

	}
	
	private static void quickSort(int[] arr, int low, int high) {
		
		if(low <= high) {
			int pivot = partition(arr, low, high);
			quickSort(arr, low, pivot - 1);
			quickSort(arr, pivot + 1, high);
		}
	}
	private static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i=low;
		int j=low;
		while(i <= high) {
			if(arr[i] <= pivot) {
				int temp = arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j++;
			}else {
				i++;
			}
		}
		return j-1;
	}

	private static void printArray(int[] arr) {
		for (int value : arr) {
			System.out.print(value + " ");
		}
		System.out.println();
	}

}
