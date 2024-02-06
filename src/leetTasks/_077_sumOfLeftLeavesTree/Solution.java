package leetTasks._077_sumOfLeftLeavesTree;



public class Solution {

    public static void main(String[] args) {
        TreeNode77 root1 = new TreeNode77(1);
        TreeNode77 root3 = new TreeNode77(3);
        TreeNode77 root = new TreeNode77(2, root1, root3);

        System.out.println(sumOfLeftLeaves(root));
        System.out.println();
    }

    static int result;
    public static int sumOfLeftLeaves(TreeNode77 root) {
        result=0;

        findLeftNode(root.left, true);

        findLeftNode(root.right, false);

        return result;
    }

    private static void findLeftNode(TreeNode77 root, boolean flag) {

        if(root == null) return;

        if(flag && root.left==null && root.right==null) result+=root.val;

        findLeftNode(root.left, true);
        findLeftNode(root.right, false);
    }
}
