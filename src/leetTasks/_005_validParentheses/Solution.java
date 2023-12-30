package leetTasks._005_validParentheses;

public class Solution {
    public static void main(String[] args) {

       String strs = "{[]}";
     //   String strs = "()";

        System.out.println(isValid(strs));

    }

    public static boolean isValid(String s) {

        if (s.length() % 2 != 0) {
            return false;
        } else {
            int halfLength = s.length() / 2;
            for (int i = 0; i < halfLength; i++) {
                s = s.replaceAll("\\(\\)", "")
                        .replaceAll("\\{}", "")
                        .replaceAll("\\[]", "");
                if (s.isEmpty()) { return true;}
            }
            return false;
        }
    }
}