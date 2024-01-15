package leetTasks._032_binTreePreorderTraversal;


import java.util.ArrayList;
import java.util.List;

public class Solution {
    static List<Integer> ans = new ArrayList<>();
    public static void main(String[] args) {
        TreeNode32 root = new TreeNode32(1);
        System.out.println(preorderTraversal(root));
    }

    public static List<Integer> preorderTraversal(TreeNode32 root) { //T.C:0(n) S.C:0(n)
        List<Integer> list=new ArrayList<>();
        dfs(root,list);
        return list;
    }

    static void  dfs(TreeNode32 root, List<Integer> list)
    {
        if(root==null)
            return;
        list.add(root.val);
        dfs(root.left,list);
        dfs(root.right,list);
    }

}
