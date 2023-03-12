//Завдання 2
//
//        Використовуючи IntelliJ IDEA, створіть клас Arithmetics.
//        Створіть чотири методи для виконання арифметичних операцій з іменами:
//        add – додавання, sub – віднімання, mul – множення, div – ділення.
//        Кожен метод має приймати два цілих аргументи та виводити на екран результат виконання
//        арифметичної операції відповідної імені методу.
//        Метод поділу div має виконувати перевірку спроби поділу на нуль.
//        Потрібно надати користувачеві можливість вводити з клавіатури
//        значення операндів і знак арифметичної операції для виконання обчислень.

import java.util.Scanner;

public class Arithmetics {
    static int inputInt() {
        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextInt()) {
            System.out.printf("You input not integer value !!!%nTry again%n");
            inp.next();
        }
        return inp.nextInt();
    }

    static void printAdd(int a, int b) {

        System.out.printf("%d + %d = %d", a, b, a + b);
    }

    static void printSub(int a, int b) {

        System.out.printf("%d - %d = %d", a, b, a - b);
    }

    static void printMul(int a, int b) {

        System.out.printf("%d * %d = %d", a, b, a * b);
    }

    static void printDiv(int a, int b) {
        if (b == 0) {
            System.out.println("Divide by zero !!!");
            return;
        }
        if ((a % b) == 0)
            System.out.printf("%d / %d = %d", a, b, a / b);
        else System.out.printf("%d / %d = %f", a, b, a * 1.0 / b);
    }

    public static void main(String[] arg) {
        int a, b;
        String inpCase;

        Scanner inp = new Scanner(System.in);
        System.out.printf("Input A and B, integer value%n");
        System.out.print("Input A:");
        a = inputInt();
        System.out.print("Input B:");
        b = inputInt();
        System.out.printf("Input:%n+ for ADD%n- for SUB%n* for MUL%n/ for DIV%n");
        inpCase = inp.nextLine();

        switch (inpCase) {
            case "+" -> printAdd(a, b);
            case "-" -> printSub(a, b);
            case "*" -> printMul(a, b);
            case "/" -> printDiv(a, b);
            default -> System.out.println(" Incorrect operation !!!");
        }
    }
}
