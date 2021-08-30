package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] array = new int[100];
        int size = 0;
        int balance = money - price;
        for (int value : coins) {
            while (balance - value >= 0) {
                balance -= value;
                array[size++] = value;
            }
        }
        return Arrays.copyOf(array, size);
    }
}
