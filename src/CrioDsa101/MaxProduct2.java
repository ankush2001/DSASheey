package CrioDsa101;
import java.util.Scanner;

public class MaxProduct2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number of elements in the array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
//        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int maxProduct = findMaxProduct(arr, n);
        System.out.println("Maximum product of " + n + " elements: " + maxProduct);
    }
    private static int findMaxProduct(int[] arr, int n) {
        if (n < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        }
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > firstMax) {
                secondMax = firstMax;
                firstMax = num;
            } else if (num > secondMax && num != firstMax) {
                secondMax = num;
            }
        }
        return (firstMax - 1) * (secondMax - 1);
    }
//    private static int findMaxProduct(int[] arr, int n) {
//
//        int firstMax = arr[0];
//        int secondMax = arr[1];
//        for (int i = 0; i <arr.length; i++) {
//            if (arr[i] > firstMax) {
//                secondMax = firstMax;
//                firstMax = arr[i];
//            } else if (arr[i] > secondMax ) {
//                secondMax = arr[i];
//            }
//        }
//        int maxProduct = (firstMax-1 )* (secondMax-1);
//        return maxProduct;
//    } //time complexity is O(n) and space complexity is O(1) as we are using only constant space for storing the two maximum values.
}
