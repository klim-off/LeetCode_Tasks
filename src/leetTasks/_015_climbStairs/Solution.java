package leetTasks._015_climbStairs;

public class Solution {

    public static void main(String[] args) {
        int x = 4;
        System.out.println( climbStairs(x) );
    }
    public static int climbStairs(int n) {
        if(n <= 2){
            return n;
        }

        int a = 1;
        int b = 2;

        for(int i=2; i<n; i++){
            int c = a+b;
            a = b;
            b = c;
        }
        return b;

    }
}
