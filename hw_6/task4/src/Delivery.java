//Є N клієнтів, яким компанія-виробник має доставити товар.
// Скільки є можливих маршрутів доставлення товару з урахуванням того, що товар доставлятиме одна машина?
// Використовуючи IntelliJ IDEA, створіть клас Delivery.
// Напишіть програму, яка розраховуватиме та виводитиме на екран кількість можливих варіантів доставлення товару.
// Для розв’язку задачі використовуйте факторіал N!, що розраховується за допомогою циклу do-while.

import java.util.Scanner;

public class Delivery {
    public static void main(String[] arg) {
        System.out.printf("Ввить кількість Клієнтів для доставки:");
        Scanner inp = new Scanner(System.in);
        int n = 1, res = 1;

        if (!inp.hasNextInt()) {
            System.out.println("Ви ввели не коректне значення!!");
            return;
        }
        n = inp.nextInt();
        if (n <= 0) {
            System.out.println("Ви ввели не коректне значення!!");
            return;
        }

        int i = 0;
        do {
            i++;
            res *= i;
        } while (n > i);
        System.out.println("Кількість варіантів доставки- " + res);
    }

}
