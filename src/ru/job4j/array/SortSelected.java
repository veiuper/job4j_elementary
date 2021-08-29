package ru.job4j.array;

public class SortSelected {

    public static int[] sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = MinDiapason.findMin(array, i, array.length - 1);
            int index = FindLoop.indexOf(array, min, i, array.length - 1);
            if (index != i) {
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
        return array;
    }
}
