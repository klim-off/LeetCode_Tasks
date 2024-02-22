package leetTasks._098_longestUncommon;

import java.util.Arrays;

public class Solution {

    public static void main(String[] args) {
        String a = "aa";
        String b = "aab";
        System.out.println(findLUSlength(a, b));
    }

    public static int findLUSlength(String a, String b) {
        if ( a.length() == b.length() )
            return   b.replace(a,"").length() ==0?(-1):b.replaceAll(a,"").length();
        else    return Math.max( a.length() , b.length());
    }
}
