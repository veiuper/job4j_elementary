package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SwitchArrayTest {

    @Test
    public void whenSwap0To3EvenElements() {
        int[] in1 = new int[] {1, 2, 3, 4};
        int in2 = 0;
        int in3 = in1.length - 1;
        int[] expected = new int[] {4, 2, 3, 1};
        int[] actual = SwitchArray.swap(in1, in2, in3);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenSwap1To2EvenElements() {
        int[] in1 = new int[] {1, 2, 3, 4};
        int in2 = 1;
        int in3 = in1.length - 2;
        int[] expected = new int[] {1, 3, 2, 4};
        int[] actual = SwitchArray.swap(in1, in2, in3);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenSwap0To4NotEvenElements() {
        int[] in1 = new int[] {1, 2, 3, 4, 5};
        int in2 = 0;
        int in3 = in1.length - 1;
        int[] expected = new int[] {5, 2, 3, 4, 1};
        int[] actual = SwitchArray.swap(in1, in2, in3);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenSwap1To3NotEvenElements() {
        int[] in1 = new int[] {1, 2, 3, 4, 5};
        int in2 = 1;
        int in3 = in1.length - 2;
        int[] expected = new int[] {1, 4, 3, 2, 5};
        int[] actual = SwitchArray.swap(in1, in2, in3);
        Assert.assertArrayEquals(expected, actual);
    }
}