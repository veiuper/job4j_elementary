package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70;
    }

    public static float rubleToDollar(float value) {
        return value / 60;
    }

    public static void main(String[] args) {
        float in1 = 140;
        float expected1 = 2;
        float out1 = Converter.rubleToEuro(in1);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are " + out1 + " euro. Test result: " + passed1 + ".");
        float in2 = 140;
        float expected2 = 2.3333333f;
        float out2 = Converter.rubleToDollar(in2);
        boolean passed2 = Math.round(expected2) == Math.round(out2);
        System.out.println("140 rubles are " + out2 + " dollar. Test result: " + passed2 + ".");
    }
}
