package ru.job4j.converter;

import org.junit.Test;
import org.junit.Assert;

public class ConverterTest {

    @Test
    public void when140RblThen2Euro() {
        float in = 140;
        float expected = 2;
        float delta = 0.0001f;
        float actual = Converter.rubleToEuro(in);
        Assert.assertEquals(expected, actual, delta);
    }

    @Test
    public void when180RblThen3Dollar() {
        float in = 180;
        float expected = 3;
        float delta = 0.0001f;
        float actual = Converter.rubleToDollar(in);
        Assert.assertEquals(expected, actual, delta);
    }
}