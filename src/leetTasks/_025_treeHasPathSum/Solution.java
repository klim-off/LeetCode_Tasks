package leetTasks._025_treeHasPathSum;

import leetTasks._023_isBalancedTree.TreeNode23;

public class Solution {

    public static void main(String[] args) {

        TreeNode25 root = new TreeNode25(1);
        int target = 1;
        System.out.println(hasPathSum(root, target));
    }

    public  static boolean hasPathSum(TreeNode25 root, int targetSum) {
        if(root == null) return false;
        return hasPathSumHelper(root, targetSum, root.val);
    }

    private static boolean hasPathSumHelper(TreeNode25 root, int targetSum, int currentSum) {
        boolean flag1 = false, flag2 = false;
        if(root.right == null && root.left == null && currentSum == targetSum) return true;
        if(root.right != null) flag1 = hasPathSumHelper(root.right, targetSum, currentSum+root.right.val);
        if(root.left != null) flag2 = hasPathSumHelper(root.left, targetSum, currentSum+root.left.val);
        return  flag1 || flag2;
    }
}
