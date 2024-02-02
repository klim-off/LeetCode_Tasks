package leetTasks._069_fullIntersectionArrays;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {3,1,2};
        int[] nums2 = {1,1};
        System.out.println(Arrays.toString(intersection( nums1,nums2)));
    }

    public static int[] intersection(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length) {
            int [] temp = nums2;
            nums2 = nums1;
            nums1 = temp;
        }
        HashMap<Integer,Integer> resultmap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    if (!resultmap.containsKey(j)) {
                        resultmap.put(j,nums1[i]);
                        break;
                    }
                }
            }
        }
        int[] resultArray = new int[resultmap.size()];
        int i = 0;
        for (Map.Entry<Integer, Integer> entry : resultmap.entrySet()) {
            resultArray[i] = entry.getValue();
            i++;
        }

        return resultArray;
    }
}
