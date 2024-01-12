package leetTasks._026_generatePascalsTriangle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
         int numsRows = 5;
        List<List<Integer>> result = generate(numsRows);
        System.out.println(result);

    }

    public static List<List<Integer>> generate(int numRows) {
        List <Integer> rowList = new ArrayList<>();
        rowList.add(1);
        List<List<Integer>> result = new ArrayList<>();
        result.add(rowList);
        List <Integer> currentRowList = new ArrayList<>();

        for (int i = 2; i <=numRows ; i++) {
            rowList.add(0,0);
            rowList.add(0);
            currentRowList.clear();
            for (int j = 0; j < rowList.size()-1; j++) {
               currentRowList.add(rowList.get(j) + rowList.get(j+1));
            }
           rowList.clear();
            List <Integer> tempRowList = new ArrayList<>();
            for (int j = 0; j < currentRowList.size(); j++) {
                rowList.add(currentRowList.get(j));
                tempRowList.add(currentRowList.get(j));
            }
          result.add(tempRowList);
        }
     rowList.clear();
     rowList.add(1);
     return result;
    }
}
