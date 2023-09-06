package javatraining.day9;

public class TwoDimensionalArrayOperations {
    public static void main(String[] args) {
        int[][] matrix = {
            { 1, 2, 3 },
            { 4, 5, 6 },
            { 7, 8, 9 }
        };



        // Finding the number of rows and columns in the matrix
        int rows = matrix.length;
        int columns = matrix[1].length;

        System.out.println("Number of rows: " + rows);
        System.out.println("Number of columns: " + columns);

        // Accessing elements in the matrix
        System.out.println("Element at matrix[1][2]: " + matrix[1][2]);

        // Iterating through the matrix
        System.out.println("Matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Finding the sum of all elements in the matrix
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum of elements: " + sum);

        // Finding the maximum element in the matrix
        int max = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > max) {
                    max = matrix[i][j];
                }
            }
        }
        System.out.println("Maximum element: " + max);

        // Finding the minimum element in the matrix
        int min = matrix[0][0];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] < min) {
                    min = matrix[i][j];
                }
            }
        }
        System.out.println("Minimum element: " + min);
    }
}
