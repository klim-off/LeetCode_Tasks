package leetTasks._028_maxProfit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }
    public static int maxProfit(int[] prices) {
        List <Integer> profitList = new ArrayList<>();
        profitList.add(0);
        for (int i = 0; i < prices.length; i++) {

            for (int j = i+1; j < prices.length; j++) {
                if (prices[j] > prices[i]) {
                    profitList.add(prices[j] - prices[i]);
                }
            }
        }
     return Collections.max(profitList);
    }

    /*
     int lsf = Integer.MAX_VALUE;
        int op = 0;
        int pist = 0;

        for(int i = 0; i < prices.length; i++){
            if(prices[i] < lsf){
                lsf = prices[i];
            }
            pist = prices[i] - lsf;
            if(op < pist){
                op = pist;
            }
        }
        return op;
     */
}
