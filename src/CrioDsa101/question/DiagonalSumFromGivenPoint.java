package CrioDsa101.question;

public class DiagonalSumFromGivenPoint {
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int row = 0; // Starting row index
        int col = 1; // Starting column index
        int sum = diagonalSum(matrix, row, col);
        System.out.println("Diagonal Sum: " + sum); // Output: Diagonal Sum: 15
    }

    private static int diagonalSum(int[][] matrix, int row, int col) {
        int sum = 0;
        int n = matrix.length; // Number of rows
        int m = matrix[0].length; // Number of columns

        // Traverse the diagonal starting from (row, col)
        while (row < n && col < m) {
            sum += matrix[row][col];
            row++;
            col++;
        }

        return sum; // Return the sum of the diagonal elements
    }
}
