package leetTasks._117_imageSmoother;

import java.util.Arrays;

/*
An image smoother is a filter of the size 3 x 3 that can be applied to each cell of an image by rounding down
 the average of the cell and the eight surrounding cells (i.e., the average of the nine cells in the blue smoother).
  If one or more of the surrounding cells of a cell is not present,
 we do not consider it in the average (i.e., the average of the four cells in the red smoother).
 ***
Given an m x n integer matrix img representing the grayscale of an image,
 return the image after applying the smoother on each cell of it.
 ***
 Input: img = [[100,200,100],[200,50,200],[100,200,100]]
Output: [[137,141,137],[141,138,141],[137,141,137]]
Explanation:
For the points (0,0), (0,2), (2,0), (2,2): floor((100+200+200+50)/4) = floor(137.5) = 137
For the points (0,1), (1,0), (1,2), (2,1): floor((200+200+50+200+100+100)/6) = floor(141.666667) = 141
For the point (1,1): floor((50+200+200+200+200+100+100+100+100)/9) = floor(138.888889) = 138
 */
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
