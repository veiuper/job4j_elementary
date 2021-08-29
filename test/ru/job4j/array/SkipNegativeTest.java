package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SkipNegativeTest {

    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {
                {1, -2},
                {1, 2},
        };
        int[][] expected = {
                {1, 0},
                {1, 2}
        };
        int[][] actual = SkipNegative.skip(array);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenArrayRowAndColumnNotEquals() {
        int[][] array = {
                {1, -2},
                {1, 2, -3},
                {1, -2, 3, -4},
                {1, 2, -3, -4, 5}
        };
        int[][] expected = {
                {1, 0},
                {1, 2, 0},
                {1, 0, 3, 0},
                {1, 2, 0, 0, 5}
        };
        int[][] actual = SkipNegative.skip(array);
        Assert.assertArrayEquals(expected, actual);
    }
}