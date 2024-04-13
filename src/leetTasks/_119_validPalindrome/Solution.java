package leetTasks._119_validPalindrome;

/*
Given a string s, return true if the s can be palindrome after deleting at most one character from it.
Example :
Input: s = "abca"
Output: true
Explanation: You could delete the character 'c'.
 */
public class Solution {

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validPalindrome(s));
    }

    public static boolean validPalindrome(String s) {
        StringBuilder builderS = new StringBuilder();
        StringBuilder builderReverse = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            builderS.append(s).deleteCharAt(i);
            builderReverse.append(s).deleteCharAt(i).reverse();
            if (builderS.toString().equals(builderReverse.toString())) {
                return true;
            }
            builderS.setLength(0);
            builderReverse.setLength(0);
        }
        return false;
    }
}
