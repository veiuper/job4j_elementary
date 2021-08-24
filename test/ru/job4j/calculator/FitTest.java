package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenHeight180Then92() {
        short in = 180;
        double expected = 92;
        double delta = 0.01;
        double actual = Fit.manWeight(in);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void whenHeight173Then8394() {
        short in = 173;
        double expected = 83.94;
        double delta = 0.01;
        double actual = Fit.manWeight(in);
        Assert.assertEquals(expected, actual, delta);
    }
}