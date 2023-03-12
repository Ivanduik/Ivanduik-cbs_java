import java.util.Scanner;

public class Rectangle {
    public static void main(String[] arg) {

        Scanner inp = new Scanner(System.in);
        int a = 0, b = 0;


        System.out.println("Введить сторони прямокутника >1 A і B:  ");
        if (!inp.hasNextInt()) {
            System.out.println(" Введено не коректне значення !!! ");
            return;
        }
        a = inp.nextInt();
        if (a < 1) {
            System.out.println(" Введено не коректне значення A !!! ");
            return;
        }
        ;
        if (!inp.hasNextInt()) {
            System.out.println(" Введено не коректне значення !!! ");
            return;
        }
        b = inp.nextInt();
        if (b < 1) {
            System.out.println(" Введено не коректне значення B !!! ");
            return;}
                System.out.printf("Прямокутник A = %d x B = %d%n",a,b);
        for (int i = 0; i < b; i++) {
            System.out.printf("%n");
            for (int j = 0; j < a; j++) {
                System.out.print("*  ");
            }
        }
    }
}
