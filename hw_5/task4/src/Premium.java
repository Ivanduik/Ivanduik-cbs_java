import java.time.Year;
//Завдання 4
//
//        Використовуючи IntelliJ IDEA, створіть клас Premium.
//        Напишіть програму розрахунку нарахування премій працівникам.
//        Премії розраховуються згідно з вислугою років.
//        Якщо вислуга до 5 років,премія становить 10% від заробітної плати.
//        Якщо вислуга від 5 років (включно) до 10 років, то премія становить 15% від заробітної плати.
//        Якщо вислуга від 10 років (включно) до 15 років, премія становить 25% від заробітної плати.
//        Якщо вислуга від 15 років (включно) до 20 років, премія становить 35% від заробітної плати.
//        Якщо вислуга від 20 років (включно) до 25 років, премія становить 45% від заробітної плати.
//        Якщо вислуга від 25 років (включно) та більше, премія складає 50% від заробітної плати.
//        Результати розрахунку виведіть на екран.



// без цикла и массива или объекта, как то не сильно оно смотрится.

import java.util.Scanner;

public class Premium {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        int yers;
        float bonus = 0, sal = 0;
        boolean flag = true;
        String msg = "Ваша премія - ";
        System.out.println("Введіть скількі років ви працюєте(ціле число):");
        if (inp.hasNextInt()) {
            yers = inp.nextInt();
            System.out.println("Введіть вашу заробітну плату:");
            if (inp.hasNextFloat()) {
                sal = inp.nextFloat();
                if (yers > 0 && sal > 0) {

                    if (yers > 0 && 5 > yers)
                        bonus = 0.1f;

                    else if (yers >= 5 && 10 > yers)
                        bonus = 0.15f;

                    else if (yers >= 10 && 15 > yers)
                        bonus = 0.25f;

                    else if (yers >= 15 && 20 > yers)
                        bonus = 0.35f;

                    else if (yers >= 20 && 25 > yers)
                        bonus = 0.45f;

                    else if (yers >= 25)
                        bonus = 0.5f;
                    msg = "Ваша премія - "
                            + Float.toString(bonus * 100) + "%, в сумі - "
                            + Float.toString(bonus * sal) + "грн. Всього "
                            + Float.toString(bonus * sal + sal) + "грн.";
                } else
                    msg = "Введено не вірне значення стажу або заробітної плати !!! ";
            } else
                msg = "Введено не числове значення заробітної плати !!! ";
        } else
            msg = "Введено не числове значення стажу !!! ";

        System.out.println(msg);

    }

}
