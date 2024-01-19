package leetTasks._040_happyNumber;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int n = 8;
        //   int columnNumber = 52;
        System.out.println(isHappy(n));
    }

    public static boolean isHappy(int n) {
        if (n==1) return true;
        while (n > 5) {
            n = getTempResult(n);
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

    private static int getTempResult(int n) {
        int tempResult=0;
        char[] numericArray = Integer.toString(n).toCharArray();
        //System.out.println(Arrays.toString(numericArray));
        for (int i = 0; i < numericArray.length; i++) {
            tempResult += Math.pow(Character.getNumericValue(numericArray[i]), 2);

        }
        //System.out.println(tempResult);
        return tempResult;
    }
}
