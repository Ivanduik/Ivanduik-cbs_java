import java.util.Scanner;

//Завдання 6
//
//        Дано ціле число N (> 0).
//        Використовуючи один цикл, знайдіть суму 1 + 1/(1!) + 1/(2!) + 1/(3!) +. . . + 1/(N!)
public class Task6 {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        int n,fact = 1  ;
        double res=1;


        System.out.println("Введить  ціле число N");
        if (!inp.hasNextInt()) {
            System.out.println(" Введено не коректне значення !!! ");
            return;
        }
        n = inp.nextInt();
        for (int i = 1; i <= n; i++) {
            fact *= i;
            res +=  1 / (double)fact;
        }
        System.out.printf(" Результат 1+1/(1!)+1/(2!)+... + 1/(N!) при N-%d = %f",n,res);

    }
}
