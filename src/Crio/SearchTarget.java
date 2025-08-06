package Crio;


import java.util.ArrayList;
import java.util.Scanner;

public class SearchTarget {

    static int binarySearch(int arr[] , int k) {
        //time complexity: O(log n)
        //space complexity: O(1)
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2; //describe --> to prevent overflow

            if (arr[mid] == k) {
                return mid; // Target found
            } else if (arr[mid] < k) {
                left = mid + 1; // Search in the right half
            } else {
                right = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int k = sc.nextInt();
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read array elements from input
        }
        int  found = binarySearch(arr, k);
        System.out.println("Target found: " + found); // Output: Target found: true
    }
}
