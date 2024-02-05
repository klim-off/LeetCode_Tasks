package leetTasks._074_findTheDifference;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.println(findTheDifference(s,t));

    }

    public static char findTheDifference(String s, String t) {

        char c = (char) 0;
        for(int i=0;i<s.length();i++) {
            c ^= s.charAt(i);
            System.out.println(c);
        }

        for(int i=0;i<t.length();i++) {
            c ^= t.charAt(i);
            System.out.println(c);
        }
        return c;

       /* StringBuilder builderT = new StringBuilder(t);
         for (int i = 0; i < s.length(); i++) {
         if( builderT.indexOf(String.valueOf(s.charAt(i))) == -1){
             return t.charAt(i);
         }else{
             builderT.deleteCharAt(builderT.indexOf(String.valueOf(s.charAt(i))));

         }
        }
        return builderT.charAt(0);*/
    }
}
