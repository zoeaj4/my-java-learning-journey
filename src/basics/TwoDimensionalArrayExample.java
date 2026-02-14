package basics;

/*
 * This program demonstrates how to work with two-dimensional arrays in Java.
 * It initializes a 2D array with values and prints its contents using:
 * 1) Traditional nested for loops.
 * 2) Enhanced for-each loops.
 * This example helps understand how rows and columns are accessed in a matrix.
 */

public class TwoDimensionalArrayExample {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
                {10, 11, 12},
                {13, 14, 15}
        };

        // Printing using traditional for loops
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        // Printing using enhanced for-each loops
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
