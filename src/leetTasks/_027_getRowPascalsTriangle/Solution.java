package leetTasks._027_getRowPascalsTriangle;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int rowIndex = 3;
        System.out.println(getRow(rowIndex));

    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> rowList = new ArrayList<>();
        List<Integer> currentRowList = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            if (i == 0) {
                rowList.add(1);
                continue;
            } else if (i > 0) {
                rowList.add(0, 0);
                rowList.add(0);
                currentRowList.clear();
                for (int j = 0; j < rowList.size() - 1; j++) {
                    currentRowList.add(rowList.get(j) + rowList.get(j + 1));
                }
                rowList.clear();
                List<Integer> tempRowList = new ArrayList<>();
                for (int j = 0; j < currentRowList.size(); j++) {
                    rowList.add(currentRowList.get(j));
                    tempRowList.add(currentRowList.get(j));
                }
            }
        }
        return rowList;
    }
}
