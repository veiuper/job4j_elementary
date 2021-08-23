package ru.job4j.condition;

public class SqArea {

    public static double sqarea(double p, double k) {
        double rsl = k * Math.pow((p / (2 * (k + 1))), 2);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.sqarea(4, 1);
        System.out.println("p = 4, k = 1, s = 1, real = " + result1);
        double result2 = SqArea.sqarea(6, 2);
        System.out.println("p = 6, k = 2, s = 2, real = " + result2);
    }
}
