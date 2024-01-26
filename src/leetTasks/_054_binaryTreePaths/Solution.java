package leetTasks._054_binaryTreePaths;


import java.util.ArrayList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        TreeNode54 root1 = new TreeNode54(1);
        TreeNode54 root3 = new TreeNode54(3);
        TreeNode54 root = new TreeNode54(2, root1, root3);


        System.out.println(binaryTreePaths(root));
        System.out.println();
    }


    public static List<String> binaryTreePaths(TreeNode54 root) {
        List<String> paths = new ArrayList<>();

        if (root == null) {
            return paths;
        }
        StringBuilder path = new StringBuilder();
        getPaths(root, paths, path);
        return paths;
    }

    private static void getPaths(TreeNode54 node, List<String> paths, StringBuilder path) {
        if (node == null){ return;}

        int originalLength = path.length();
        if (originalLength > 0){
            path.append("->");
        }
        path.append(node.val);

        if (node.right == null && node.left ==null){
            paths.add(path.toString());

        }else{
            getPaths(node.left,paths,path);
            getPaths(node.right,paths,path);
        }
    path.setLength(originalLength);
    }


}
