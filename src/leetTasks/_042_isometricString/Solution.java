package leetTasks._042_isometricString;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.LongStream;

public class Solution {

    public static void main(String[] args) {

        String haystack = "eff";
        String needle = "att";
        System.out.println(isIsomorphic(haystack, needle));
    }

    public static boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {return false;}
        List <Character> listS = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        List <Character> listT = t.chars().mapToObj(c -> (char) c).collect(Collectors.toList());

        Map<String, Long> mapS = listS.stream()
                .collect(Collectors.groupingBy(a -> String.valueOf(a),Collectors.counting()));

        Map<Object, Long> mapT = listT.stream()
                .collect(Collectors.groupingBy(k -> String.valueOf(k),Collectors.counting()));

        if (mapS.size() != mapT.size()) return false;

        Long [] arrayS = new Long[mapS.size()];
        Long [] arrayT = new Long[mapT.size()];

        int i = 0;
        for (Map.Entry<String, Long> stringLongEntry : mapS.entrySet()) {
            arrayS[i] = stringLongEntry.getValue();
             i++;
        }

        i=0;
        for (Map.Entry<Object, Long> objectLongEntry : mapT.entrySet()) {
            arrayT[i] = objectLongEntry.getValue();
            i++;
        }

        Arrays.sort(arrayT);
        Arrays.sort(arrayS);

        return Arrays.equals(arrayT,arrayS);
    }
}
