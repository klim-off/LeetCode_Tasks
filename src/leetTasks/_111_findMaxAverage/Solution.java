package leetTasks._111_findMaxAverage;

import java.util.Arrays;

/*
You are given an integer array nums consisting of n elements, and an integer k.
Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value.
 Any answer with a calculation error less than 10-5 will be accepted.
Example 1:
Input: nums = [1,12,-5,-6,50,3], k = 4
Output: 12.75000
Explanation: Maximum average is (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        System.out.println(findMaxAverage(nums, k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int maxSum = Integer.MIN_VALUE;
        int localSum=0;
        int numsLength = nums.length-k+1;
        for (int i = 0; i < numsLength; i++) {
            for (int j = i; j < i + k; j++) {
                localSum += nums[j];
            }
            maxSum = Math.max(maxSum, localSum);
            localSum = 0;
        }
        return (double) maxSum / k;
    }
}
