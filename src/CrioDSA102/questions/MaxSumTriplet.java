package CrioDSA102.questions;

public class MaxSumTriplet {
    public static void main(String[] args) {
        int[] arr = {2, 5, 3, 1, 4, 9};
        int result = maxSumTriplet(arr);
        System.out.println("Maximum Sum Triplet: " + result);
    }

    private static int maxSumTriplet(int[] arr) {
        int n = arr.length;
        if (n < 3) {
            return 0; // Not enough elements for a triplet
        }

        int maxSum = 0;

        for (int j = 1; j < n - 1; j++) {
            int leftMax = 0;
            for (int i = 0; i < j; i++) {
                if (arr[i] < arr[j]) {
                    leftMax = Math.max(leftMax, arr[i]);
                }
            }

            int rightMax = 0;
            for (int k = j + 1; k < n; k++) {
                if (arr[k] > arr[j]) {
                    rightMax = Math.max(rightMax, arr[k]);
                }
            }

            if (leftMax > 0 && rightMax > 0) {
                maxSum = Math.max(maxSum, leftMax + arr[j] + rightMax);
            }
        }

        return maxSum;
    }//time complexity O(n^2) and space complexity O(1)
}
