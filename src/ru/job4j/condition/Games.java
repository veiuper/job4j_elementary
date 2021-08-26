package ru.job4j.condition;

public class Games {

    public static void permission(boolean allowByPatent, boolean hasMoney) {
        if (allowByPatent && hasMoney) {
            System.out.println("I can go to the cinema.");
        } else {
            System.out.println("I can't.");
        }
    }

    public static void main(String[] args) {
        Games.permission(false, false);
        Games.permission(false, true);
        Games.permission(true, false);
        Games.permission(true, true);
    }
}
