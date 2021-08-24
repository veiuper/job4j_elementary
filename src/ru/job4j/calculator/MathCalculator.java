package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiple(double first, double second) {
        return sum(first, second) + multiple(first, second);
    }

    public static double differenceAndDivision(double first, double second) {
        return difference(first, second) + division(first, second);
    }

    public static double sumOperations(double first, double second) {
        return sum(first, second) + multiple(first, second) + division(first, second) + difference(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiple(10, 20));
    }
}
