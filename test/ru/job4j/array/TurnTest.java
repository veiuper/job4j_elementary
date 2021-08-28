package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class TurnTest {

    @Test
    public void whenEvenElements() {
        int[] in = new int[] {0, 1, 2, 3, 4, 5};
        int[] expected = new int[] {5, 4, 3, 2, 1, 0};
        int[] actual = Turn.back(in);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenNotEvenElements() {
        int[] in = new int[] {0, 1, 2, 3, 4};
        int[] expected = new int[] {4, 3, 2, 1, 0};
        int[] actual = Turn.back(in);
        Assert.assertArrayEquals(expected, actual);
    }
}