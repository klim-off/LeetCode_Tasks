package leetTasks._037_sheetColumnNumber;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String columnTitle = "AB";


        System.out.println(titleToNumber(columnTitle));
    }
    private static int titleToNumber(String columnTitle) {
        int result = 0;
        String reverseTitle = new StringBuilder(columnTitle).reverse().toString();
        char[] columnChar = reverseTitle.toCharArray();
        for (int i = 0; i < columnChar.length; i++) {
            result = (int) (result + (letterToNum(String.valueOf(columnChar[i])) * Math.pow(26,i)));
        }
        return result;
    }

    private static  int letterToNum(String letter) {

        String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        return LETTERS.indexOf(letter) +1;
    }
}
