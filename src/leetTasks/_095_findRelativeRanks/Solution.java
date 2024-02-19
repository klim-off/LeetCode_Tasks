package leetTasks._095_findRelativeRanks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;

public class Solution {

    public static void main(String[] args) {
        int[] score = {10, 3, 8, 9, 4};
        System.out.println(Arrays.toString(findRelativeRanks(score)));
    }

    public static String[] findRelativeRanks(int[] score) {
        String[] result = new String[score.length];
        List<Integer> scoreSortedList = new ArrayList<>(Arrays.stream(score).sorted().boxed().toList());
        Collections.reverse(scoreSortedList);
        List<Integer> scoreList = new ArrayList<>(Arrays.stream(score).boxed().toList());
        int index;
        for (int i = 0; i < scoreSortedList.size(); i++) {
            index = scoreList.indexOf(scoreSortedList.get(i));
            result[index] = switch (i) {
                case 0 -> "Gold Medal";
                case 1 -> "Silver Medal";
                case 2 -> "Bronze Medal";
                default -> String.valueOf(i+1);
            };
        }
        return result;
    }
}
