package lab14;

import java.util.Scanner;

public class CalculateSumAndAverage {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        int sum = calculateSum(array);
        double average = calculateAverage(sum, n);

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }

    public static int calculateSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static double calculateAverage(int sum, int n) {
        return (double) sum / n;
    }
}
