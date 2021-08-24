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
}