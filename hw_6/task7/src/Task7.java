//Завдання 7
//
//        Створіть програму таблиці множення для числа 7, використовуючи цикли. Приклад виведення в консоль:
//        7 * 1 = 7;
//        7 * 2 = 14;
//        …;
//        7 * 10 = 70.
public class Task7 {
    public static void main(String[] arg){
        int n=7,i=0,res=0;
        System.out.printf("Tаблиця множення для числа %d %n",n,i,res);
        while(i<=10){
            res=n*i;
            System.out.printf("%d * %d = %d%n",n,i,res);
            i++;
    }


    }
}
