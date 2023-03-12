import java.util.Scanner;

//Завдання 3
//
//        Використовуючи IntelliJ IDEA, створіть клас ReversedArray.
//        Створити метод myReverse(int [] array),який приймає як аргумент масив
//        цілочислових елементів і повертає інвертований масив (елементи масиву у зворотному порядку).
//        Створити метод int [] subArray (int [] array, int index, int count).
//        Метод повертає частину отриманого як аргумент масиву, починаючи з позиції,
//        яка зазначена в аргументі index, розмірністю, що відповідає значенню аргументу count.
//        Якщо аргумент count містить значення більше, ніж кількість елементів,
//        що входять до частини вихідного масиву (від зазначеного індексу index до індексу останнього елемента),
//        то під час формування нового масиву розмірністю в count, заповніть одиницями ті елементи,
//        які не були скопійовані з вихідного масиву.
public class ReversedArray {
    static int inputInt() {
        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextInt()) {
            System.out.printf("You input not integer value !!!%nTry again%n");
            inp.next();
        }
        return inp.nextInt();
    }

    static int[] myReverse(int[] array) {
        int[] revArr = new int[array.length];
        for (int i = 1; i <= array.length; i++)
            revArr[i - 1] = array[array.length - i];
        return revArr;
    }

    static int[] subArray(int[] array, int index, int count) {
        int[] sub = new int[count];
        for (int i = index; i < count + index; i++)
            if (i <= array.length)
                sub[i - index] = array[i - 1];
            else
                sub[i - index] = 1;
        return sub;
    }

    public static void main(String[] arg) {
        int arrN;
        System.out.println("Input length of array:");
        arrN = inputInt();
        int[] arr = new int[arrN];
        int[] revArr, subArr;


        System.out.print("Array- ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.print("\n Sub reverse - ");
        revArr = myReverse(arr);
        for (int j : revArr) {
            System.out.print(j + " ");
        }
        System.out.print("\n Sub array - ");
        subArr = subArray(arr, 2, 20);
        for (int j : subArr) {
            System.out.print(j + " ");
        }


    }
}
