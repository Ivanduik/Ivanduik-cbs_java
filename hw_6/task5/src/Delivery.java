import java.util.Scanner;

//Завдання 5
//
//        Дано два цілих числа A і B (A < B). Знайдіть суму всіх цілих чисел від A до B включно.
public class Task5 {
    public static void main(String[] arg) {

        Scanner inp = new Scanner(System.in);
        int a = 0, b = 0, sum = 0;


        System.out.println("Введить  A і B, числа повині бути цілі та A < B ");
        if (!inp.hasNextInt()) {
            System.out.println(" Введено не коректне значення !!! ");
            return;
        }
        a = inp.nextInt();

        if (!inp.hasNextInt()) {
            System.out.println(" Введено не коректне значення !!! ");
            return;
        }
        b = inp.nextInt();

        if (!(a < b)) {
            System.out.println(" Не виконана умова A < B !!! ");
            return;
        }

        for (int i = a; i <= b; i++)
            sum += i;

        System.out.printf("Сума всіх чисел, які розташовані між %d і %d включно = %d %n", a, b, sum);

    }
}


