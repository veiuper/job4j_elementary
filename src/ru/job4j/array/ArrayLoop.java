package ru.job4j.array;

public class ArrayLoop {

    public static void main(String[] args) {
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = 2 * i + 3;
        }
        for (int value : array) {
            System.out.println(value);
        }
    }
}
