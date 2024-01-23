package leetTasks._048_invertBinTree;

import leetTasks._046_countNodesBinTree.TreeNode46;

public class Solution {

    public static void main(String[] args) {
        TreeNode48 root1 = new TreeNode48(1);
        TreeNode48 root3 = new TreeNode48(3);
        TreeNode48 root = new TreeNode48(2, root1, root3);


        System.out.println(invertTree(root));
        System.out.println();
    }

    public static TreeNode48 invertTree(TreeNode48 root) {

        if (root == null) return root;

        invertTree(root.left);
        invertTree(root.right);
        TreeNode48 tempRoot = root.left;
        root.left = root.right;
        root.right = tempRoot;
        return root;
    }
}
