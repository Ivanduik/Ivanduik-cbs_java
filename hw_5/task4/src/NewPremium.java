import java.util.Scanner;

public class Premium {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        int yers;
        float sal, bonus;

        System.out.print("Введіть скількі років ви працюєте(ціле число): ");
        if (!inp.hasNextInt()) {
            System.out.println("Введено не числове значення стажу !!! ");
            return;
        }
        yers = inp.nextInt();

        System.out.print("Введіть вашу заробітну плату: ");
        if (!inp.hasNextFloat()) {
            System.out.println("Введено не числове значення заробітної плати !!! ");
            return;
        }
        sal = inp.nextFloat();

        if (yers <= 0 || sal <= 0) {
            System.out.println("Введено не вірне значення стажу або заробітної плати !!! ");
            return;
        }

        if (yers < 5)
            bonus = 0.1f;

        else if (yers < 10)
            bonus = 0.15f;

        else if (yers < 15)
            bonus = 0.25f;

        else if (yers < 20)
            bonus = 0.35f;

        else if (yers < 25)
            bonus = 0.45f;

        else
            bonus = 0.5f;

        System.out.println("Ваша премія - " + bonus * 100 + "%, " +
                "в сумі - " + bonus * sal + "грн. " +
                "Всього " + (bonus * sal + sal) + "грн.");
    }
}
