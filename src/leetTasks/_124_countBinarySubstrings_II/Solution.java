package leetTasks._124_countBinarySubstrings_II;

/*
Given a binary string s, return the number of non-empty substrings that have the same number of 0's and 1's,
and all the 0's and all the 1's in these substrings are grouped consecutively.
Substrings that occur multiple times are counted the number of times they occur.
Example 1:
Input: s = "00110011"
Output: 6
Explanation: There are 6 substrings that have equal number of consecutive 1's and 0's: "0011", "01", "1100", "10", "0011", and "01".
Notice that some of these substrings repeat and are counted the number of times they occur.
Also, "00110011" is not a valid substring because all the 0's (and 1's) are not grouped together.
 */

public class Solution {
    public static void main(String[] args) {
        String s = "100";
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

            //total += count < prevCount ? count : prevCount;
            total += Math.min(count, prevCount);

            prevCount = count;
        }
        return total;
    }
}
