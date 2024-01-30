package leetTasks._062_rangeSumQuery;

public class NumArray {

    int [] nums;
    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int result = 0;
        for (int i = left; i <=right ; i++) {
            result += nums[i];
        }
        return result;
    }
}
