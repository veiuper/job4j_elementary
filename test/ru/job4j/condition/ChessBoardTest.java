package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class ChessBoardTest {

    @Test
    public void wayIs5() {
        int in1 = 6;
        int in2 = 7;
        int in3 = 1;
        int in4 = 2;
        int expected = 5;
        int actual = ChessBoard.way(in1, in2, in3, in4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wayIs7() {
        int in1 = 7;
        int in2 = 0;
        int in3 = 0;
        int in4 = 7;
        int expected = 7;
        int actual = ChessBoard.way(in1, in2, in3, in4);
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void wayIs0() {
        int in1 = 2;
        int in3 = 6;
        int in2 = 4;
        int in4 = 1;
        int result = ChessBoard.way(in1, in3, in2, in4);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1isMinus1ThenWayIs0() {
        int in1 = -1;
        int in3 = 6;
        int in2 = 4;
        int in4 = 1;
        int result = ChessBoard.way(in1, in3, in2, in4);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isMinus1ThenWayIs0() {
        int in1 = 2;
        int in3 = -1;
        int in2 = 4;
        int in4 = 1;
        int result = ChessBoard.way(in1, in3, in2, in4);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isMinus1ThenWayIs0() {
        int in1 = 2;
        int in3 = 6;
        int in2 = -1;
        int in4 = 1;
        int result = ChessBoard.way(in1, in3, in2, in4);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY2isMinus1ThenWayIs0() {
        int in1 = 2;
        int in3 = 6;
        int in2 = 4;
        int in4 = -1;
        int result = ChessBoard.way(in1, in3, in2, in4);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX1isGreater7ThenWayIs0() {
        int in1 = 10;
        int in3 = 6;
        int in2 = 4;
        int in4 = 1;
        int result = ChessBoard.way(in1, in3, in2, in4);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY1isGreater7ThenWayIs0() {
        int in1 = 2;
        int in3 = 10;
        int in2 = 4;
        int in4 = 1;
        int result = ChessBoard.way(in1, in3, in2, in4);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenX2isGreater7ThenWayIs0() {
        int in1 = 2;
        int in3 = 6;
        int in2 = 10;
        int in4 = 1;
        int result = ChessBoard.way(in1, in3, in2, in4);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenY2isGreater7ThenWayIs0() {
        int in1 = 2;
        int in3 = 6;
        int in2 = 4;
        int in4 = 10;
        int result = ChessBoard.way(in1, in3, in2, in4);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }
}