import java.util.Arrays;

//Завдання 4
//
//        Використовуючи IntelliJ IDEA, створіть клас UserArray.
//        Створити метод, який виконуватиме збільшення довжини масиву,
//        переданого як аргумент, на 1 елемент.
//        Елементи масиву мають зберегти своє значення та порядок індексів.
//        Створити метод, який приймає два аргументи, перший аргумент типу int [] array,
//        другий аргумент типу int value.
//        У тілі методу реалізуйте можливість додавання другого аргументу методу в масив за індексом 0,
//        водночас довжина нового масиву має збільшитися на 1 елемент,
//        а елементи одержуваного масиву як перший аргумент мають скопіюватися в новий масив починаючи з індексу 1.
public class UserArray {
    static int[] addEl(int[] arr) {
        int[] addArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, addArr, 0, arr.length);//можно через цикл, но есть уже готовые решения
        //Arrays.copyOf() тоже копирует безболезненно массив
        // иначе есть риск потерять данные в исходном массиве.
        // google знает много
        return addArr;
    }

    static int[] addEl(int[] arr, int ell) {
        int[] addArr = new int[arr.length + 1];
        addArr[0] = ell;
        System.arraycopy(arr, 0, addArr, 1, arr.length);
        return addArr;
    }

    public static void main(String[] arg) {
        int[] arr = new int[25];
        int[] arrAdd;
        System.out.print("Array - ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + " ");
        }
        System.out.print("\nChange array - ");
        arrAdd = addEl(arr);
        for (int j : arrAdd) {
            System.out.print(j + " ");
        }
        System.out.print("\nChange array add element- ");
        arrAdd = addEl(arr, 3);
        for (int j : arrAdd) {
            System.out.print(j + " ");
        }
    }
}
