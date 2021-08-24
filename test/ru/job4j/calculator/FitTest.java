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
    public void whenHeight173Then7244() {
        short in = 173;
        double expected = 72.44;
        double delta = 0.01;
        double actual = Fit.womanWeight(in);
        Assert.assertEquals(expected, actual, delta);
    }
}