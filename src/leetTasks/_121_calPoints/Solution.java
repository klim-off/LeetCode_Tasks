package leetTasks._121_calPoints;

import java.util.ArrayList;
import java.util.List;
/*
You are keeping the scores for a baseball game with strange rules. At the beginning of the game, you start with an empty record.
You are given a list of strings operations, where operations[i] is the ith operation you must apply to the record and is one of the following:
An integer x.
Record a new score of x.
'+'.
Record a new score that is the sum of the previous two scores.
'D'.
Record a new score that is the double of the previous score.
'C'.
Invalidate the previous score, removing it from the record.
Return the sum of all the scores on the record after applying all the operations.

The test cases are generated such that the answer and all intermediate calculations fit in a 32-bit integer and that all operations are valid.
Example 2:

Input: ops = ["5","-2","4","C","D","9","+","+"]
Output: 27
Explanation:
"5" - Add 5 to the record, record is now [5].
"-2" - Add -2 to the record, record is now [5, -2].
"4" - Add 4 to the record, record is now [5, -2, 4].
"C" - Invalidate and remove the previous score, record is now [5, -2].
"D" - Add 2 * -2 = -4 to the record, record is now [5, -2, -4].
"9" - Add 9 to the record, record is now [5, -2, -4, 9].
"+" - Add -4 + 9 = 5 to the record, record is now [5, -2, -4, 9, 5].
"+" - Add 9 + 5 = 14 to the record, record is now [5, -2, -4, 9, 5, 14].
The total sum is 5 + -2 + -4 + 9 + 5 + 14 = 27.
 */
public class Solution {
    public static void main(String[] args) {
        String[] operation = {"5","-2","4","C","D","9","+","+"};
        System.out.println(calPoints(operation));
    }

    public static int calPoints(String[] operations) {
        List<Integer> resultSet = new ArrayList<>();
        int operationsLength = operations.length;
        int resultSetLength;
        for (int i = 0; i < operationsLength; i++) {
            Character charTemp = operations[i].charAt(0);
            if (charTemp == '+') {
                resultSetLength = resultSet.size();
                if (resultSetLength > 1) {
                    resultSet.add( resultSet.get(resultSetLength - 1) + resultSet.get(resultSetLength - 2));
                } else if (resultSetLength == 1) {
                    resultSet.add(resultSet.get(0));
                } else if (resultSetLength == 0) {
                    resultSet.add(0);
                }
            } else if (charTemp == 'C') {
                resultSetLength = resultSet.size();
                if (resultSetLength > 0) {
                    resultSet.remove(resultSetLength - 1);
                }
            } else if (charTemp == 'D') {
                resultSetLength = resultSet.size();
                if (resultSetLength > 0) {
                    resultSet.add( resultSet.get(resultSetLength - 1)*2);
                }
            } else  resultSet.add(Integer.parseInt(operations[i]));

        }

        return resultSet.isEmpty()?0:resultSet.stream().reduce(0,(a,b)->a+b);
    }
}
