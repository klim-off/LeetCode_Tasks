package leetTasks._062_rangeSumQuery;

public class Solution {

    public static void main(String[] args) {
        int [] nums = {-2, 0, 3, -5, 2, -1};
        NumArray obj = new NumArray(nums);
        int left = 0;
        int right = 2;
        int param_1 = obj.sumRange(left,right);

        System.out.println(param_1);
    }
}
