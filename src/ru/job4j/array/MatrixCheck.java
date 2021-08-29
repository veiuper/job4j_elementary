package ru.job4j.array;

public class MatrixCheck {

    public static boolean monoHorizontal(char[][] board, int row) {
        boolean rsl = true;
        char temp = board[row][0];
        for (int i = 1; i < board[row].length; i++) {
            if (board[row][i] != temp) {
                rsl = false;
                break;
            }
        }
        return rsl;
    }
}
