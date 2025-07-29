package ArraysHasing;
import java.util.Arrays;
import java.util.ArrayList;

/*

Given an array of integers nums and an integer target, return the indices i and j such that nums[i] + nums[j] == target and i != j.

You may assume that every input has exactly one pair of indices i and j that satisfy the condition.

Return the answer with the smaller index first.

Example 1:

Input: 
nums = [3,4,5,6], target = 7

Output: [0,1]
Explanation: nums[0] + nums[1] == 7, so we return [0, 1].

Example 2:

Input: nums = [4,5,6], target = 10

Output: [0,2]
Example 3:

Input: nums = [5,5], target = 10

Output: [0,1]
Constraints:

2 <= nums.length <= 1000
-10,000,000 <= nums[i] <= 10,000,000
-10,000,000 <= target <= 10,000,000

*/


public class TwoSum {
    public static void main(String []args) {
        SolutionTwoSum s = new SolutionTwoSum();
        
        // ARRAY
        int[] n = {3, 4, 5, 6};
        int target = 7;

        System.out.println("Array nums: " + Arrays.toString(n));
        int result[] = s.twoSum(n, target);
        
        // System.out.println("Indicies: " + Arrays.toString(result));
        // System.out.println("Indicies: ");
        if(result.length == 0) {
            System.out.println("Two sum of the " + target + " not found in the nums of " + Arrays.toString(n));
        }else {
            System.out.println("Two sum found index of " + Arrays.toString(result) );
        }



        // ARRAYLIST
        ArrayList<Integer> nums = new ArrayList<>();

        nums.add(5);
        nums.add(5);

        int ArrayListTarget = 10;

        System.out.println("\n\nArrayList: " + nums);

        System.out.println(s.twoSumArrayList(nums, ArrayListTarget));

    }
}



class SolutionTwoSum {    

    // SOLUTION FOR ARRAY
    public int[] twoSum(int n[], int target) {
        for(int i = 0; i < n.length; i++) {
            for(int j = i + 1; j < n.length; j++) {
                if(n[i] + n[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    // SOLUTION FOR ARRAYLIST
    public ArrayList<Integer> twoSumArrayList(ArrayList<Integer> nums, int target) {
        for(int i = 0; i < nums.size(); i++) {
            for(int j = i + 1; j < nums.size(); j++) {
                if(nums.get(i) + nums.get(j) == target) {
                    ArrayList<Integer> result = new ArrayList<>();
                    result.add(i);
                    result.add(j);
                    return result;
                }
            }
        }
        return new ArrayList<>();
    }
}