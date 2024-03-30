package leetTasks._108_findLHS;
/*
We define a harmonious array as an array where the difference between its maximum value and its minimum value is exactly 1.
Given an integer array nums, return the length of its longest harmonious subsequence among all its possible subsequences.
A subsequence of array is a sequence that can be derived from the array by deleting some or
 no elements without changing the order of the remaining elements.
Example 1:
Input: nums = [1,3,2,2,5,2,3,7]
Output: 5
Explanation: The longest harmonious subsequence is [3,2,2,2,3].
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {1,3,2,2,5,2,3,7};
        System.out.println(findLHS(nums));
    }

    public static int findLHS(int[] nums) {
     int lengthSubsequence = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = nums.length-1; j>i ; j--) {
                if ((nums[i] == nums[j]+1)|| (nums[i] == nums[j]-1)){
                    lengthSubsequence = Math.max(lengthSubsequence, currentLength(nums, i));
                    break;
                }
            }
        }
     return lengthSubsequence;
    }

    private static int currentLength(int[] nums, int i) {
        int positiveLength=0;
        int negativeLength=0;
        for (int j = i; j < nums.length ; j++) {
            if (nums[i] == nums[j] || (nums[i] == nums[j] +1)) positiveLength++;
            if (nums[i] == nums[j] || (nums[i] == nums[j] -1)) negativeLength++;
        }
        return Math.max(positiveLength,negativeLength);
    }
}
