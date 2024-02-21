package leetTasks._097_detectCapital;



public class Solution {
    public static void main(String[] args) {
        String word = "RTa";
        System.out.println(detectCapitalUse(word));
    }
    public  static boolean detectCapitalUse(String word) {
        if ( Character.isUpperCase(word.charAt(0))) {
            return isAllUpperCase(word,1) || isAllLowCase(word,1);
        }
        else  return isAllLowCase(word,0);
    }

    private static boolean isAllLowCase(String word, int n) {
        for (int i = n; i < word.length(); i++) {
            if (!Character.isLowerCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    private static boolean isAllUpperCase(String word, int n) {
        for (int i = n; i < word.length(); i++) {
            if (!Character.isUpperCase(word.charAt(i))) {
                return false;
            }
        }
        return true;
    }
}
