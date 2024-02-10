package leetTasks._084_arrangeCoins;

public class Solution {
    public static void main(String[] args) {
        int n = 2147483647;
        System.out.println((arrangeCoins(n)));
    }

    public static int arrangeCoins(int n) {
       /* int i =1;
        while(n>=i){
            n-=i;
            i++;  }
        return i-1;*/

        long coins = 0;
        for (int i = 0; i < n; i++) {
           coins += i;
           if (coins + i + 1 > n) {
               return i;   }
        }
       return 0;
    }
}
