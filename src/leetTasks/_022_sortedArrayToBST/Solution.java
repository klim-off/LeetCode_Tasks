package leetTasks._022_sortedArrayToBST;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int[] nums =  {-10, -3, 0, 5, 9} ;
        TreeNode22 root = sortedArrayToBST(nums);
        System.out.println("exit");
    }

    public static TreeNode22 sortedArrayToBST(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        return createNode( nums, l, r);
    }

    private static TreeNode22 createNode(int[] nums,int l, int r) {
        if (l > r) {
            return null;
        }
        int mid = (r + l) / 2;

        TreeNode22 root = new TreeNode22(nums[mid]);
        root.left = createNode(nums, l, mid-1);
        root.right = createNode(nums, mid+1, r);

        return root;
    }
}
