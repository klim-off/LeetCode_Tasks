package leetTasks._126_comparSecNum;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(43);
        numList.add(31);
        numList.add(72);
        numList.add(29);

        System.out.println(compareBySecondNumeric(numList));
    }

    public static List<Integer> compareBySecondNumeric(List<Integer> numList) {
        Comparator<Integer> comSecDigital = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if (o1% 10 > o2%10) return 1;
                else return -1;
            }
        };
        Collections.sort(numList, comSecDigital);
        return numList;
        }
}

