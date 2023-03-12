//Завдання 6
//
//        Створіть два масиви 3х3, заповніть їх, створіть третій масив порожній.
//        У третій масив внесіть результат додавання перших двох, використовуючи методи
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
        for (int[] elI: arr) {
            for (int elJ : elI) {
                System.out.print(elJ + " ");
            }
            System.out.printf("%n");
        }
        System.out.printf("%n");
    }

    static int[][] arrAdd(int[][] arrA, int[][] arrB) {
        int[][] arrAdd = new int[arrA.length][arrA[0].length];
        for (int i = 0; i < arrAdd.length; i++)
            for (int j = 0; j < arrAdd[i].length; j++)
                arrAdd[i][j] = arrA[i][j] + arrB[i][j];
        return arrAdd;
    }

    public static void main(String[] args) {
        int nI = 3, nJ = 3;
        int[][] arrA = new int[nI][nJ];
        int[][] arrB = new int[nI][nJ];
        int[][] add = new int[nI][nJ];
        arrA = arrFill(3, 3);
        arrB = arrFill(3, 3);
        printArr(arrA, "Array A");
        printArr(arrB, "Array B");
        add = arrAdd(arrA, arrB);
        printArr(add, "Array A+B");
    }
}
