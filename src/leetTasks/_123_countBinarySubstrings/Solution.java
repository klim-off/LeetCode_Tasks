package leetTasks._123_countBinarySubstrings;

import java.util.ArrayList;
import java.util.List;
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
        String s = "00110011";
        System.out.println(countBinarySubstrings(s));
    }

    public static int countBinarySubstrings(String s) {

        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < s.length() - 1; i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String temp = s.substring(i, j + 1);
                if (temp.replaceAll("0", "").length() == temp.replaceAll("1", "").length()){
                    if (temp.charAt(0) == '0' && temp.indexOf("1") > temp.lastIndexOf("0"))
                        resultList.add(temp);
                    if (temp.charAt(0) == '1' && temp.indexOf("0") > temp.lastIndexOf("1"))
                        resultList.add(temp);
                }
            }

        }

        return resultList.size();
    }
}
