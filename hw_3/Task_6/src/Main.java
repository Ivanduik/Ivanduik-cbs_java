//Завдання 6
//
//
//        Використовуючи IntelliJ IDEA, створіть проект із класом main.
//        Створіть дві цілочисельні змінні та виведіть на екран
//        результати всіх арифметичних операцій над цими двома змінними.
//
//        + Додавання додає два значення x + y
//        - Віднімання одного значення з іншого x – y
//        * Множення множить два значення x * y
//        / Ділення ділить одне значення на інше x / y
//        % Ділення із виведенням залишку повертає залишок від поділу x % y
//        ++ Інкримент збільшує значення змінної на 1 ++x
//        -- Дикримент зменшує значення змінної на 1 --x
public class Main {
    public static void main(String[] arg) {
        int result = 0, a = 333, b = 444;
        float resultFloat = 0;
        System.out.println("a=" + a + " b=" + b);
        result = a + b;
        System.out.println("a+b=" + result);
        result = a - b;
        System.out.println("a-b=" + result);
        result = a * b;
        System.out.println("a*b=" + result);
        result = a / b;//тут результат будет действительное число
        // Добре, що побачили, що результатом a / b буде дійсне число, можна було привласнити його до змінної відповідного типу,
        // бо зараз виводить у результаті 0, що не є істинним)
        resultFloat = (float) a / b;
        System.out.println("a/b=" + result);
        System.out.println("a/b=" + resultFloat);
        result = a % b;
        System.out.println("a%b=" + result);
        result = b % a;
        System.out.println("b%a=" + result);

        System.out.println("a++=" + a++);
        System.out.println("a=" + a);
        System.out.println("++a=" + ++a);
        System.out.println("a=" + a);
        System.out.println("b--=" + b--);
        System.out.println("b=" + b);
        System.out.println("--b=" + --b);
        System.out.println("b=" + b);
//        a=333 b=444
//        a+b=777
//        a-b=-111
//        a*b=147852
//        a/b=0
//        a%b=333
//        b%a=111
//        a++=333
//        a=334
//        ++a=335
//        a=335
//        b--=444
//        b=443
//        --b=442
//        b=442
    }
}
