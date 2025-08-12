package CrioDsa101;

import java.util.*;

public class IntersectionOfTwoArrays {
    static List<Integer> findIntersection(int arr1[] , int[] arr2){

        List<Integer> list = new ArrayList<>();
        HashMap<Integer,Integer> set = new HashMap<>();
        for(int i : arr1){
            set.put(i,set.getOrDefault(i,0)+1);
        }
        for(int i : arr2){
            if(set.containsKey(i) && set.get(i)>0){
              list.add(i);
              set.put(i,set.get(i)-1); // Decrease the count to avoid duplicates in the intersection
            }
        }
        Collections.sort(list);
        //-98 -89 -80 -71 -64 -49 21 46 48 59 65 72 75 79 95 --should be
        //-98 -89 -80 -71 -64 -64 -49 21 46 48 59 65 72 75 79 95
        return  list;
    } //time complexity O(n + m) where n is the size of arr1 and m is the size of arr2, space complexity O(n)
    public static void main(String[] args) {
//        int[] arr1 = {-98 ,79, 59, 48, -64, 46, 65, -71, 95, 21, 72, -89, 75, -49, -80};
//        int[] arr2 = {72 ,59, 95, -71, -68, -89, 48 ,-49, 65 ,-80, 75 ,22, 46 ,-98, -64, -52, -64, 79 ,21};
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size of first array:");
        int n1 = input.nextInt();
        int[] arr1 = new int[n1];
        System.out.println("Enter the elements of first array:");
        for (int i = 0; i < n1; i++) {
            arr1[i] = input.nextInt();
        }
        System.out.println("Enter the size of second array:");
        int n2 = input.nextInt();
        int[] arr2 = new int[n2];
        System.out.println("Enter the elements of second array:");
        for (int i = 0; i < n2; i++) {
            arr2[i] = input.nextInt();
        }
        List<Integer> list = IntersectionOfTwoArrays.findIntersection(arr1, arr2);

        System.out.print("Intersection of the two arrays: ");
        for (int num : list) {
            System.out.print(num + " ");
        }
    }
}
