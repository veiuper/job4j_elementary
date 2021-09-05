package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {

    @Test
    public void whenExist() {
        double in1 = 1.5;
        double in2 = 2.0;
        double in3 = 3.0;
        boolean actual = Triangle.exist(in1, in2, in3);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenNotExist() {
        double in1 = 1.0;
        double in2 = 2.0;
        double in3 = 3.0;
        boolean actual = Triangle.exist(in1, in2, in3);
        Assert.assertFalse(actual);
    }
}