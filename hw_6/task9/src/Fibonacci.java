//Завдання 9
//
//        Знайдіть послідовність Фібоначчі.
//        Одне стартове число користувач вводить,
//        друге вводить користувач до шуканого.
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        int a = 0, b = 0, fib, nStart, nEnd;
        String msgFib = "";
        System.out.println("Введить додатне число початку ввідрізку послідовністі Фібоначчі ");
        if (!inp.hasNextInt()) {
            System.out.println(" Введено не коректне значення !!! ");
            return;
        }
        nStart = inp.nextInt();
        if (nStart < 0) {
            System.out.println(" Введено не коректне значення  !!! ");
            return;
        }
        System.out.printf("Введить додатне число кінцю ввідрізку послідовністі Фібоначчі." +
                        "%n Число повино бути білше %d%n"
                , nStart);
        if (!inp.hasNextInt()) {
            System.out.println(" Введено не коректне значення !!! ");
            return;
        }
        nEnd = inp.nextInt();
        if (nEnd < 0 || (nEnd <= nStart)) {
            System.out.println(" Введено не коректне значення  !!! ");
            return;
        }

        for (int i = 0; i <= nEnd; i++) {
            fib = a + b;
            a = b;
            b = fib;
            if (b == 0) a++;
            if (i >= nStart)
                msgFib += fib + " ";
        }

        System.out.printf("Послідовність Фібоначчі від %d до %d --- %s%n", nStart, nEnd, msgFib);
        msgFib="";
        fib=0;
        a=0;
        b=0;
        while( fib<=nEnd){
            if(nStart<=fib) msgFib += fib + " ";
            fib = a + b;
            a = b;
            b = fib;
            if (b == 0) a++;
        }
        System.out.printf("Послідовність Фібоначчі від %d до %d --- %s", nStart, nEnd, msgFib);
    }
}

