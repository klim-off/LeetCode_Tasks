package leetTasks._109_canPlaceFlowers;

/*
You have a long flowerbed in which some of the plots are planted, and some are not.
However, flowers cannot be planted in adjacent plots.
Given an integer array flowerbed containing 0's and 1's, where 0 means empty and 1 means not empty, and an integer n,
 return true if n new flowers can be planted in the flowerbed without violating the no-adjacent-flowers rule
  and false otherwise.
Example 1:
Input: flowerbed = [1,0,0,0,1], n = 1
Output: true

 */
public class Solution {

    public static void main(String[] args) {
        int[] flowerbed = {1,0,0,0,0,0,1};
        int n = 2;
        System.out.println(canPlaceFlowers(flowerbed, n));
    }

    public static boolean canPlaceFlowers(int[] flowerbed, int n) {
        if (n == 0) return true;
        int flowerdbedLength = flowerbed.length;
        if (flowerdbedLength < n) return false;
        if (flowerdbedLength == 1) {
            return flowerbed[0] == 0 && n == 1;
        }

        if (flowerbed[0] == 0 && flowerbed[1] == 0) {
            n--;
            if (n == 0) return true;
            flowerbed[0] = 1;
        }

        if (flowerbed[flowerdbedLength - 1] == 0 && flowerbed[flowerdbedLength - 2] == 0) {
            n--;
            if (n == 0) return true;
            flowerbed[0] = 1;
        }

        int countPlaces = 0;
        for (int i = 1; i < flowerdbedLength - 1; i++) {
            if (flowerbed[i] == 0) {countPlaces++;}
            if (flowerbed[i] == 1){countPlaces=0;}
            if (countPlaces == 3) {
                n--;
                if (n == 0) {return true;}
                countPlaces = 1;
            }
        }
        return false;
    }
}
