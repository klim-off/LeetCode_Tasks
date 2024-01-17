package leetTasks._036_majorityElement;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int[] nums = {3,2,3};
        System.out.println( majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        Map<Integer,Integer>  analyticMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (analyticMap.get(nums[i]) != null){
                analyticMap.put(nums[i], analyticMap.get(nums[i]) + 1);
            }else {
                analyticMap.put(nums[i],  1);
            }
        }
        int maxValue =  Collections.max(analyticMap.values());

        Integer maxValueKey = analyticMap.keySet().stream().
                              max(Comparator.comparing(analyticMap::get)).
                              orElse(0);

        return maxValueKey;
    }
}
