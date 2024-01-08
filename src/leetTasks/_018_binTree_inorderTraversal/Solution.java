package leetTasks._018_binTree_inorderTraversal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Input: root = [1,null,2,3]
Output: [1,3,2]
*/

public class Solution {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        System.out.println(inorderTraversal(root).toString());
    }
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if ( root == null ) return list;
        return inorderTraversal(root,list);
    }

    private static List<Integer> inorderTraversal(TreeNode root, List<Integer> list) {
        if (root != null) {
            inorderTraversal(root.left, list);
            list.add(root.val);
            inorderTraversal(root.right, list);
        }
        return list;
    }
}
