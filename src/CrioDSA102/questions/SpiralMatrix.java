package CrioDSA102.questions;

import java.util.Arrays;
import java.util.Scanner;

public class SpiralMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printMatrix(n);
    }

    private static void printMatrix(int n) {
        int[][] matrix = new int[n][n];
        int count =   1;
        int columnStart = 0;
        int rowStart = 0;
        int columnEnd = n - 1;
        int rowEnd = n - 1;
        while(rowStart <= rowEnd && columnStart <= columnEnd) {
            for (int i = columnStart; i <= columnEnd; i++) {
                matrix[rowStart][i] = count;
                count++;
            }
            rowStart++;
            for (int i = rowStart; i <= rowEnd; i++) {
                matrix[i][columnEnd] = count;
                count++;
            }
            columnEnd--;
            for (int i = columnEnd; i >= columnStart; i--) {
                matrix[rowEnd][i] = count;
                count++;
            }
            rowEnd--;

            for (int i = rowEnd; i >= rowStart; i--) {
                matrix[i][columnStart] = count;
                count++;
            }
            columnStart++;
        }
//        print matrix
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }


    }
}
