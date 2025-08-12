package CrioDsa101;

public class TribonacciBasic {

    static int tribonacci(int n) {
        if (n == 0) {
            return 0; // Base case: T(0) = 0
        } else if (n == 1 || n == 2) {
            return 1; // Base case: T(1) = T(2) = 1
        }
        return tribonacci(n-1) + tribonacci(n-2) + tribonacci(n-3);
    }

    public static void main(String[] args) {
        int n = 10; // Example value for n
        System.out.println("Tribonacci series up to " + n + ":");
        System.out.println(tribonacci(n));
    }
}
