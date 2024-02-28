package leetTasks._102_arrayPairSum;
/*
Given an integer array nums of 2n integers, group these integers into n pairs (a1, b1), (a2, b2), ...,
(an, bn) such that the sum of min(ai, bi) for all i is maximized. Return the maximized sum.

 */
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [] nums = {6,2,6,5,1,2};

        System.out.println(arrayPairSum(nums));
    }

    public static int arrayPairSum(int[] nums) {
        int result = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i += 2) {
        // correct but more time    result += Math.min( nums[i], + nums[i + 1]);
            result += nums[i];
        }
        return result;
    }
}
