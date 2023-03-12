import java.sql.Array;
import java.util.Scanner;

//Завдання 2
//
//        Використовуючи IntelliJ IDEA, створіть клас CustomerArray.
//        Створити масив розміру N-елементів,
//        заповнити його довільними цілими значеннями (розмір масиву задає користувач).
//        Вивести на екран: найбільше значення масиву, найменше значення масиву,
//        загальну суму всіх елементів, середнє арифметичне всіх елементів, вивести всі непарні значення.
public class CustomerArray {
    static int inputInt() {
        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextInt()) {
            System.out.printf("You input not integer value !!!%nTry again%n");
            inp.next();
        }
        return inp.nextInt();
    }

    static public void main(String[] arg) {
        int arrN, sum, min, max;
        String oddEl = "";
        System.out.println("Input length of array:");
        arrN = inputInt();
        int[] arr = new int[arrN];
        System.out.print("Array- ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        min = max = arr[0];
        sum = 0;
        for (int j : arr) {
            if (j < min)
                min = j;
            else if (j > max)
                max = j;
            sum += j;
            if (j % 2 != 0) oddEl += j + " ";
        }
        System.out.printf("%nMax - %d, Min - %d, Add - %d, Average - %.3f", max, min, sum, sum / (arrN * 1.0));
        System.out.printf("%nOdd element of array - %s", oddEl);

    }
}
