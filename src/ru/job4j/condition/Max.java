package ru.job4j.condition;

public class Max {

    public static int max(int left, int right) {
        boolean leftMax = left > right;
        int rsl = leftMax ? left : right;
        return rsl;
    }
}
