package leetTasks._032_binTreePreorderTraversal;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode32 root = new TreeNode32(1);
        System.out.println(preorderTraversal(root));
    }

    public  static List<Integer> preorderTraversal(TreeNode32 root) {

        if (root == null){return ans;}
        ans.add(root.val);
        preorderTraversal(root.right);
        preorderTraversal(root.left);
        return ans;
    }

}
