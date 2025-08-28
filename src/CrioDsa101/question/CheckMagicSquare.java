package CrioDsa101;

public class CheckMagicSquare {
    static String checkMagicSquare(int[][] arr , int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[0][i];
        }
        // Check rows
        for (int i = 1; i < n; i++) {
            int rowSum = 0;
            for (int j = 0; j < n; j++) {
                rowSum += arr[i][j];
            }
            if (rowSum != sum) {
                return "NO";
            }
        }
        // Check columns
        for (int i = 0; i < n; i++) {
            int colSum = 0;
            for (int j = 0; j < n; j++) {
                colSum += arr[j][i];
            }
            if (colSum != sum) {
                return "NO";
            }
        }
        // Check diagonals
        int diag1Sum = 0, diag2Sum = 0;
        for (int i = 0; i < n; i++) {
            diag1Sum += arr[i][i];
            diag2Sum += arr[i][n - 1 - i];
        }
        if (diag1Sum != sum || diag2Sum != sum) {
            return "NO";
        }
        return "YES";

    }
    public static void main(String[] args) {
        int[][] square = {
            {8, 1, 6},
            {3, 5, 7},
            {4, 9, 2}
        };

        String result = checkMagicSquare(square , 3);
        if (result.equals("YES")) {
            System.out.println("The square is a magic square.");
        } else {
            System.out.println("The square is not a magic square.");
        }
    }
}
