//Завдання 7
//
//
//        Використовуючи IntelliJ IDEA, створіть клас Arrays.
//        Створіть масив розмірністю 10 елементів, виведіть на екран усі елементи масиву у зворотному порядку.

public class Arrays {
    static int[] arrFill(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = (int) (Math.random() * 100);
        return arr;

    }

    static void printArr(int[] arr, String msg) {
        System.out.println(msg);
        for (int el : arr)
            System.out.print(el + " ");
        System.out.printf("%n");
    }

    static void printArrReverse(int[] arr, String msg) {
        System.out.println(msg);
        for (int i = 1; i <= arr.length; i++) {
            System.out.print(arr[arr.length - i] + " ");
        }
    }
    public static void main(String[] arg) {
        int[] arr = new int[10];
        arr = arrFill(10);
        printArr(arr, "Array");
        printArrReverse(arr, "Reverse Array");
    }
}
