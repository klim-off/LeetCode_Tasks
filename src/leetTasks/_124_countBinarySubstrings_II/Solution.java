package leetTasks._124_countBinarySubstrings_II;

public class Solution {
    public static void main(String[] args) {
        String s = "00110011";
        System.out.println(countBinarySubstrings(s));
    }

    public static int countBinarySubstrings(String s) {
        final int len = s.length();
        int total = 0;
        int prevCount = 0;
        for (int i = 0; i < len; ) {
            final char ch = s.charAt(i); // the first character in this sequence
            int count = 0;
            while (i < len && s.charAt(i) == ch) {
                i++;
                count++;
            }

            total += count < prevCount ? count : prevCount;

            prevCount = count;
        }
        return total;
    }
}
