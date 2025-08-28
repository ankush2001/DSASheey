package CrioDsa101;

public class GCD {
    public static void main(String[] args) {
        int a = 48;
        int b = 18;

        int gcd = findGCD2(a, b);
        System.out.println("GCD of " + a + " and " + b + " is: " + gcd);
    }

    private static int findGCD(int a, int b) {
        int result = 1;
        for(int i = Math.min(a, b); i > 0; i--) {
            if(a % i == 0 && b % i == 0) {
                result = i;
                break; // Found the GCD, no need to continue
            }
        }
        return result;
    } //time complexity O(min(a, b)), space complexity O(1)
    // Alternatively, you can use the Euclidean algorithm for a more efficient solution
    private static int findGCD2(int a, int b) {
        if(a == b) {
            return a; // If both numbers are equal, return either one
        }
        if(b == 0) {
            return a; // If b is zero, return a
        }
        if(a == 0) {
            return b; // If a is zero, return b
        }


        // Recursive call to find GCD using the Euclidean algorithm
        return findGCD2(b, a % b);
        // time complexity O(log(min(a, b))),
        // space complexity O(log(min(a, b))) due to recursion stack
    }//describe -->
    // the Euclidean algorithm is a method for computing the greatest common divisor (GCD) of two integers.
    // It is based on the principle that the GCD of two numbers also divides their difference.
    // The algorithm works by repeatedly replacing the larger number with the remainder of the division of
    // the two numbers until one of them becomes zero. The other number at that point will be the GCD.
    // This method is efficient and has a logarithmic time complexity relative to the size of the input numbers.
}
