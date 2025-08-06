package Striver;

public class setZeroes {
    public void setZeroes(int[][] matrix) {
        int m = matrix.length; //rows
        int n = matrix[0].length; // columns

        boolean firstRow = false;
        boolean firstCol = false;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (matrix[i][j] == 0) {
                    // we are checking for first row and col that
                    // they have zero or not and setting it to true
                    if (i == 0) firstRow = true;
                    if (j == 0) firstCol = true;
                    // we are setting here zero if we find zeros in inner matrix
                    matrix[0][j] = 0;
                    matrix[i][0] = 0;
                }
            }
        }

        // replace inner matrix with zer

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0;
                }
            }
        }

        // if first row has zero then set all elements in first row to zero
        if (firstRow) {
            for (int j = 0; j < n; j++) {
                matrix[0][j] = 0;
            }
        }
        // if first column has zero then set all elements in first column to zero
        if (firstCol) {
            for (int i = 0; i < m; i++) {
                matrix[i][0] = 0;
            }
        }

    }

    public static void main(String[] args) {
        setZeroes sz = new setZeroes();
        int[][] matrix = {
            {0,1,2,0},
            {3,4,5,1},
            {1,3,1,0}
        };
        sz.setZeroes(matrix);

        // Print the modified matrix
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
}
