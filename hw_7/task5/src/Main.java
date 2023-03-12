import java.util.Scanner;

//Завдання 5
//        Опишіть метод PowerA3(A, B), який обчислює третій ступінь числа A і повертає її до змінної B
//        (A – вхідний, B – вихідний параметр; обидва параметри є дійсними).
//        За допомогою цієї процедури знайдіть третій ступінь п'яти зазначених чисел.
public class Main {
    static double inpDouble() {// дробный знак - ",", наверное зависит, что установлено в винде
        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextDouble()) {
            System.out.printf("Ви ввели некоректне значення!!!%nCпробуйте ще раз");
            inp.next();
        }
        return inp.nextDouble();
    }

    static double power3A(double a) {
        return Math.pow(a, 3);
    }

    public static void main(String[] args) {
        String resault = "";

        int i = 1;

        System.out.println("Введитm 5 дійсних чисел");

        while (i <= 5) {
            double inp,inp3a;
            System.out.print("Введить " + i + " число: ");
            inp = inpDouble();
            inp3a = power3A(inp); // можно не использовать промежуточные переменные, но тогда код стает сложно читаем
            resault += "Число " + inp + " в ступені 3 дорівнює " + inp3a + "\n";
            i++;
        }
        System.out.println(resault);

    }
}