package Crio;

public class Recc {

    static void factorial(int n){
        if (n == 0 || n == 1) {
            System.out.print(1 + " ");
            return;
        }
        System.out.print(n+" ");
        factorial(n-1);
    }
    public static void main(String[] args) {
        int n = 5; // Example value for n
       factorial(n);
       // System.out.println("Factorial of " + n + " is: " + result);
    }
}
