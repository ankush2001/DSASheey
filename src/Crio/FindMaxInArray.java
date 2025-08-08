package Crio;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMaxInArray {
   static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    /**
     * This method finds the maximum value in an array of integers.
     * It uses a priority queue to efficiently retrieve the maximum element.
     *
     * @param arr the array of integers
     * @return the maximum value in the array
     */
    public static void insert(int[] arr) {
       for (int i = 0; i < arr.length; i++) {
              pq.offer(arr[i]);
       }

    }
    public static int findMax(int[] arr) {
        insert(arr);
        return  pq.poll();
    }
    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};

        int max = findMax(arr);
        System.out.println(pq);
        System.out.println("Maximum value in the array: " + max);
    }
}
