package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void when3Elements() {
        int[] array = new int[] {-1, -2, 0};
        int[] expected = new int[] {-2, -1, 0};
        int[] actual = SortSelected.sort(array);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void when5Elements() {
        int[] array = new int[] {1, 2, -1, -2, 0};
        int[] expected = new int[] {-2, -1, 0, 1, 2};
        int[] actual = SortSelected.sort(array);
        Assert.assertArrayEquals(expected, actual);
    }
}