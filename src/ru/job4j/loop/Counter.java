package ru.job4j.loop;

public class Counter {

    public static int sum(int start, int finish) {

        int sum = 0;

        for (int i = start; i <= finish; i++) {
            sum = sum + i;
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Counter.sum(1, 1));
        System.out.println(Counter.sum(0, 3));
        System.out.println(Counter.sum(5, 10));
    }
}
