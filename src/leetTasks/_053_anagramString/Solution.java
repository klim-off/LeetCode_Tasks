package leetTasks._053_anagramString;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        System.out.println(isAnagram(s,t));
    }

    public static boolean isAnagram(String s, String t) {
        char[] arrayS =  s.toCharArray();
        Arrays.sort(arrayS);
        char[] arrayT =  t.toCharArray();
        Arrays.sort(arrayT);
        return Arrays.equals(arrayT, arrayS);
    }
}
