package leetTasks._056_isUgly;

/*
An ugly number is a positive integer whose prime factors are limited to 2, 3, and 5.

Given an integer n, return true if n is an ugly number.
Input: n = 6 Output: true Explanation: 6 = 2 × 3
Input: n = 14 Output: false Explanation: 14 is not ugly since it includes the prime factor 7.

 */
public class Solution {
    public static void main(String[] args) {
        int n = 14;
        //   int columnNumber = 52;
        System.out.println(isUgly(n));
    }

    public static boolean isUgly(int n) {

        if(n == 0){
            return false;
        }
        for(int i = 2; i<6; i++){
            while(n % i==0){
                n = n/i;
            }
        }
        return n==1;
    }
}
