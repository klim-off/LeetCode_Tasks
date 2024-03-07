package LeetTasksMedium._007_integerToRoman;

import java.util.Map;

/*
For example, 2 is written as II in Roman numeral, just two one's added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.

Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:

I can be placed before V (5) and X (10) to make 4 and 9.
X can be placed before L (50) and C (100) to make 40 and 90.
C can be placed before D (500) and M (1000) to make 400 and 900.
Given an integer, convert it to a roman numeral.

Input: num = 1994
Output: "MCMXCIV"
Explanation: M = 1000, CM = 900, XC = 90 and IV = 4.

 */
public class Solution {
    public static void main(String[] args) {
        /*for (int i = 1; i < 55; i++) {
            System.out.println(intToRoman(i));
        }*/
        System.out.println(intToRoman(60));
    }

    /* **solution in leet**
     public String intToRoman(int num) {
        int[] nums = new int[] { 1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000 };
        String[] symbols = new String[] { "I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };
        StringBuilder roman = new StringBuilder();
        for (int i = nums.length-1; i >= 0; i--) {
            while (num >= nums[i]) {
                roman.append(symbols[i]);
                num -= nums[i];
            }
        }
        return roman.toString();
    }
     */

    public static String intToRoman(int num) {
        StringBuilder resultBuilder = new StringBuilder();
        String[] romanSymbol = {"CM", "D", "CD", "C",
                "XC", "L", "XL", "X",
                "IX", "V", "IV", "I"};

        if (num >= 1000) {
            for (int i = 0; i < ((num - (num % 1000)) / 1000); i++) {
                resultBuilder.append("M");
            }
            num = num % 1000;
        }
        if (num >= 100) {
            resultBuilder.append(getRoman(num, romanSymbol, 100));
            num = num % 100;
        }
        if (num >= 10) {
            resultBuilder.append(getRoman(num, romanSymbol, 10));
            num = num % 10;
        }
        if (num >= 1) {
            resultBuilder.append(getRoman(num, romanSymbol, 1));
        }
        return resultBuilder.toString();
    }

    private static String getRoman(int num, String[] romanSymbol, int k) {
        int index = 0;
        if (k == 10) {
            index = 4;
        }
        if (k == 1) {
            index = 8;
        }
        int tempVar;
        StringBuilder tempBuilder = new StringBuilder();
        if (num >= 9 * k) {
            return romanSymbol[0 + index];
        }
        if (num >= 5 * k) {
            tempBuilder.append(romanSymbol[1 + index]);
            tempVar =(num - 5 * k) / k;
            for (int i = 0; i < tempVar; i++) {
                tempBuilder.append(romanSymbol[3 + index]);
            }
            return tempBuilder.toString();
        }
        if (num >= 4 * k) {
            return romanSymbol[2 + index];
        }
        if (num >= 1 * k) {
            tempBuilder.append(romanSymbol[3 + index]);
            if (k == 100 || k == 10) {
                num = num - num % (1 * k);
            }
            tempVar = (num - 1 * k) / k;
            for (int i = 0; i < tempVar; i++) {
                tempBuilder.append(romanSymbol[3 + index]);
            }
        }
        return tempBuilder.toString();
    }
}
