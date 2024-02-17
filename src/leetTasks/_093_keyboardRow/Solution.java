package leetTasks._093_keyboardRow;

import javax.sql.rowset.RowSetWarning;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        String[] words = {"Hello", "omk", "Dad"};
        System.out.println(Arrays.toString(findWords(words)));
    }
    public static String[] findWords(String[] words) {
        StringBuilder row1 = new StringBuilder("qwertyuiop");
        StringBuilder row2 = new StringBuilder("asdfghjkl");
        StringBuilder row3 = new StringBuilder("zxcvbnm");
        List<String> resultList = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            if (row1.indexOf(String.valueOf(words[i].charAt(0)).toLowerCase()) >= 0) {
                if (findInRow(words[i],row1)){
                    resultList.add(words[i]);
                }
            } else if (row2.indexOf(String.valueOf(words[i].charAt(0)).toLowerCase()) >= 0) {
                if (findInRow(words[i],row2)){
                    resultList.add(words[i]);
                }
            } else if (row3.indexOf(String.valueOf(words[i].charAt(0)).toLowerCase()) >= 0) {
                if (findInRow(words[i],row3)){
                    resultList.add(words[i]);
                }
            }
        }
        return resultList.toArray(String[]::new);
    }
    private static boolean findInRow(String word, StringBuilder currentRow) {
        for (int i = 1; i < word.length(); i++) {
            if (currentRow.indexOf(String.valueOf(word.charAt(i)).toLowerCase()) < 0) {
                return false;
            }
        }
        return true;
    }
}
