package ru.job4j.condition;

public class LogicNot {

    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    public static boolean isPositive(int num) {
        return num > 0;
    }

    public static boolean notEven(int num) {
        return !LogicNot.isEven(num);
    }

    public static boolean notPositive(int num) {
        return !LogicNot.isPositive(num);
    }

    public static boolean notEvenAndPositive(int num) {
        return !LogicNot.isEven(num) && LogicNot.isPositive(num);
    }

    public static boolean evenOrNotPositive(int num) {
        return LogicNot.isEven(num) || !LogicNot.isPositive(num);
    }
}
