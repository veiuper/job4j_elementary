package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {

    @Test
    public void when2To2() {
        int size = 2;
        int[][] expected = {
                {1, 2},
                {2, 4}
        };
        int[][] actual = Matrix.multiple(size);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void when5To5() {
        int size = 5;
        int[][] expected = {
                {1, 2, 3, 4, 5},
                {2, 4, 6, 8, 10},
                {3, 6, 9, 12, 15},
                {4, 8, 12, 16, 20},
                {5, 10, 15, 20, 25}
        };
        int[][] actual = Matrix.multiple(size);
        Assert.assertArrayEquals(expected, actual);
    }
}