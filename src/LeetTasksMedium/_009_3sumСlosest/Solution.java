package LeetTasksMedium._009_3sumСlosest;

import java.util.Arrays;
/*
Given an integer array nums of length n and an integer target, find three integers in nums such that the sum is closest to target.

Return the sum of the three integers.

You may assume that each input would have exactly one solution.
Input: nums = [-1,2,1,-4], target = 1
Output: 2
Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 */

public class Solution {

    public static void main(String[] args) {
        int [] nums = {4,0,5,-5,3,3,0,-4,-5};
      //  int [] nums = {-1,2,1,-4};
        //   int [] nums = {0,1,1};
        int target =  -2;

            System.out.println(threeSumClosest(nums, target));


    }

    public static  int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int gap =0 ;
        int result = 0;
        boolean first = true;
        int localSum = 0;

        for (int i = 0; i < nums.length - 2; i++) {
            for (int j = i+1; j < nums.length -1 ; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    localSum = nums[i] + nums[j] + nums[k];
                    if (first) {
                        result = localSum;
                        gap = Math.abs(  target - result);
                        first = false;
                    } else if (gap > Math.abs((target -localSum))) {
                        result = localSum;
                        gap = Math.abs((target -localSum));
                    }
                }
            }
        } return result;
    }
}
