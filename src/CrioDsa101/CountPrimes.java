package CrioDsa101;

public class CountPrimes {
    public static void main(String[] args) {
        int n = 10; // Example input
        int count = countPrimes(n);
        System.out.println("Number of prime numbers less than " + n + ": " + count);
    }

    private static int countPrimes(int n) {
        if (n < 2) {
            return 0; // No primes less than 2
        }

        boolean[] isPrime = new boolean[n];
        for (int i = 2; i < n; i++) {
            isPrime[i] = true; // Assume all numbers are prime initially
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false; // Mark multiples of i as non-prime
                }
            }
        }

        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                count++; // Count the prime numbers
            }
        }

        return count;
    } //time complexity: O(n log log n), space complexity: O(n)

    public int countPrimes_2(int n) {

        int count = 0;
        for(int i = 2 ; i < n ; i++){
            if(isPrime(i)) {
                count ++;
            }
        }

        return count;
    }

    public boolean isPrime(int input){

        for(int i = 2 ; i*i <= input ; i++){
            if(input % i == 0){
                return false ;
            }

        }
        return true;
    }
    // time complexity: O(n * sqrt(n)), space complexity: O(1)
}
