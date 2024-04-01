package leetTasks._110_maximumProduct;

import java.util.Arrays;

/*
Given an integer array nums, find three numbers whose product is maximum and return the maximum product.
Example:
Input: nums = [-100,-1,2,3,-98,4]
Output: 24
 */
public class Solution {
    public static void main(String[] args) {
        int[] nums = {-100,-1,2,3,-98,4};
        System.out.println(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int numsLength = nums.length;
        int max1 = nums[0]*nums[1]*nums[numsLength-1];
        int max2 = nums[numsLength-1]*nums[numsLength-2]*nums[numsLength-3];
        return Math.max(max1,max2);
    }

}
