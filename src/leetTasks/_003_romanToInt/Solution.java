package leetTasks._003_romanToInt;


import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String target = "LVIII";

        System.out.println(romanToInt(target));
    }

    private static int romanToInt(String S) {
        int result = 0;
        Map<Character, Integer> romanValue = Map.of(
                'I', 1,
                'V', 5,
                'X', 10,
                'L', 50,
                'C', 100,
                'D', 500,
                'M', 1000
        );
        char[] charArray = S.toCharArray();

        int i = 0;

        while (i < charArray.length) {
            if (charArray[i] == 'I') {
                if ((i + 1) < charArray.length && charArray[i + 1] == 'V') {
                    result += 4;
                    i += 2;
                } else if ((i + 1) < charArray.length && charArray[i + 1] == 'X') {
                    result += 9;
                    i += 2;
                } else {
                    result += romanValue.get(charArray[i]);
                    i += 1;
                }
            } else if (charArray[i] == 'X') {
                if ((i + 1) < charArray.length && charArray[i + 1] == 'L') {
                    result += 40;
                    i += 2;
                } else if ((i + 1) < charArray.length && charArray[i + 1] == 'C') {
                    result += 90;
                    i += 2;
                } else {
                    result += romanValue.get(charArray[i]);
                    i += 1;
                }
            } else if (charArray[i] == 'C') {
                if ((i + 1) < charArray.length && charArray[i + 1] == 'D') {
                    result += 400;
                    i += 2;
                } else if ((i + 1) < charArray.length && charArray[i + 1] == 'M') {
                    result += 900;
                    i += 2;
                } else {
                    result += romanValue.get(charArray[i]);
                    i += 1;
                }
            } else {
                result += romanValue.get(charArray[i]);
                i += 1;
            }
        }
        return result;
    }
}