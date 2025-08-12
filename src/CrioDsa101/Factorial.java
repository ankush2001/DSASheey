package CrioDsa101;

public class Factorial {
    public static void main(String[] args) {
        int n = 5; // Example value for n
        System.out.println("Factorial of " + n + " is: " + factorial(n));
    }

    private static int factorial(int n) {
        if (n <= 1) {
            return 1; // Base case: factorial of 0 or 1 is 1
        }
        int result = n * factorial(n - 1);
        return  result;
    }//time complexity O(n) and space complexity O(n) due to recursion stack

    private static int factorialIterative(int n) {
        int result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    } // time complexity O(n) and space complexity O(1)
}
