package leetTasks._012_plusOne;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static void main(String[] args) {
        int[] digits = {9};
       System.out.println(Arrays.toString( plusOne(digits) ));
    }

    public static int[] plusOne(int[] digits) {
        List <Integer> integerList = new ArrayList<>();
        boolean plus = true;
        for (int i = digits.length-1; i >= 0 ; i--) {
            if (plus) {
                if (digits[i]<9){
                      integerList.add(digits[i]+1);
                      plus = false;
                }else {
                    integerList.add(0);
                    plus = true;
                }

            }else {integerList.add(digits[i]);}
        }

        if (plus) {
            integerList.add(1);
        }
        Collections.reverse(integerList);
        int[] integerArray = new int[integerList.size()];

        for (int i = 0; i < integerList.size(); i++) {
            integerArray[i] = integerList.get(i);
        }

        return  integerArray;
    }
}
