package CrioDsa101;

/*
Given a number n, you have to find the number of Fibonacci numbers lesser than n.
 */
public class FibonacciCount {
    public static void main(String[] args) {
        int n = 3;
        int count = nthFibonacciNumber(n);
        System.out.println(count); // Output: 5

    }

    private static int fibonacciCount(int n) {
        if (n <= 0) {
            return 0; // No Fibonacci numbers less than or equal to 0
        }

        int a = 0, b = 1, count = 0;

        while (a < n) {

            int next = a + b;
            a = b;
            b = next;
            count++;
        }

        return count; // Return the count of Fibonacci numbers less than n
    }
    public static int nthFibonacciNumber( int n){
        int n1=1;
        int n2 = 1;
        int fib_count = 0;
        while (n1<n)
        {
            fib_count++;
            int fib=n1+n2;
            n1=n2;
            n2=fib;
            System.out.println(fib);
        }

        return fib_count;
    }
}
