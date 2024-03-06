package LeetTasksMedium._006_containerWithMostWater;

public class Solution {

    public static void main(String[] args) {
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};

        System.out.println(maxArea(height));
    }
    public  static int maxArea(int[] height) {
        int width;
        int maxArea = 0;
        int firstPosition = 0;
        int lastPosition = height.length - 1;

        /* //brute force
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                width = j-i;
                maxArea = Math.max(maxArea,(width * Math.min(height[i] , height[j])));
            }
        }    return  maxArea;*/


        while (firstPosition < lastPosition) {
             width = lastPosition - firstPosition;
             maxArea = Math.max(maxArea,(width * Math.min(height[firstPosition] , height[lastPosition])));
             if (height[firstPosition] < height[lastPosition]){
                 firstPosition ++ ;
             }else {
                 lastPosition--;
             }
        } return  maxArea;
    }
}
