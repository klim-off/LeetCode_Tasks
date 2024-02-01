package leetTasks._066_reverseStringArray;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o','i'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {
        char temp;
        for (int i = 0; i < s.length/2; i++) {
            temp = s[s.length-i-1];
            s[s.length-i-1] = s[i];
            s[i] = temp;
        }

    }

}
