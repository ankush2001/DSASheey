package Arrays;

import java.util.*;

class ThreeSum {
    /**
     * This method finds all unique triplets in the array that sum up to zero.
     * It uses a brute force approach with three nested loops to check all combinations.
     *
     * @param nums an array of integers
     * @return a list of lists containing unique triplets that sum to zero
     */
    public static void main(String[] args) {
        ThreeSum threeSum = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};
        List<List<Integer>> result = threeSum.threeSum2Approach(nums);
        System.out.println(result); // Output: [[-1, -1, 2], [-1, 0, 1]]
    }
    public List<List<Integer>> threeSumBruteForce(int[] nums) {
        Set<List<Integer>> result = new HashSet<>();  //set created
        int length = nums.length; //taking length of the array

        for (int i=0; i<length-2 ;i++){ // ittrating the 1 loop till l-2

            for(int j=i+1 ; j< length-1 ; j++){// ittrating the 2 loop till l-1

                for(int k=j+1 ; k<length ; k++){// ittrating the 3 loop till l
                    if(nums[i]+nums[j]+nums[k] == 0){
                        List<Integer> triplets = Arrays.asList(nums[i] ,nums[j],nums[k]);
                        Collections.sort(triplets);
                        result.add(triplets);
                    }
                }
            }
        }

        return new ArrayList<>(result);



    } //O(n^3) time complexity

    public List<List<Integer>> threeSum2Approach(int[] nums){
        Set<List<Integer>> result = new HashSet<>();  //set created
        int length = nums.length; //taking length of the array

        for (int i=0; i<length;i++){ // ittrating the 1 loop till l
            int target = -nums[i];
            Set<Integer> seen = new HashSet<>();
            for(int j=i+1 ; j<length ; j++){// ittrating the 2 loop till l
                int third = target - nums[j];
                if(seen.contains(third)){
                    List<Integer> triplets = Arrays.asList(nums[i] ,nums[j],third);
                    Collections.sort(triplets);
                    result.add(triplets);
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(result);

    }// O(n^2) time complexity and space complexity is O(n)

    public List<List<Integer>> threeSum3Approach(int[] nums){
        Set<List<Integer>> result = new HashSet<>();  //set created
        int length = nums.length; //taking length of the array

        for (int i=0; i<length;i++){ // ittrating the 1 loop till l
            int target = -nums[i];
            Set<Integer> seen = new HashSet<>();
            for(int j=i+1 ; j<length ; j++){// ittrating the 2 loop till l
                int third = target - nums[j];
                if(seen.contains(third)){
                    List<Integer> triplets = Arrays.asList(nums[i] ,nums[j],third);
                    Collections.sort(triplets);
                    result.add(triplets);
                }
                seen.add(nums[j]);
            }
        }

        return new ArrayList<>(result);

    }

}