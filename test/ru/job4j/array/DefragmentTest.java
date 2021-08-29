package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class DefragmentTest {

    @Test
    public void whenSingleFirstNull() {
        String[] array = {null, "I"};
        String[] expected = {"I", null};
        String[] actual = Defragment.compress(array);
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void whenNotFirstNull() {
        String[] array = {"I", null, "wanna", null, "be", null, "compressed"};
        String[] expected = {"I", "wanna", "be", "compressed", null, null, null};
        String[] actual = Defragment.compress(array);
        Assert.assertArrayEquals(expected, actual);
    }
}