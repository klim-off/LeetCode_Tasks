package leetTasks._035_excelSheetColumn;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        int columnNumber = 2147483647;
     //   int columnNumber = 52;

        System.out.println(convertToTitle(columnNumber));
    }

    public static String convertToTitle(int columnNumber) {
        StringBuilder result = new StringBuilder();
        while (columnNumber > 0) {
            if (columnNumber <= 26) {
                result.append(numToLetterBySubstr(columnNumber));
                break;
            }
            result.append(numToLetterBySubstr(columnNumber % 26));
            if (columnNumber % 26 == 0) {
                columnNumber = columnNumber / 26 - 1;
            } else {
                columnNumber = columnNumber / 26;
            }

        }
        return result.reverse().toString();
    }
    static char numToLetterBySubstr(int i) {
        i--;
        String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        if (i >= 0 && i <= 26) {
            return LETTERS.substring(i, i + 1).charAt(0);
        } else {
            return 'Z';
        }
    }
}
