package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {

    @Test
    public void when1To10Then55() {
        int in1 = 1;
        int in2 = 10;
        int expected = 55;
        int actual = Counter.sum(in1, in2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when1To10Then30() {
        int in1 = 1;
        int in2 = 10;
        int expected = 30;
        int actual = Counter.sumByEven(in1, in2);
        Assert.assertEquals(expected, actual);
    }
}