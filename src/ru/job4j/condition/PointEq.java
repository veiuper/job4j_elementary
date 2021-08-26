package ru.job4j.condition;

public class PointEq {

    public static boolean eq(int x1, int y1, int x2, int y2) {
        return x1 == x2 && y1 == y2;
    }

    public static void main(String[] args) {
        System.out.println(PointEq.eq(5, 2, 3, -2));
        System.out.println(PointEq.eq(5, -2, 5, -2));
    }
}
