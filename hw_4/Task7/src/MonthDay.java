import java.util.Scanner;

//Завдання 7
//
//        Дано номер місяця – ціле число в діапазоні 1–12 (1 – січень, 2 – лютий і так далі).
//        Визначте кількість днів цього місяця для невисокосного року.
public class MonthDay {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        int numMonth, dayOfMonth = 0;
        String mes = "";

        System.out.println("Input number of month 1-12 :");
        if (inp.hasNextInt()) { //ввод и проверка на целое число
            numMonth = inp.nextInt();
            dayOfMonth = switch (numMonth) { //интересный свитч возвращает относительно выбора
                case 1, 3, 5, 7, 8, 10, 12 -> { // тут мы перечисляем какие значения должны вернуть одинаковую величину
                    yield 31;
                }
                case 2 -> {
                    yield 28;
                }
                case 4, 6, 9, 11 -> {
                    yield 30;
                }

                default -> { // возвращаем если не один выбор не сработал
                    mes = "You input number <> 1-12";
                    yield 0;
                }
            };

        } else mes = "You input not integer number";
        if (dayOfMonth != 0) mes = "In month -" + dayOfMonth + "day";

        System.out.println(mes);

    }
}
