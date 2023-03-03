import java.util.Scanner;

public class Calculator {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String RED_BOLD = "\033[1;31m";
    public static final String GREEN_BOLD = "\033[1;32m";
    public static final String YELLOW_BOLD = "\033[1;33m";
    public static void main(String[] arg) {

        Scanner inStr = new Scanner(System.in);
        String sign;
        double operand1, operand2, rez = 0.d;
        boolean flag = true;

        System.out.print("консульний калькулятор%n");
        System.out.print("Введить 1 числo: ");
        operand1 = inStr.nextDouble();

        System.out.print("Введить 2 числo: ");
        operand2 = inStr.nextDouble();

        System.out.printf("Введить операцію :%nДодавання +%nВіднімвння -%nМноження *%nДілення /%n");
        sign = inStr.next();

        switch (sign) {
            case "+" -> rez = operand1 + operand2;
            case "-" -> rez = operand1 - operand2;
            case "*" -> rez = operand1 * operand2;
            case "/" -> {
                if (operand2 == 0) {
                    System.out.printf("%sПомилка %f/%f, ділення на 0!!!%s", RED_BOLD, operand1, operand2, ANSI_RESET);
                    flag = false;
                } else
                    rez = operand1 / operand2;
            }
            default -> {
                System.out.printf("%sНе вірно введена операція - %s %s", YELLOW_BOLD, sign, ANSI_RESET);
                flag = false;
            }
        }
        if (flag)
            System.out.printf("%sРезультат %f%s%f=%f  %s", GREEN_BOLD, operand1, sign, operand2, rez, ANSI_RESET);


    }
}
