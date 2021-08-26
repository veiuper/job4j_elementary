package ru.job4j.condition;

public class ChessBoard {

    public static int way(int x1, int y1, int x2, int y2) {
        int delta = Math.abs(x1 - x2);
        boolean valid = x1 >= 0 && x1 <= 7
                && y1 >= 0 && y1 <= 7
                && x2 >= 0 && x2 <= 7
                && y2 >= 0 && y2 <= 7
                && delta == Math.abs(y1 - y2);

        return valid ? delta : 0;
    }
}
