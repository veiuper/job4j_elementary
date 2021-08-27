package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class PrimeNumberTest {

    @Test
    public void when5() {
        int in = 5;
        int expected = 3;
        int actual = PrimeNumber.calc(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when11() {
        int in = 11;
        int expected = 5;
        int actual = PrimeNumber.calc(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when2() {
        int in = 2;
        int expected = 1;
        int actual = PrimeNumber.calc(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenMinus1() {
        int in = -1;
        int expected = 0;
        int actual = PrimeNumber.calc(in);
        Assert.assertEquals(expected, actual);
    }
}