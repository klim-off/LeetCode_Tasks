package leetTasks._008_remoteElement;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] array = {0,1,2,2,3,0,4,2};
        int val = 2;
        System.out.println("Current array: " + Arrays.toString(array));
        System.out.println(remoteElement(array,val));
        System.out.println("Result array: " + Arrays.toString(array));
    }

    private static int remoteElement(int[] nums, int val) {
        int[] tempArray = new int[nums.length];
        int indexTempArray = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                tempArray[indexTempArray] = nums[i];
                indexTempArray ++;
            }
        }


        for (int j = 0; j < tempArray.length; j++) {
                nums[j] = tempArray[j];
        }
        return indexTempArray;
    }


}
