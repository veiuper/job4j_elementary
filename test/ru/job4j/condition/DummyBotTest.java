package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class DummyBotTest {

    @Test
    public void whenGreedBot() {
        String in = "Привет, Бот.";
        String expected = "Привет, умник.";
        String actual = DummyBot.answer(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenByBot() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String actual = DummyBot.answer(in);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenUnknownBot() {
        String in = "";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String actual = DummyBot.answer(in);
        Assert.assertEquals(expected, actual);
    }
}