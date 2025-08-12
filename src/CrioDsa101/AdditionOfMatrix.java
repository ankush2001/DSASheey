package CrioDsa101;

public class AdditionOfMatrix {

    private static int[][] addMatrices(int[][] matrix1, int[][] matrix2, int row, int col, int[][] result) {
        if (row >= matrix1.length) {
            return result; // Base case: if we have processed all rows
        }
        if (col >= matrix1[0].length) {
            return addMatrices(matrix1, matrix2, row + 1, 0, result); // Move to the next row
        }
        result[row][col] = matrix1[row][col] + matrix2[row][col]; // Add corresponding elements
        return addMatrices(matrix1, matrix2, row, col + 1, result); // Move to the next column
    }

    //Second approach using iteration
    private static int[][] addMatricesIterative(int[][] matrix1, int[][] matrix2)
    {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j]; // Add corresponding elements
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        int[][] matrix2 = {
            {9, 8, 7},
            {6, 5, 4},
            {3, 2, 1}
        };

        int[][] result = new int[matrix1.length][matrix1[0].length];
        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
