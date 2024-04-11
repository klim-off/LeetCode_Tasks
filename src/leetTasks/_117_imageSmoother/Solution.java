package leetTasks._117_imageSmoother;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int [][] area = {{100,200,100},{200,50,200},{100,200,100}};
        System.out.println(Arrays.deepToString(imageSmoother(area)));

    }

    public static int[][] imageSmoother(int[][] img) {
        var moves = new int[] {-1, 0, 1};

        var imgLength = img.length;
        var imgRowLength = img[0].length;

        var res = new int[imgLength][imgRowLength];

        for (var i=0; i<imgLength; i++) {
            for (var j=0; j<imgRowLength; j++) {
                var counter = 0;
                var value = 0;

                for (var a : moves) {
                    for (var b : moves) {
                        var x = i + a;
                        var y = j + b;

                        if (x < 0 || x >= imgLength || y < 0 || y >= imgRowLength) continue;

                        counter++;
                        value += img[x][y];
                    }
                }
                res[i][j] = value / counter;
            }
        }
        return res;

    }
}
