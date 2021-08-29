package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHasMinus3Then4() {
        int[] in1 = new int[] {0, 2, 4, -3, 1, -3};
        int in2 = -3;
        int expected = 3;
        int actual = FindLoop.indexOf(in1, in2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenArrayHasMinus5ThenMinus1() {
        int[] in1 = new int[] {0, 2, 4, -3, 1, -3};
        int in2 = -5;
        int expected = -1;
        int actual = FindLoop.indexOf(in1, in2);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenFindBetween() {
        int[] data = new int[] {0, 1, -1, 2};
        int el = -1;
        int start = 1;
        int finish = 2;
        int expected = 2;
        int actual = FindLoop.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenNotFindBetween() {
        int[] data = new int[] {0, 1, -1, 2};
        int el = -1;
        int start = 0;
        int finish = 1;
        int expected = -1;
        int actual = FindLoop.indexOf(data, el, start, finish);
        Assert.assertEquals(expected, actual);
    }
}