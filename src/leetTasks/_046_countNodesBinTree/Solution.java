package leetTasks._046_countNodesBinTree;

public class Solution {
    static int result = 0;

    public static void main(String[] args) {
        TreeNode46 root1 = new TreeNode46(1);
        TreeNode46 root3 = new TreeNode46(3);
        TreeNode46 root = new TreeNode46(2, root1, root3);


        System.out.println(countNodes(root));
    }


        public static int countNodes(TreeNode46 root) {
            return root == null? 0 : 1 + countNodes(root.left) + countNodes(root.right);
        }

/*
    public static int countNodes(TreeNode46 root) {
        if (root == null) {
            return result;
        }

        if (root.left != null) {
            result++;
            countNodes(root.left);
        }

        if (root.right != null) {
            result++;
            countNodes(root.right);
        }
        return result + 1;
    }*/
}
