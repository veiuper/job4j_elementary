package ru.job4j.array;

import java.util.Arrays;

public class Machine {

    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1};
        int[] array = new int[100];
        int size = 0;
        int balance = money - price;
        for (int i = 0; i < coins.length; i++) {
            while (balance - coins[i] >= 0) {
                balance -= coins[i];
                size++;
                array[size - 1] = coins[i];
            }
            if (balance <= 0) {
                break;
            }
        }
        return Arrays.copyOf(array, size);
    }
}
