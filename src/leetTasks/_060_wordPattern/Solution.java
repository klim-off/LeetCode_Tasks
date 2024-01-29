package leetTasks._060_wordPattern;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog dog dog dog";

        System.out.println(wordPattern(pattern,s));
    }

    public static boolean wordPattern(String pattern, String s) {

        String[] arrayS = s.split(" ");
        char[] arrayPattern = pattern.toCharArray();
        if (arrayS.length != arrayPattern.length) {return false;}

        Map<Character,String> mapPattern = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {


            if (!mapPattern.containsKey(arrayPattern[i])){

                if (mapPattern.values().toString().indexOf(arrayS[i]) >= 0 ){
                    return false;
                }

                mapPattern.put(arrayPattern[i],arrayS[i]);
            }else{
                if (!mapPattern.get(arrayPattern[i]).equals(arrayS[i])){
                    return false;
                }
            }
        }
    return true;
    }

 /*   private static boolean valueMapExist(Map<Character, String> mapPattern) {
        for (Map.Entry<Character, String> entry : mapPattern.entrySet()) {

        }
    }*/
}
