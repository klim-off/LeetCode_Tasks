package leetTasks._049_summaryRangesArray;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
    //    int[] nums = {0,1,2,4,5,7};
        int[] nums = {0,2,3,4,6,8,9};

        System.out.println(summaryRanges( nums));
    }

    public static List<String> summaryRanges(int[] nums) {
       List<String> resultList = new ArrayList<>();
        int i = 0;
        int nextI=0;
        while (i< nums.length){
            if (i+1 == nums.length){
                resultList.add(String.valueOf(nums[i]));
                break;
            }
            nextI = i;

            while (nextI <nums.length) {
                if (nextI+1 == nums.length){
                    break;
                }
                if ((nums[nextI] + 1) != nums[nextI + 1]) {

                    break;
                } else {  nextI++; }
            }
            if (i==nextI) {
                resultList.add(String.valueOf(nums[i]));
            }else {
                resultList.add(String.valueOf(nums[i]) + "->" + String.valueOf(nums[nextI]));}
            i = nextI+1;
        }
     return resultList;
    }
}
