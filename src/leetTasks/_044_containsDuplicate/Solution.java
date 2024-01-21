package leetTasks._044_containsDuplicate;

import java.util.*;

/*

Given an integer array nums,
return true if any value appears at least twice in the array,
and return false if every element is distinct.
 */
public class Solution {

    public static void main(String[] args) {
        int[] nums = {7,10,5,5,6,6,4,10,5,4,9,4,9,6,5,9,6,3,6,5,6,7,7,4,9,9,10,5,8,1,8,3,2,7,5,10,1,8,5,8,4,3,6,4,9,4,2,8,3,2,2,1,5,6,3,2,6,1,8,6,2,9,1,4,5,10,8,5,10,5,10,1,4,8,3,6,4,10,9,1,1,1,2,2,9,6,6,8,1,9,2,5,5,2,1,8,5,2,3,10};

        System.out.println(containsDuplicate( nums));
    }



     public  static  boolean containsDuplicate(int[] nums) {
       // declare HashSet to store nums:
        Set<Integer> set = new HashSet<>();
        // iterate over nums array:
        for (int i = 0; i < nums.length; i++) {
            // get num from nums
            int num = nums[i];
            // check if num is already in HashSet, if true return true
            if(set.contains(num)) return true;
            // add num into HashSet
            set.add(num);
        }
        // return false if no dublicate found
        return false;
    }

  /*  public static boolean containsDuplicate(int[] nums) {

        List<Integer> listNums = Arrays.stream(nums).boxed().toList();
        for (Integer listNum : listNums) {
            if (Collections.frequency(listNums,listNum) == 2) {
                System.out.println(listNum + " !! " + Collections.frequency(listNums,listNum));
                return true;
            }
            System.out.println(listNum + " " + Collections.frequency(listNums,listNum));
        }
        return false;
    }*/
}
