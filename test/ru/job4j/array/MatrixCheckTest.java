package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheckTest {

    @Test
    public void whenMonoHorizontal() {
        char[][] board = {
                {' ', ' ', ' '},
                {'X', 'X', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean actual = MatrixCheck.monoHorizontal(board, row);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenNotMonoHorizontal() {
        char[][] board = {
                {' ', 'x', ' '},
                {'X', 'x', 'X'},
                {' ', ' ', ' '}
        };
        int row = 1;
        boolean actual = MatrixCheck.monoHorizontal(board, row);
        Assert.assertFalse(actual);
    }

    @Test
    public void whenMonoVertical() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', 'x', 'X'},
                {' ', ' ', 'X'}
        };
        int column = 2;
        boolean actual = MatrixCheck.monoVertical(board, column);
        Assert.assertTrue(actual);
    }

    @Test
    public void whenNotMonoVertical() {
        char[][] board = {
                {' ', ' ', 'X'},
                {' ', 'x', 'X'},
                {' ', ' ', 'X'}
        };
        int column = 1;
        boolean actual = MatrixCheck.monoVertical(board, column);
        Assert.assertFalse(actual);
    }
}