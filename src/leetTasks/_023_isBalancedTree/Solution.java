package leetTasks._023_isBalancedTree;

import leetTasks._022_sortedArrayToBST.TreeNode22;

public class Solution {
    public static void main(String[] args) {

        TreeNode23 root = new TreeNode23(0);
        System.out.println(isBalanced(root));
    }

    public static boolean isBalanced(TreeNode23 root) {
        return height(root)!=-1;
    }
    public static int height(TreeNode23 node){
        if(node==null){
            return 0;
        }
        int leftHeight=height(node.left);
        if(leftHeight==-1) return -1;
        int rightHeight=height(node.right);
        if(rightHeight==-1) return -1;
        if(Math.abs(leftHeight-rightHeight)>1) return -1;
        return 1+Math.max(leftHeight,rightHeight);
    }
}
