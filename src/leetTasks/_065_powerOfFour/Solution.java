package leetTasks._065_powerOfFour;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int n = 16;
        System.out.println((isPowerOfFour(n)));
    }

    public static boolean isPowerOfFour(int n) {

        if (n == 1) {return true;}
        if (n%4 !=0 || n == 0) {
            return false;
        }
        return isPowerOfFour(n/4);
    }
}
