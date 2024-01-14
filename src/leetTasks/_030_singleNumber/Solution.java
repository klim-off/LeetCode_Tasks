package leetTasks._030_singleNumber;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {1};
        System.out.println("Current array: " + Arrays.toString(array));
        System.out.println("single number: " + singleNumber(array));
    }

    public static int singleNumber(int[] nums) {
     Arrays.sort(nums);
     int i = 0;
     while ( i < nums.length){
         if ((i+2)<nums.length && (nums[i] == nums[i+1])) {
             i += 2;
         }else {
             return nums[i];
         }
     }
    return nums[i];
    }
}
