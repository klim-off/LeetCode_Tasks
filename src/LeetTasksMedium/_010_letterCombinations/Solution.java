package LeetTasksMedium._010_letterCombinations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/*
Given a string containing digits from 2-9 inclusive,
return all possible letter combinations that the number could represent. Return the answer in any order.
A mapping of digits to letters (just like on the telephone buttons) is given below.
 Note that 1 does not map to any letters.
Constraints:
0 <= digits.length <= 4
digits[i] is a digit in the range ['2', '9'].
 */

public class Solution {
    public static void main(String[] args) {
        String digits = "453";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) {return Collections.emptyList(); }

        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone_map, output);
        return output;
    }

    private static void backtrack(String combination, String next_digits, String[] phone_map, List<String> output) {
        if (next_digits.isEmpty()) {
            output.add(combination);
        } else {
            String letters = phone_map[next_digits.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
            }
        }
    }
}



