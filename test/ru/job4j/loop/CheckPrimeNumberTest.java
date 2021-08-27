package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CheckPrimeNumberTest {

    @Test
    public void when5() {
        int in = 5;
        boolean actual = CheckPrimeNumber.check(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void when4() {
        int in = 4;
        boolean actual = CheckPrimeNumber.check(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void when1() {
        int in = 1;
        boolean actual = CheckPrimeNumber.check(in);
        Assert.assertFalse(actual);
    }
}