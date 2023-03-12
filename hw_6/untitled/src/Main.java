import java.util.Scanner;

public class Main {
    static void printTriangle(int longSide, char ch,int k) {
        if (longSide <= 0) {
            System.out.printf("Input incorrect value");
            return;
        }
        ch='*';
        k=999;

        for (int i = 1; i <= longSide; i++) {
            System.out.println((ch + "").repeat(i));
        }

    }

    public static void main(String[] args) {
        char c='k';
        int d=0;
        printTriangle(3, c,d);
        System.out.printf("%s %d",c,d);

    }
}
