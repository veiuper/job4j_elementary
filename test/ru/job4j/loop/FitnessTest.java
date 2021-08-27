package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FitnessTest {

    @Test
    public void whenIvanGreatNik() {
        int in1 = 95;
        int in2 = 90;
        int expected = 0;
        int actual = Fitness.calc(in1, in2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenIvanLessByOneNik() {
        int in1 = 90;
        int in2 = 95;
        int expected = 1;
        int actual = Fitness.calc(in1, in2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenIvanLessByFewNik() {
        int in1 = 50;
        int in2 = 90;
        int expected = 2;
        int actual = Fitness.calc(in1, in2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenIvanEqualsNik() {
        int in1 = 90;
        int in2 = 90;
        int expected = 1;
        int actual = Fitness.calc(in1, in2);
        Assert.assertEquals(expected, actual);
    }
}