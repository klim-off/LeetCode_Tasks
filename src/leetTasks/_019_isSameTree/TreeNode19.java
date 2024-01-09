package leetTasks._019_isSameTree;

public class TreeNode19 {
    int val;
   TreeNode19 left;
    TreeNode19 right;
    TreeNode19() {}
    TreeNode19(int val) { this.val = val; }
    TreeNode19(int val, TreeNode19 left, TreeNode19 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
