package leetTasks._064_countingBits;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(countBits(n)));
    }

    public static int[] countBits(int n) {
      int [] arrayBits = new int[n+1];

        for (int i = 0; i < arrayBits.length; i++) {
            String  stringBits = Integer.toBinaryString(i);
            arrayBits[i] = stringBits.length() - stringBits.replace("1", "").length();
        }
      return arrayBits;
    }
}
