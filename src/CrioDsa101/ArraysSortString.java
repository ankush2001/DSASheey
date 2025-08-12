package CrioDsa101;
import  java.util.*;

public class ArraysSortString {
    /**
     * This method sorts an array of strings in alphabetical order.
     *
     * @param arr an array of strings to be sorted
     */
    // Using bubble sort algorithm to sort the strings
     // Time Complexity: O(n^2) where n is the number of strings in the array
     // Space Complexity: O(1) as we are sorting in place without using any additional data structures
     static void sortStrings(String[] arr) {
         int n = arr.length;
         for (int i = 0; i < n - 1; i++) {
             for (int j = 0; j < n - i - 1; j++) {
                 if (arr[j].compareTo(arr[j + 1]) > 0) {
                     // Swap arr[j] and arr[j+1]
                     String temp = arr[j];
                     arr[j] = arr[j + 1];
                     arr[j + 1] = temp;
                 }
             }
         }
     }
    public static void main(String[] args) {
        String[] arr = {"abd", "abc", "ab", "a"};
//        sortStrings(arr);
        Arrays.sort(arr);
        for (String str : arr) {
            System.out.println(str);
        }
    }
}
