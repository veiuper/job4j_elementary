package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class CheckTest {

    @Test
    public void whenDataMonoByTrueToTrue() {
        boolean[] in = new boolean[] {true, true, true};
        boolean actual = Check.mono(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenDataNotMonoByTrueToFalse() {
        boolean[] in = new boolean[] {true, false, true};
        boolean actual = Check.mono(in);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenDataMonoByFalseToTrue() {
        boolean[] in = new boolean[] {false, false, false};
        boolean actual = Check.mono(in);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenDataNotMonoByFalseToFalse() {
        boolean[] in = new boolean[] {false, true, false};
        boolean actual = Check.mono(in);
        Assert.assertFalse(actual);
    }
}