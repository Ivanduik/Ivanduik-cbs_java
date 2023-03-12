
public class Main {
    static void swapMinMax(int[] arr) {
        int max, min, indexMax = 0, indexMin = 0;
        max = arr[0];
        min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                indexMin = i;
            } else if (arr[i] > max) {
                max = arr[i];
                indexMax = i;
            }

        }
        arr[indexMin] = max;
        arr[indexMax] = min;
    }

    public static void main(String[] args) {
        int[] array = {1, 5, 11, 66, 11, -5, 33, -35, 4, -1, 6};
        for (int j : array) System.out.println("Arr " + j);
        System.out.println("");

        swapMinMax(array);
        for (int j : array) System.out.println("Arr " + j);

    }

}