package Crio;


import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class ReduceArray {
    static int reduceArray(int k ,int[] arr) {
        // Check if the array is empty
        if (arr == null || arr.length == 0) {
            return 0; // Return 0 for an empty array
        }
        int n = 0;
       for (int i = arr.length - 1; i >= 0; i--) {
           n = n - arr[i]; // Subtract each element from the last element
           n = Math.abs(n);
       }

        return n; // Return the total sum of the array elements
    } // time complexity is O(n log n) and space complexity is O(1)

    static int reduceArray_1(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int num : arr) {
            pq.offer(num); // Add elements to the priority queue
        }

        int n = 0;
        while (pq.size() > 1) {
            int first = pq.poll(); // Get the largest element
            int second = pq.poll(); // Get the second largest element

            n = Math.abs(first - second); // Calculate the absolute difference
            pq.offer(n); // Add the result back to the priority queue
        }
        return pq.poll(); // Return the last remaining element in the priority queue
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // Read array elements from input
        }

        Arrays.sort(arr);
        int result = reduceArray_1( arr);
        System.out.println("Reduced value: " + result); // Output: Reduced value: 15
    }
}
