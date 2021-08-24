package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void when00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when53To23Then2() {
        int x1 = 5;
        int y1 = 3;
        int x2 = 2;
        int y2 = 3;
        double expected = 3;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void when71To90Then2() {
        int x1 = 7;
        int y1 = 1;
        int x2 = 9;
        int y2 = 0;
        double expected = 2.23;
        double actual = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, actual, 0.01);
    }
}