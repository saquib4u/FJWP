package dsa.test;

public class Question2 {

	public static void main(String[] args) {
		int[] arr= {9,8,7,0,1,2,3,8};
		System.out.println("Original Array: ");
		printArray(arr);
		doQuickSort(arr,0,arr.length-1);
		printArray(arr);

	}
	private static void doQuickSort(int[] arr, int low, int high) {
		//
		if(low < high) {
			int pivot = partition(arr, low, high);
			doQuickSort(arr, low, pivot - 1);
			doQuickSort(arr, pivot + 1, high);
		}
		
	}
	private static int partition(int arr[], int low, int high) {
		//
		int pivot = arr[high];
		int i=low, j=low;
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
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
	}

}
