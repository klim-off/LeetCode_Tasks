package leetTasks._010_searchInsertPosition;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {1,3,5,6};
        int val = 7;
        System.out.println(searchPosition(array,val));
    }

    private static int searchPosition(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            } else if (target < nums[i]) {
                return i;
            }
        }
        return nums.length;
    }
}



