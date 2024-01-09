package leetTasks._020_isSymmetric;

import leetTasks._019_isSameTree.TreeNode19;

public class Solution {

    public static void main(String[] args) {

        TreeNode20 p = new TreeNode20(1);
        System.out.println(isSymmetric(p));
    }
    public static boolean isSymmetric(TreeNode20 root) {
      TreeNode20 right = root.right;
      TreeNode20 left = root.left;

      return  isSameTree (right,left);
    }

    public static boolean isSameTree(TreeNode20 right, TreeNode20 left) {

        if (right == null && left == null){ return true;}
        if (right == null || left == null) {return false;}
        if (right.val != left.val) {return false;}

        if (isSameTree(right.left,left.right) && (isSameTree(right.right,left.left))){
            return true;
        }
        return false;
    }
}
