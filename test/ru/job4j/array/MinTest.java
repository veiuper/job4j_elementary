package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MinTest {

    @Test
    public void whenFirstMin() {
        int expected = 0;
        int[] array = new int[]{0, 5, 10};
        int actual = Min.findMin(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenLastMin() {
        int expected = 3;
        int[] array = new int[]{10, 5, 3};
        int actual = Min.findMin(array);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenBetweenMin() {
        int expected = -2;
        int[] array = new int[]{10, -2, 5};
        int actual = Min.findMin(array);
        Assert.assertEquals(expected, actual);
    }
}