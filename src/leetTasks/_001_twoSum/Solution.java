package leetTasks._001_twoSum;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int [] nums = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(nums,target)));
    }

    public static int[] twoSum (int[] nums, int target) {
        int indices[] = {0,0};
        for (int i = 0; i < nums.length; i++) {
            for(int j=0; j < nums.length; j++) {
                if (i != j) {
                    if (target == nums [i] + nums[j]){
                        indices[0] = j;
                        indices[1] = i;
                    }
                }
            }
        }
        return indices;
    }
}
