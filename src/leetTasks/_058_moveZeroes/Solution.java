package leetTasks._058_moveZeroes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {0, 0, 0, 0, 0, 0, 1, 1, 1};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void moveZeroes(int[] nums) {
        int n = nums.length;
        int i = 0;
        for (int j = 0; j < n; j++) {
            if (nums[j] != 0) {
                nums[i] = nums[j];
                i++;
            }
        }
        for (int k = i; k < n; k++) {
            nums[k] = 0;
        }
    }
  /*  public static void moveZeroes(int[] nums) {
        boolean haveNull = false;
      List<Integer> listNums = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0){
                listNums.add(nums[i]);

            }else haveNull = true;
        }
        if (!haveNull) {return;}
        for (int i = 0; i < nums.length; i++) {
            if (i<listNums.size())
            nums[i] = listNums.get(i);
            else nums[i] =0;
        }
    }*/


}
