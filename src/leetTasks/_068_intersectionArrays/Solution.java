package leetTasks._068_intersectionArrays;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersection( nums1,nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {
        Set <Integer> resultSet = new HashSet<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    resultSet.add(nums1[i]);
                }
            }
        }
        int[] resultArray = new int[resultSet.size()];
        int i = 0;
        for (Integer el : resultSet) {
            resultArray[i] = el;
            i++;
        }
        return resultArray;
    }

}
