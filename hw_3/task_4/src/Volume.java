//Завдання 4
//Використовуючи IntelliJ IDEA, створіть клас Volume. Напишіть
// програму розрахунку об'єму – V та площі поверхні -S циліндра.
// Об'єм V циліндра радіусом – R та висотою – h, вираховується за формулою: V = πR2h.
// Площа поверхні циліндра вираховується за формулою: S = 2πR2 + 2πR2 = 2πR(R+h).
// Результати розрахунків виведіть на екран.
public class Volume {

    public static void main(String[] arg) {
        float v = 0f, s = 0f, radius = 1.5f, h = 2.8f;
        v = (float) (Math.PI) * radius * 2 * h;

        s = 2 * (float) (Math.PI) * radius * (radius + h);
        System.out.printf("Area of the cylinder with radius-%f  height-%f :%f %n", radius, h, s);
        System.out.printf("Volume of the cylinder with radius-%f  height-%f :%f %n", radius, h, v);
//        Area of a cylinder with radius-1,500000  height-2,800000 :40,526546
//        Volume of a cylinder with radius-1,500000  height-2,800000 :26,389378

        //    Загубили рахування квадрату формули  V = πR2h
        //согласен, не усмотрел, просто задание скопировал, а там нет квадрата, исправляюсь
        v = (float) ((float) (Math.PI) * Math.pow(radius,2) * h);// тут тоже компилятор говорит, что будет double, и предлагает, привести к float
        s = 2 * (float) (Math.PI) * radius * (radius + h);
        System.out.printf("Area of the cylinder with radius-%f  height-%f :%f %n", radius, h, s);
        System.out.printf("Volume of the cylinder with radius-%f  height-%f :%f ", radius, h, v);
       // Area of the cylinder with radius-1,500000  height-2,800000 :40,526546
       // Volume of the cylinder with radius-1,500000  height-2,800000 :19,792034
    }
}
