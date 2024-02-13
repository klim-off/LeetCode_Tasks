package leetTasks._088_islandPerimeter;

public class Solution {

    public static void main(String[] args) {
        int[][] nums = {
                {0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 0}};
        System.out.println(islandPerimeter(nums));
    }

    public static int islandPerimeter(int[][] nums) {
        int perimeter = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                if (nums[i][j] == 1) {
                    perimeter += getLocalPerimeter(i, j, nums);
                }
            }
        }
        return perimeter;
    }

    private static int getLocalPerimeter(int i, int j, int[][] nums) {
        int localPerimeter = 0;
        if (i == 0) {
            localPerimeter++;
        } else {
            if (nums[i - 1][j] == 0){
                localPerimeter++;
            }
        }
        if (j == 0) {
            localPerimeter++;
        } else {
            if (nums[i][j-1] == 0){
                localPerimeter++;
            }
        }
        if (i == nums.length-1) {
            localPerimeter++;
        } else {
            if (nums[i+1][j] == 0){
                localPerimeter++;
            }
        }
        if (j == nums[i].length-1) {
            localPerimeter++;
        } else {
            if (nums[i][j+1] == 0){
                localPerimeter++;
            }
        }
        return localPerimeter;
    }
}
