package lab15;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        try {
            Scanner scanner = new Scanner(System.in);
            
            System.out.print("Enter the number of rows in the matrices: ");
            int rows = scanner.nextInt();
            
            System.out.print("Enter the number of columns in the matrices: ");
            int cols = scanner.nextInt();

            // Create two 2D arrays to store the matrices
            Integer[][] matrix1 = new Integer[rows][cols];
            Integer[][] matrix2 = new Integer[rows][cols];

            
            System.out.println("Enter the elements of the first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            
            System.out.println("Enter the elements of the second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }

            // Print the first matrix
            System.out.println("Matrix 1:");
            printMatrix(matrix1);

            // Print the second matrix
            System.out.println("Matrix 2:");
            printMatrix(matrix2);

            // Add the two matrices and store the result
            Integer[][] result = addMatrices(matrix1, matrix2);

            // Print the resultant matrix
            System.out.println("Resultant Matrix:");
            printMatrix(result);
        } catch (InputMismatchException e) {
            // Catch InputMismatchException if the user enters invalid input
            System.err.println("Invalid input. Please enter valid integers.");
        } catch (Exception e) {
            // Catch any other exceptions that may occur
            System.err.println("An error occurred: " + e.getMessage());
        }
    }

    //This method adds two matrices element-wise.
    public static Integer[][] addMatrices(Integer[][] matrix1, Integer[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;

        // Create a new 2D array to store the resultant matrix
        Integer[][] result = new Integer[rows][cols];

        // Add the two matrices element-wise
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    //print matrix
    public static void printMatrix(Integer[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}