//Завдання 5
//
//        Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній.
//        У третій масив внесіть результат додавання перших двох.
public class Main {
    static int[][] arrFill(int nI, int nJ) {
        int[][] arr = new int[nI][nJ];
        for (int i = 0; i < nI; i++)
            for (int j = 0; j < nJ; j++)
                arr[i][j] = (int) (Math.random() * 100);
        return arr;

    }

    static void printArr(int[][] arr, String msg) {
        System.out.println(msg);
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");
    }

    public static void main(String[] args) {
        int nI = 3, nJ = 3;
        int[][] arrA = new int[nI][nJ];
        int[][] arrB = new int[nI][nJ];
        int[][] arrAdd = new int[nI][nJ];
        arrA = arrFill(3, 3);
        arrB = arrFill(3, 3);
        printArr(arrA, "Array A");
        printArr(arrB, "Array B");
        for (int i = 0; i < arrAdd.length; i++)//тут будет метод в следующем задании
            for (int j = 0; j < arrAdd[i].length; j++)
                arrAdd[i][j] = arrA[i][j] + arrB[i][j];
        printArr(arrAdd, "Array A+B");
    }
}
