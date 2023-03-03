import java.util.Scanner;

//Дано ціле число. Якщо воно є позитивним, додайте до нього 1;
// інакше відніміть із нього 2. Виведіть отримане число.
public class main {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        int num;
        System.out.println("Input integer number:");
        if (inp.hasNextInt()) {
            num = inp.nextInt();
           // num = (num >= 0) ? ++num : num - 2;// тут уже тернарный оператор просится, в зависимости от дальнейших действий,
            //если нам еще понадобиться введенное число, тогда нужно вводить дополнительную переменную для результата
            num+=(num >= 0) ? 1 : -2;// исправил, согласен дат намного лучше
            System.out.println("Result " + num);
        } else System.out.println("You input not integer value");
    }
}
