package leetTasks._021_maxDepthBinTree;


import leetTasks._020_isSymmetric.TreeNode20;

public class Solution {

    public static void main(String[] args) {
        TreeNode21 root = new TreeNode21(1);
        System.out.println(maxDepth(root));
    }

    public static int maxDepth(TreeNode21 root) {
        if (root == null) {return 0;}
        return 1+maxInt(maxDepth(root.left), maxDepth(root.right));

    }

    private static int maxInt(int a, int b){
        if (a>b) {return a;}
        return b;
    }

}
