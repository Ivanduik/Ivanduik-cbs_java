//Завдання 6

import java.util.Scanner;

//Дано три цілих числа. Знайдіть максимальне, мінімальне та середнє.
public class MaxMinAverage {
    public static void main(String[] arg) {
        int a = 1, b = 1, c = 1, max, min;
        double avrg;
        boolean flag = true;
        Scanner inp = new Scanner(System.in);
        System.out.println("Input integer value a b c.");
        if (inp.hasNextInt()) {
            a = inp.nextInt();
            if (inp.hasNextInt()) {
                b = inp.nextInt();
                if (inp.hasNextInt()) {
                    c = inp.nextInt();
                } else flag = false; //используем флаг, чтобы не выводить каждый раз строчку об ошибке.
            } else flag = false;
        } else flag = false;

        if (flag) {
            avrg = (a + b + c) / 3.0;
            max = Math.max(Math.max(a, b), Math.max(b, c));// Находим макс(мин) с 2х пар чисел (a b) (b c), получим 2 значения,
            // и из этих значений находим макс(мин), это и будет результат
            min = Math.min(Math.min(a, b), Math.min(b, c));
            System.out.println("Result max-" + max + " min-" + min + " average-" + avrg);
        } else System.out.println("You input not integer value");

    }

}
