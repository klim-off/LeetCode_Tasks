package leetTasks._092_nextGreaterElement;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] nums1 = {2,4};
        int[] nums2 = {1,2,3,4};
        System.out.println(Arrays.toString(nextGreaterElement(nums1,nums2)));
    }
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        boolean findElement = false;
        int [] result = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            result[i] = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (!findElement && nums1[i] == nums2[j]) {
                    findElement = true;
                    continue;
                }
                if (findElement && nums1[i] < nums2[j]) {
                    result [i] = nums2[j];
                    break;
                }
            }
            findElement = false;
        }
        return result;
    }
}
