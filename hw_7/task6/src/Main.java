//Завдання 6
////Опишіть метод PowerA234(A, B, C, D), який обчислює другий,
// третій і четвертий ступінь числа A і повертає ці ступені відповідно до змінних B, C і D
// (A – вхідний, B, C, D – вихідні параметри;
// усі параметри є дійсними). За допомогою цієї процедури знайдіть другий,
// третій і четвертий ступені п'яти зазначених чисел.

import java.util.Scanner;

public class Main {
    static double b, c, d;

    static double inpDouble() {// дробный знак - ",", наверное зависит, что установлено в винде
        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextDouble()) {
            System.out.printf("Ви ввели некоректне значення!!!%nCпробуйте ще раз");
            inp.next();
        }
        return inp.nextDouble();
    }

    static String powerA234(double a) {
        String res = "";
        b = Math.pow(a, 2); // чтобы максимально приблизить к поставленной задачи решил сделать 2 варианта
        c = Math.pow(a, 3); // как вариант использовать глобальные переменные, хотя это плохая практика.
        d = Math.pow(a, 4);
        res = "Число " + a +
                "\n - в ступені 2 дорівнює " + b +
                "\n - в ступені 3 дорівнює " + c +
                "\n - в ступені 4 дорівнює " + d;
        return res;
    }

    public static void main(String[] args) {
        String result = "", resultGlobal = "";

        int i = 1;
        System.out.println("Введить 5 дійсних чисел");
        while (i <= 5) {
            double inp;
            String inpA234 = "";
            System.out.print("Введить " + i + " число: ");
            inp = inpDouble();
            inpA234 = powerA234(inp);
            result += inpA234 + "\n";
            resultGlobal += "\nЧисло " + inp  +
                    "\n - в ступені 2 дорівнює " + b +
                    "\n - в ступені 3 дорівнює " + c +
                    "\n - в ступені 4 дорівнює " + d;
            i++;
        }
        System.out.println(result);
        System.out.println(resultGlobal);
    }
}