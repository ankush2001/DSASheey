package CrioDsa101;

public class PyramidPrint {

    static String[] printPyramid(int n) {
        String[] pyramid = new String[n];
        for (int i = 1; i <= n ; i++) {
            StringBuilder row = new StringBuilder();
            // Add leading spaces
            row.append("");
            for (int j = 1; j <= i; j++) {
                row.append("* ");
            }

            pyramid[i-1] = row.toString();
        }
        return pyramid; //time complexity is O(n^2) and space complexity is O(n)
    }
    public static void main(String[] args) {
        int n = 5;
        String[] pyramid = printPyramid(n);
        for (String row : pyramid) {
            System.out.println(row);
        }
    }
}
