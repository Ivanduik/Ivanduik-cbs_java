//Завдання 6
//
//        Використовуючи IntelliJ IDEA, створіть клас DeMorganComparison.
//        Використовуючи теорему де Моргана, перетворіть вихідний вираз A | B на еквівалентний вираз.
public class DeMorganComparison {
    public static void main(String[] arg) {
        int a = 55, b = 2, res = 0;
        res = a | b;
        System.out.println("A-" + a + ", B-" + b + ".  Result  A | B = " + res);
        res = ~(~a & ~b);
        System.out.println("A-" + a + ", B-" + b + ".  Result  A | B по теоремі де Моргана  ~(~a & ~b) =" + res);


    }
}
