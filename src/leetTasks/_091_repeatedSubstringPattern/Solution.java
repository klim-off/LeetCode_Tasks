package leetTasks._091_repeatedSubstringPattern;

public class Solution {

    public static void main(String[] args) {
        String  s = "bb";
        System.out.println((repeatedSubstringPattern(s)));
    }

    public static boolean repeatedSubstringPattern(String s) {
        StringBuilder builderS = new StringBuilder(s.substring(0,s.length()/2));
        while (builderS.length()>0){
            if (s.length() % builderS.length() == 0) {
                if (s.replaceAll(builderS.toString(), "").length() == 0)
                {return true;}
            }
            builderS.deleteCharAt(builderS.length()-1);
        }
     return false;
    }


}
