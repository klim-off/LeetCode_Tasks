package leetTasks._019_isSameTree;

import leetTasks._018_binTree_inorderTraversal.TreeNode;

public class Solution {

    public static void main(String[] args) {

        TreeNode19 p = new TreeNode19(1);
        TreeNode19 q = new TreeNode19(1);

        System.out.println(isSameTree(p,q));
    }

    public static boolean isSameTree(TreeNode19 p, TreeNode19 q) {

          if (p == null && q == null){ return true;}
          if (p == null || q == null) {return false;}
          if (p.val != q.val) {return false;}

          if (isSameTree(p.left,q.left) && (isSameTree(p.right,q.right))){
              return true;
        }
        return false;
    }

}
