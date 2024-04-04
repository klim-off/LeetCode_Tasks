package leetTasks._113_judgeCircle;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        String moves = "RRDD";
        System.out.println((judgeCircle(moves)));
    }

    public static boolean judgeCircle(String moves) {

        int vertical = 0;
        int horizont = 0;
        for (int i = 0; i < moves.length(); i++) {

            if (moves.charAt(i) == 'U') vertical++;
            else if (moves.charAt(i) == 'D') vertical--;
            else if (moves.charAt(i) == 'L') horizont--;
            else if (moves.charAt(i) == 'R') horizont++;

        }
        return (vertical == 0 && horizont ==0);
    }
}
