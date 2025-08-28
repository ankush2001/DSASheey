package CrioDsa101;

public class Fibonacci {
    static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }//time complexity O(2^n) and space complexity O(n) due to recursion stack
    public static void main(String[] args) {
        int n = 10; // Example value for n
        System.out.println("Fibonacci series up to " + n + ":");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
