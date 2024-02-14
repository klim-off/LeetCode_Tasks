package leetTasks._088_islandPerimeter;

public class Solution {

    public static void main(String[] args) {
        int[][] nums = {
                {0, 0, 1, 1, 1, 0},
                {0, 1, 1, 1, 1, 1},
                {0, 0, 0, 1, 1, 0}};
        System.out.println(islandPerimeter(nums));
    }

    public static int islandPerimeter(int[][] grid) {
        int perimeter = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    perimeter += getLocalPerimeter(i, j, grid);
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
