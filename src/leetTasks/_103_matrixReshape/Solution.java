package leetTasks._103_matrixReshape;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [][] mat = {{1,2},{3,4}};
        int r = 1;
        int c = 4;

        System.out.println(Arrays.deepToString(matrixReshape(mat, r, c)));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length * mat[0].length != r*c) return mat;
        int [][] resultArray = new int[r][c];
        int resI = 0;
        int resJ = 0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                resultArray[resI][resJ] = mat[i][j];
                if (resJ < c-1){
                    resJ++;
               }else{
                    resI ++;
                    resJ =0;
                }
            }
        }
    return resultArray;
    }
}
