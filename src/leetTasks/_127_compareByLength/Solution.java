package leetTasks._127_compareByLength;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {


        List<String> listStrings = new ArrayList<>();
        listStrings.add("ty123");
        listStrings.add("ty1234");
        listStrings.add("ty12");
        listStrings.add("ty1");

        System.out.println(compareByLength(listStrings));
    }

    private static List<String> compareByLength(List<String> listStrings) {
        Comparator<String>  compareByLength = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()> o2.length())
                return 1;
                else return -1;
            }
        };
        Collections.sort(listStrings,compareByLength);
        return listStrings;
    }

}
