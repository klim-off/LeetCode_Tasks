package leetTasks._016_deleteDuplicates;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Solution {

    public static void main(String[] args) {
        int [] x = {1,1,2,3,3};
        System.out.println(Arrays.toString(deleteDuplicates(x)) );
    }
    public static int [] deleteDuplicates(int [] head) {
     Set<Integer> numericSet = new HashSet<>();
        for (int i = 0; i < head.length; i++) {
            numericSet.add(head[i]);
        }
        int [] resultArray = new int[numericSet.size()];
        int i = 0;
        for (Integer integer : numericSet) {
            resultArray[i++] = integer;
        }
        return resultArray;
    }
}
