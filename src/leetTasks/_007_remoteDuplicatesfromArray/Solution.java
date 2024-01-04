package leetTasks._007_remoteDuplicatesfromArray;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int[] array = {0, 1,2,3,4,4};
        System.out.println("Current array: " + Arrays.toString(array));
        System.out.println(countSortedList(array));
        System.out.println("Result array: " + Arrays.toString(array));
    }

    private static int countSortedList(int[] nums) {
        int[] tempArray = new int[nums.length];
        int indexTempArray = 0;
        int [] tempWrongArray = new int[nums.length];
        int indexWrongArray = 0;
        int i = 0;
        while (i < nums.length) {
            if (i == 0) {
                tempArray[indexTempArray] = nums[i];
                i++;
                indexTempArray++;
            } else {
                if (nums[i] != tempArray[indexTempArray - 1]) {
                    tempArray[indexTempArray] = nums[i];
                    i++;
                    indexTempArray++;
                } else {
                    tempWrongArray[indexWrongArray] = nums[i];
                    i++;
                    indexWrongArray ++;
                }
            }
        }
        indexWrongArray = 0;
        for (int j = 0; j < tempArray.length; j++) {
           if (j<indexTempArray) {
               nums[j] = tempArray[j];
           }else {
               nums[j] = tempWrongArray[indexWrongArray];
               indexWrongArray ++;
           }
        }
        return indexTempArray;
    }
}
