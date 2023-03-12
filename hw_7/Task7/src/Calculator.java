import java.util.Scanner;

//Завдання 7
//
//        Використовуючи IntelliJ IDEA, створіть клас Calculator.
//        Створіть метод з ім'ям calculate,
//        який приймає як параметри три цілих аргументи та виводить на екран середнє арифметичне значень аргументів.
public class Calculator {
    static int inputInt() {
        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextInt()) {
            System.out.printf("You input not integer value !!!%nTry again%n");
            inp.next();
        }
        return inp.nextInt();
    }

    static double calculate(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    public static void main(String[] args) {
        int a, b, c;
        double average;
        System.out.println("Input integer value A, B, C");
        System.out.print("Input A: ");
        a = inputInt();
        System.out.print("Input B: ");
        b = inputInt();
        System.out.print("Input C: ");
        c = inputInt();
        average=calculate(a,b,c);
        System.out.printf("Average %d, %d, %d = %f",a,b,c,average);

    }
}

