package CrioDsa101;

import java.util.Arrays;

public class InterSectionOfArrayMedium {

    public static void main(String[] args) {
        int n = 3;
        int m = 5;
        int[] arr1 = {1,2,2,1};
        int[] arr2 = {9,8,2};

        int[] intersection = findInterSection(arr1, arr2);
        System.out.println("Intersection of the two arrays: " + Arrays.toString(intersection));


    }

    private static int[] findInterSection(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] intersection = new int[Math.min(n, m)];

        int index = 0;
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (arr1[i] < arr2[j]) {
                i++;
            } else if (arr1[i] > arr2[j]) {
                j++;
            } else {
                intersection[index++] = arr1[i];
                i++;
                j++;
            }
        }
        // Resize the intersection array to the actual number of elements found
        return Arrays.copyOf(intersection, index); // This will return an array of the correct size containing the intersection elements
        //time complexity O(n log n + m log m), space complexity O(min(n, m))
    }
    //whith maps
    static int[] intersectionOfTwoArrays2(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        int[] intersection = new int[Math.min(n, m)];
        int index = 0;

        // Create a frequency map for the first array
        java.util.Map<Integer, Integer> frequencyMap = new java.util.HashMap<>();
        for (int num : arr1) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Check for intersection with the second array
        for (int num : arr2) {
            if (frequencyMap.containsKey(num) && frequencyMap.get(num) > 0) {
                intersection[index++] = num;
                frequencyMap.put(num, frequencyMap.get(num) - 1); // Decrease the count
            }
        }

        return Arrays.copyOf(intersection, index); // Resize to actual size
    } // time complexity O(n + m), space complexity O(n) for the frequency map
}
