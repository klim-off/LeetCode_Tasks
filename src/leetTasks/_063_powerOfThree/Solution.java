package leetTasks._063_powerOfThree;

public class Solution {
    public static void main(String[] args) {
        int p = 27;
        System.out.println(isPowerOfThree(p));
    }

    public static boolean isPowerOfThree(int n) {
        if (n == 1){return true;}
        if (n%3 != 0 || n == 0) {
            return false;
        }
        return isPowerOfThree(n/3);

    }

}
