package leetTasks._067_reverseVowelsString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        String s = "hEllo";

        System.out.println(reverseVowels(s));
    }

    public static String reverseVowels(String s) {

        List<Character> vowelsList = new ArrayList<>();
        String sLowCase = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            if (sLowCase.charAt(i) == 'a' || sLowCase.charAt(i) == 'e' || sLowCase.charAt(i) == 'i'
                    || sLowCase.charAt(i) == 'o' || sLowCase.charAt(i) == 'u') {

                vowelsList.add(s.charAt(i));
            }
        }
        Collections.reverse(vowelsList);
        StringBuilder originalString = new StringBuilder(s);
        int j =0;
        for (int i = 0; i <originalString.length(); i++) {
            if (sLowCase.charAt(i) == 'a' || sLowCase.charAt(i) == 'e' || sLowCase.charAt(i) == 'i'
                    || sLowCase.charAt(i) == 'o' || sLowCase.charAt(i) == 'u') {
                originalString.setCharAt(i, vowelsList.get(j));
                j++;

            }
        }
    return originalString.toString();
    }
}



