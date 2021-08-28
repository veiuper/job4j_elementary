package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndsWithTest {

    @Test
    public void whenEndsWithPostfixThenTrue() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'o'};
        boolean actual = EndsWith.endsWith(word, post);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenNotEndsWithPostfixThenFalse() {
        char[] word = new char[] {'H', 'e', 'l', 'l', 'o'};
        char[] post = new char[] {'l', 'a'};
        boolean actual = EndsWith.endsWith(word, post);
        Assert.assertFalse(actual);
    }
}