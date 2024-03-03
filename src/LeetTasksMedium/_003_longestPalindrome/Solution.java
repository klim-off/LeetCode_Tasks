package LeetTasksMedium._003_longestPalindrome;

public class Solution {
    public static void main(String[] args) {
        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static  String longestPalindrome(String s) {
        if (s.length() == 1) return s;
        String palindrome = String.valueOf(s.charAt(0));
        String checkPalindrome;
        for (int i = 0; i < s.length()-1; i++) {
            for (int j = i+1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    checkPalindrome = s.substring(i,j+1);
                    if (isPalindrome(checkPalindrome) && checkPalindrome.length() > palindrome.length()){
                        palindrome = checkPalindrome;
                    }
                }
            }
        }
        return palindrome;
    }

    private static boolean isPalindrome(String checkPalidrome) {
        return  checkPalidrome.equals(new StringBuilder(checkPalidrome).reverse().toString());
    }
}
