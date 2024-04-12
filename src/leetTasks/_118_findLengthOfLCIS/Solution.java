package leetTasks._118_findLengthOfLCIS;

/*
Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray).
 The subsequence must be strictly increasing.
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {1, 3, 5, 7};
        System.out.println(findLengthOfLCIS(nums));
    }

    public static int findLengthOfLCIS(int[] nums) {
        int result = 1;
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[i - 1]) {
                count++;
            } else {
                result = Math.max(result, count);
                count = 1;
            }
        }
        return Math.max(result, count);
    }
}
