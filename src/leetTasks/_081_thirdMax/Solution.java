package leetTasks._081_thirdMax;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int [] n = {3,2,1,4};
        System.out.println((thirdMax(n)));
    }

    public static int thirdMax(int[] nums) {

        Arrays.sort(nums);
        List <Integer> numList = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!numList.contains(nums[i])) {
                numList.add(nums[i]);
            }
        }

        return numList.size()>2?numList.get(numList.size()-3): numList.get(numList.size()-1);
    }
}
