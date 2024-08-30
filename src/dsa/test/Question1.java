package dsa.test;
//bubble sort
public class Question1 {

	public static void main(String[] args) {
		int arr[]= {9,8,4,5,0,1,6,7};
		printArray(arr);
		doBubbleSort(arr);
		printArray(arr);

	}

	private static void printArray(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
		}
		System.out.println();
		
	}

	private static void doBubbleSort(int[] arr) {
		for(int i=0; i<arr.length - 1; i++) {
			for(int j=0; j<arr.length-i-1 ; j++) {
				if(arr[j] > arr[j+1]) {
					//swap
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
	}

}
