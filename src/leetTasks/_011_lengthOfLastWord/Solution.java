package leetTasks._011_lengthOfLastWord;

public class Solution {

    public static void main(String[] args) {

        String s = "   fly me   to   the moon  ";

        System.out.println(lengthOfLastWord(s));
    }


    public static int lengthOfLastWord(String s) {
        s = s.trim();
        int indexLastSpace = s.lastIndexOf(" ");
        return s.length() - indexLastSpace - 1;
    }
}
