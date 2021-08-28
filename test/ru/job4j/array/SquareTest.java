package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SquareTest {

    @Test
    public void when3Then014() {

        int in = 3;
        int[] expected = new int[] {0, 1, 4};
        int[] actual = Square.calculate(in);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void when5Then014916() {

        int in = 5;
        int[] expected = new int[] {0, 1, 4, 9, 16};
        int[] actual = Square.calculate(in);
        Assert.assertArrayEquals(expected, actual);
    }
}