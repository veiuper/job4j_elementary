package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void whenP6K2Then2() {
        int p = 6;
        double k = 2;
        int expected = 2;
        double actual = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP5K1Then156() {
        int p = 5;
        double k = 1;
        double expected = 1.56;
        double actual = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void whenP8K2Then355() {
        int p = 8;
        double k = 2;
        double expected = 3.55;
        double actual = SqArea.sqarea(p, k);
        Assert.assertEquals(expected, actual, 0.01);
    }
}