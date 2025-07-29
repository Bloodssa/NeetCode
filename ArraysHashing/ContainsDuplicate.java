package ArraysHasing;
import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

/* 
Given an integer array nums, return true if any value appears more than once in the array, otherwise return false.

Example 1:

Input: nums = [1, 2, 3, 3]

Output: true

Example 2:

Input: nums = [1, 2, 3, 4]

Output: false
*/

public class ContainsDuplicate {
    public static void main(String []args) {
        Solution s = new Solution();


        // HAS DUPLICATE WITH ARRAY
        int []n = {1, 2, 3, 4};

        System.out.println("Nums in Array: " + Arrays.toString(n));

        System.out.println(s.DuplicateSolution(n));



        // HAS DUPLICATE WITH ARRAYLIST
        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(3);

        System.out.println("\n\nNums in ArrayList: " + nums);
        System.out.println(s.DuplicateSolutionArrayList(nums));

    }
}


class Solution {
    // SOLUTION FOR ARRAY
    public boolean DuplicateSolution(int []n) {
        for(int i = 0; i < n.length; i++) {
            for(int j = i + 1; j < n.length; j++) {
                if(n[i] == n[j]) {
                    return true;
                }
            }
        }
        return false;
    }


    // SOLUTION FOR ARRAYLIST
    public boolean DuplicateSolutionArrayList(List<Integer> n) {
        for (int i = 0; i < n.size(); i++) {
            for (int j = i + 1; j < n.size(); j++) {
                if(n.get(i) == n.get(j)) {
                    return true;
                }
            }   
        }
        return false;
    }
}