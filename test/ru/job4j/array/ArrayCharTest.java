package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class ArrayCharTest {

    @Test
    public void whenStartsWithPrefixThenTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'e'};
        boolean actual = ArrayChar.startsWith(word, pref);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenNotStartsWithPrefixThenFalse() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[] {'H', 'i'};
        boolean actual = ArrayChar.startsWith(word, pref);
        Assert.assertFalse(actual);
    }
}