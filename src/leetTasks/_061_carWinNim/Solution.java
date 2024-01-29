package leetTasks._061_carWinNim;

public class Solution {

    public static void main(String[] args) {
        int p = 4;
        System.out.println(canWinNim(p));
    }

    public static boolean canWinNim(int n) {
        return n%4!=0;
    }
}
