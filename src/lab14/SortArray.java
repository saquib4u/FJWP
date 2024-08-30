package lab14;

import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter the number of elements in the array: ");
			int n = scanner.nextInt();

			int[] array = new int[n];

			System.out.println("Enter the elements of the array:");
			for (int i = 0; i < n; i++) {
			    array[i] = scanner.nextInt();
			}

			System.out.println("Original array:");
			printArray(array);

			bubbleSort(array);

			System.out.println("Sorted array:");
			printArray(array);
		}
    }

    public static void bubbleSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
