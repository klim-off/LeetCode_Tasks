package LeetTasksMedium._016_isValidSudoku;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        char[][] board = {{'5' , '3' , '.' , '.' , '7' , '.' , '.' , '.' , '.'}
                , {'3' , '.' , '.' , '1' , '9' , '5' , '.' , '.' , '.'}
                , {'.' , '9' , '8' , '.' , '.' , '.' , '.' , '6' , '.'}
                , {'8' , '.' , '.' , '.' , '6' , '.' , '.' , '.' , '3'}
                , {'4' , '.' , '.' , '8' , '.' , '3' , '.' , '.' , '1'}
                , {'7' , '.' , '.' , '.' , '2' , '.' , '.' , '.' , '6'}
                , {'.' , '6' , '.' , '.' , '.' , '.' , '2' , '8' , '.'}
                , {'.' , '.' , '.' , '4' , '1' , '9' , '.' , '.' , '5'}
                , {'.' , '.' , '.' , '.' , '8' , '.' , '.' , '7' , '9'}};

        System.out.println(isValidSudoku(board));
    }

    public static boolean isValidSudoku(char[][] board) {
        int[][] boardInt = new int[9][9];

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                if (Character.isDigit(board[i][j])) {
                    boardInt[i][j] = Character.getNumericValue(board[i][j]);
                } else boardInt[i][j] = 0;
            }
        }
        // check row & column
        int[] columnInt = new int[9];
        int[] rowInt = new int[9];
        for (int i = 0; i < boardInt.length; i++) {
            for (int j = 0; j < boardInt[i].length; j++) {
                columnInt[j] = boardInt[j][i];
                rowInt[j] = boardInt[i][j];
            }
            if (!ChechRowSudoku(columnInt)) {
                return false;
            }
            if (!ChechRowSudoku(rowInt)) {
                return false;
            }
        }

        // check sub-boxes
        int indexColumn =0;
        List <Integer> checkList = new ArrayList<>();
        while (indexColumn<9) {
            int indexRow = 0;
            while (indexRow < 9) {
                System.out.println(indexRow);
                for (int i = indexRow; i < indexRow + 3; i++) {
                    for (int j = indexColumn; j < indexColumn + 3; j++) {
                        if (boardInt[i][j] !=0){
                            if (checkList.contains(boardInt[i][j])){
                                return false;
                            }else {
                                checkList.add(boardInt[i][j]);
                            }
                        }
                        //System.out.print(boardInt[i][j]);
                    }
                 //   System.out.println();
                }
                checkList.clear();
                indexRow += 3;
            }
            indexColumn+=3;
        }
        return true;
    }

    private static boolean ChechRowSudoku(int[] ints) {
        int[] checkArray = new int[10];
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] != 0) {
                if (ints[i] == checkArray[ints[i]]) {
                    return false;
                } else {
                    checkArray[ints[i]] = ints[i];
                }
            }
        }
        return true;
    }
}
