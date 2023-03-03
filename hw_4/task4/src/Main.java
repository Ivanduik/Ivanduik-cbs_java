import java.util.Scanner;

//Дано ціле число. Якщо воно є позитивним, додайте до нього 1; інакше не змінюйте його. Виведіть отримане число.
public class Main {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        int num;
        System.out.println("Input Cell number:");
        if (inp.hasNextInt()) {
            num = inp.nextInt();
            //num=(num>=0)?++num:num;// ++num для того чтобы инкрементировало до операции, тернарный оператор для разнообразия
            if (num >= 0) ++num; // мне так больше нравится, более понятно,
            //mum+=(num >= 0)?1:0; можно и так , из подсказки с комментариев ДЗ
            System.out.println("Result " + num);
        } else System.out.println("You input not integer value");
    }
}
