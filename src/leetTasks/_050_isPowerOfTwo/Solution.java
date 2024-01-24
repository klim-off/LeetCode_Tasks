package leetTasks._050_isPowerOfTwo;

public class Solution {
    public static void main(String[] args) {
        int n = 16;
        System.out.println(isPowerOfTwo( n));

    }

    public static boolean isPowerOfTwo(int n) {

        if(n == 1) return true;
        if(n == 0 || n%2 != 0) return false;
        return isPowerOfTwo(n/2);

    }
}
