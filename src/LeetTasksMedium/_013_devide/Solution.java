package LeetTasksMedium._013_devide;

/*
Given two integers dividend and divisor, divide two integers without using multiplication, division, and mod operator.

The integer division should truncate toward zero, which means losing its fractional part.
For example, 8.345 would be truncated to 8, and -2.7335 would be truncated to -2.

Return the quotient after dividing dividend by divisor.

Note: Assume we are dealing with an environment that could only store integers within the 32-bit signed integer range:
 [−231, 231 − 1]. For this problem,
if the quotient is strictly greater than 231 - 1, then return 231 - 1,
 and if the quotient is strictly less than -231, then return -231.
 */

public class Solution {

    public static void main(String[] args) {
        int dividend = -231;
        int divisor = 3;
        System.out.println(divide(dividend, divisor));
    }

    public  static int divide(int dividend, int divisor) {
        if (dividend == 0) {return 0;}
        if (dividend == divisor) {return 1;}
        if (dividend + divisor == 0){return -1;}
        if (divisor == 1) {return dividend;}
        if (divisor == -1) {return -dividend;}
        int result = 0;

        if (dividend < 0) {
            if (divisor<0){
                while (dividend < 0){
                    dividend -=divisor;
                    result++;
                }
                return result-1;
            }
            if(divisor>0){
                while (dividend < 0){
                    dividend +=divisor;
                    result--;
                }
                return dividend ==0? result:result+1;
            }
        }

        if (dividend > 0) {
            if (divisor>0){
                while (dividend > 0){
                    dividend -=divisor;
                    result++;
                }
                return result-1;
            }
            if(divisor<0){
                while (dividend > 0){
                    dividend +=divisor;
                    result--;
                }
                return result+1;
            }
        }
        return result;
    }
}
