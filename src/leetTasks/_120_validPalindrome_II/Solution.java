package leetTasks._120_validPalindrome_II;

public class Solution {
    public static void main(String[] args) {
        String s = "acbdaadca";
        System.out.println(validPalindrome(s));
    }
    public static boolean validPalindrome(String s) {
        int left = 0;
        int right = s.length()-1;

        while (left < right){
            if (s.charAt(left) != s.charAt(right)){
              return isRestOfStringValid(s,left+1,right) || isRestOfStringValid(s,left,right-1);
            }
            left++;
            right--;
        }
        return true;
    }

    private static boolean isRestOfStringValid(String s, int left, int right) {
        String str = s.substring(left,right+1);
        String reverseStr = new StringBuilder(str).reverse().toString();
        return str.equals(reverseStr);
    }
}
