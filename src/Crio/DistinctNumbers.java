package Crio;

import java.util.HashSet;
import java.util.Set;

public class DistinctNumbers {
    static int countDistinct (int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }
        return set.size();
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Distinct numbers in arr: " + countDistinct(arr));
        System.out.println("Distinct numbers in arr2: " + countDistinct(arr2));
        System.out.println("Distinct numbers in arr3: " + countDistinct(arr3));
    }
}
