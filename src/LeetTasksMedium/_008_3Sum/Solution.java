package LeetTasksMedium._008_3Sum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int [] nums = {-1,0,1,2,-1,-4,-2,-3,3,0,4};
     //   int [] nums = {0,1,1};

        for (List<Integer> integerList : threeSum(nums)) {
            System.out.println(integerList.toString());
        }

    }

    public  static  List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        boolean equals;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            for (int j = i+1; j < nums.length-1; j++) {
                for (int k = j+1; k < nums.length; k++) {
                    if (nums[i] + nums[j] + nums[k] == 0) {
                        List numsList = new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k]));
                        Collections.sort(numsList);
                        equals = false;
                        for (List<Integer> list : resultList) {
                            if (numsList.equals(list)){
                               equals = true;
                               break;
                            }
                        }
                        if (!equals){
                            resultList.add(numsList);
                            equals = false;
                        }
                    }
                }
            }
        }return resultList;
    }
}
