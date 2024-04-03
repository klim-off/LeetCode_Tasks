package leetTasks._112_findErrorNums;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {2,3,2};
        System.out.println(Arrays.toString(findErrorNums(nums)));
    }

    public static int[] findErrorNums(int[] nums) {
        int[] resultArray = new int[2];
        int numsLength = nums.length;
        Arrays.sort(nums);

        for (int i = 1; i < numsLength; i++) {
            if (nums[i] == nums[i - 1]) {
                resultArray[0] = nums[i];
                break;
            }
        }

        int expectedSum = numsLength * (numsLength + 1) / 2;
        int actualSum = Arrays.stream(nums).sum();
        resultArray[1] = expectedSum - (actualSum - resultArray[0]);

        return resultArray;
    }
}
