package LeetTasksMedium._004_reverseInteger;

/*
Given a signed 32-bit integer x, return x with its digits reversed.
 If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
 */
public class Solution {
    public static void main(String[] args) {
        int x =  -2147483648;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        boolean negativeNumber = x<0;
        x=Math.abs(x);
        int result;
        try {
            result = Integer.parseInt(new StringBuilder(String.valueOf(x)).reverse().toString());
        } catch (NumberFormatException numberFormatException){
            return 0;
        }
        if (negativeNumber) return result * (-1);
        return result;
    }

}
