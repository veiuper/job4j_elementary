package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class MortgageTest {

    @Test
    public void when1Year() {
        int in1 = 1000;
        int in2 = 1200;
        double in3 = 1;
        int expected = 1;
        int actual = Mortgage.year(in1, in2, in3);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void when2Year() {
        int in1 = 100;
        int in2 = 120;
        double in3 = 50;
        int expected = 2;
        int actual = Mortgage.year(in1, in2, in3);
        Assert.assertEquals(expected, actual);
    }
}