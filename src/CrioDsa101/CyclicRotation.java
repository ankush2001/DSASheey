package CrioDsa101;

public class CyclicRotation {
    /**
     * This method rotates an array to the right by k positions.
     * It uses a temporary array to store the rotated elements.
     *
     * @param arr the array to be rotated
     * @param k   the number of positions to rotate
     */
    static void rotateArray(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than n
        int[] temp = new int[n];

        // Copy the last k elements to the beginning of the temp array
        for (int i = 0; i < k; i++) {
            temp[i] = arr[n - k + i];
        }

        // Copy the remaining elements to the temp array
        for (int i = 0; i < n - k; i++) {
            temp[k + i] = arr[i];
        }

        // Copy the temp array back to the original array
        System.arraycopy(temp, 0, arr, 0, n);
        //time complexity is O(n) and space complexity is O(n)
    }
    // Second approach is to reverse the array in three steps
    // 1. Reverse the entire array
    // 2. Reverse the first k elements
    // 3. Reverse the remaining n-k elements
    // This approach uses O(1) space complexity and O(n) time complexity
    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    static void rotateArrayReverse(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // Handle cases where k is greater than n
        if (k < 0) {
            k += n; // Convert negative rotations to positive
        }
        reverse(arr, 0, n - 1); // Reverse the entire array 5 4 3 2 1
        reverse(arr, 0, k - 1); // Reverse the first k elements
        reverse(arr, k, n - 1); // Reverse the remaining n-k elements
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2; // Number of rotations
//        rotateArrayReverse(arr, k);
        rotateArray(arr, k);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
