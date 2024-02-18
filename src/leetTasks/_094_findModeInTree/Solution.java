package leetTasks._094_findModeInTree;


import java.util.*;

public class Solution {
    public static void main(String[] args) {
        TreeNode94 root1 = new TreeNode94(2);
        TreeNode94 root3 = new TreeNode94(3);
        TreeNode94 root = new TreeNode94(2, root1, root3);

        System.out.println(Arrays.toString(findMode(root)));
        System.out.println();
    }
    static private Map <Integer, Integer> resultMap = new HashMap<>();
    public static int[] findMode(TreeNode94 root) {
         if (resultMap.containsKey(root.val)) {resultMap.put(root.val, resultMap.get(root.val) + 1);}
         else   resultMap.put(root.val, 1);

         if (root.left != null) {findMode(root.left);}
         if(root.right != null) {findMode(root.right);}

       int [] resultArray = {0};
        for (Map.Entry<Integer, Integer> entry : resultMap.entrySet()) {
            if (entry.getValue() > resultArray[0]) {
                resultArray[0] = entry.getKey();
            }
        }
          return resultArray;
    }
}
