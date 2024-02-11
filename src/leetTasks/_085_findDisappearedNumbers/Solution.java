package leetTasks._085_findDisappearedNumbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int [] s = {4,3,2,7,8,2,3,1};
        System.out.println(findDisappearedNumbers(s).toString());
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
       // Arrays.sort(nums);
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains( i+1)) {
                result.add(i+1);
            }
        }
       return result;
    }
}
