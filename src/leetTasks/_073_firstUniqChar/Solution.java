package leetTasks._073_firstUniqChar;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String s = "araax";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {

        for (int i = 0; i < s.length(); i++) {

            if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
       /* int countSymbols;
        char findChar;
        for (int i = 0; i < s.length(); i++) {
            findChar = s.charAt(i);
            countSymbols = s.length() - s.replaceAll(String.valueOf(findChar), "").length();
            if (countSymbols == 1) {
                return i;
            }
        }
        return -1;*/
    }

}
