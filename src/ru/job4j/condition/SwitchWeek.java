package ru.job4j.condition;

public class SwitchWeek {

    public static String nameOfDay(int day) {

        String rsl;

        switch (day) {
            case 1:
                rsl = "Понедельник";
                break;
            case 2:
                rsl = "Вторник";
                break;
            case 3:
                rsl = "Среда";
                break;
            case 4:
                rsl = "Четверг";
                break;
            case 5:
                rsl = "Пятница";
                break;
            case 6:
                rsl = "Суббота";
                break;
            case 7:
                rsl = "Воскресенье";
                break;
            default:
                rsl = "Ошибка";
                break;
        }

        return rsl;
    }

    public static void main(String[] args) {

        System.out.println(SwitchWeek.nameOfDay(1));
        System.out.println(SwitchWeek.nameOfDay(-0));
        System.out.println(SwitchWeek.nameOfDay(7));
    }
}
