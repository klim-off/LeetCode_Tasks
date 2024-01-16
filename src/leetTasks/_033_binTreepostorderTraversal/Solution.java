package leetTasks._033_binTreepostorderTraversal;

import leetTasks._032_binTreePreorderTraversal.TreeNode32;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        TreeNode33 root = new TreeNode33(1);
        System.out.println(postorderTraversal(root));
    }

    public static List<Integer> Traversal(TreeNode33 root, List<Integer> arr){
        if(root!=null){
            int data=root.val;
            Traversal(root.left,arr);
            Traversal(root.right,arr);
            arr.add(data);
        }
        return arr;
    }

    public  static List<Integer> postorderTraversal(TreeNode33 root) {
        ArrayList<Integer> arr=new ArrayList<>();
        return Traversal(root,arr);
    }
}
