package leetTasks._024_minDepthTree;



public class Solution {
    public static void main(String[] args) {

        TreeNode24 root = new TreeNode24(0);
        System.out.println(minDepth(root));
    }

    public static int minDepth(TreeNode24 root) {
        int depth=0;
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        { return 1;
        }
        if(root.left==null)
        {return 1+minDepth(root.right);}

        if(root.right==null){

            return 1+minDepth(root.left);
        }
        int lf=minDepth(root.left)+1;
        int rf=minDepth(root.right)+1;
        depth=Math.min(lf,rf);
        return depth;

    }
}
