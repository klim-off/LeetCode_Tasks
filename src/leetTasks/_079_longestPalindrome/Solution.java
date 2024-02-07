package leetTasks._079_longestPalindrome;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        Map<Character, Integer> charMap = new HashMap<>();
        int charCount = 0;

        for (char c : s.toCharArray()){
            charMap.put(c, charMap.getOrDefault(c, 0)+1);
        }

     /*   for (int i = 0; i < s.length(); i++) {
            if (!charMap.containsKey(s.charAt(i))) {
                for (int j = i; j < s.length(); j++) {
                  if (s.charAt(i) == s.charAt(j)){
                      charCount ++;
                  }
                }
                charMap.put(s.charAt(i),charCount);
                charCount = 0;
            }
        }*/

        boolean solo = false;
        for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                if (entry.getValue()%2 > 0) {solo = true;}
                charCount += entry.getValue()/2;
            } else {solo = true;}
        }
        return solo?(charCount*2 +1):(charCount*2);
    }

}
