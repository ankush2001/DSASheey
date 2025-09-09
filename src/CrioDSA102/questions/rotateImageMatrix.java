package CrioDSA102.questions;

//import static java.util.Collections.rotate;

//import static jdk.internal.utill.ArraysSupport.reverse;

public class rotateImageMatrix {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
                //output should be
                // 7 4 1
                // 8 5 2
                // 9 6 3
        };
        rotate(matrix);
        for (int[] row : matrix) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    private static void rotate(int[][] matrix) {
        transpose(matrix);
        reverseMatrix(matrix);
    }

    private static void reverseMatrix(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            int start = 0;
            int end = m - 1;
            while (start < end) {
                swap(matrix, i, start, i, end);
                start++;
                end--;
            }
        }
    }

    private static void transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < m; j++) {
                swap(matrix, i, j, j, i);
            }
        }
    }
    private static void swap(int[][] matrix, int i, int j, int k, int l) {
        int temp = matrix[i][j];
        matrix[i][j] = matrix[k][l];
        matrix[k][l] = temp;
    }
}
