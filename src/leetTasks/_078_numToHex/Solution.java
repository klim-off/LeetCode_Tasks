package leetTasks._078_numToHex;

public class Solution {
    public static void main(String[] args) {
        int n = 10;

        System.out.println((toHex(n)));
    }

    public static String toHex(int num) {
        return Integer.toHexString(num);
    }

}
