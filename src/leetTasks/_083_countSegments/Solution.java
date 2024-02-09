package leetTasks._083_countSegments;

public class Solution {
    public static void main(String[] args) {
        String num1 = ", , , ,        a, eaefa";

        System.out.println((countSegments(num1)));
    }

    public static int countSegments(String s) {
        //best
        //return Arrays.stream(s.split(" ")).filter(w -> !w.isEmpty()).toArray().length;
        if (s.length() == 0 ) return 0;
        String [] arraySplit = s.split(" ");
        int result =0;
        for (int i = 0; i < arraySplit.length; i++) {
            if (arraySplit[i].length() > 0) {
                result ++;
            }
        }
        return result;
    }
}
