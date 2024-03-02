package LeetTasksMedium._002_lengthOfLongestSubstring;

import java.util.ArrayList;
import java.util.List;
/*
Given a string s, find the length of the longest substring  without repeating characters.
Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3
 */
public class Solution {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {
        if (s.length() == 1) { return 1;}
        int maxLength = 0;
        for (int i = 0; i < s.length(); i++) {
            maxLength = Math.max(maxLength,checkLengtn(s,i));
        }
        return maxLength;
    }

    public static int checkLengtn(String s, int i) {
        List<Character> resultList = new ArrayList<>();
        for (int j = i; j < s.length(); j++) {
            if (resultList.contains(s.charAt(j))) {
               return resultList.size();
            } else {
                resultList.add(s.charAt(j));
            }
        }
        return resultList.size();
    }
}
