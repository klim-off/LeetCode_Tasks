package LeetTasksMedium._015_searchRange;

import com.sun.jdi.Value;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums = {0,1,2,3,3,4,4,5,5,6,6,7,7,7,9,9,11,11,11,12,12,12,12};
        int target = 12;
        System.out.println(Arrays.toString(searchRange(nums,target)));
    }

        public static int[] searchRange(int[] nums, int target) {
            int first = findFirst(nums, target);
            int last = findLast(nums, target);
            return new int[]{first, last};
        }

        private static int findFirst(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            int first = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    if (mid == 0 || nums[mid - 1] != target) {
                        first = mid;
                        break;
                    } else {
                        right = mid - 1;
                    }
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return first;
        }

        private static int findLast(int[] nums, int target) {
            int left = 0, right = nums.length - 1;
            int last = -1;
            while (left <= right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] == target) {
                    if (mid == nums.length - 1 || nums[mid + 1] != target) {
                        last = mid;
                        break;
                    } else {
                        left = mid + 1;
                    }
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
            return last;
        }
}
