//Завдання 3

//        Використовуючи IntelliJ IDEA, створіть клас Circle.
//        Створіть константу під назвою PI (число π «пі»), створіть змінну радіус із назвою – r.
//        Використовуючи формулу πR2, обчисліть площу кола та виведіть результат на екран.
public class Circle {
    public static void main(String[] arg) {
        final float PI = 3.14159265f;
        float radius = 1.2f;
        float s = 0;
        s = (float) (PI * Math.pow(radius, 2));
        System.out.println("Area of a circle with a radius " + radius + " - " + s);
        //Area of a circle with a radius 1.2 - 4.523894

//        Думаю, тут взагалі каст зайвий)
//
//        Також, рекомендую подивитися на метод sqrt() класу Math, він вміє рахувати квадрат числа)
//        //sqrt - квадратный корень, sqr-обычно возводит в квадрат, но в классе Math, его нет, поэтому 2 варианта
//        Math.pow(radius, 2) и radius*radius.

        s = (float) (PI * radius*radius);// тут тоже компилятор говорит, что будет double, и предлагает, либо привести к float или s сделать double
        //я просто не знаю где может понадобиться площадь до 15 знака после запятой
        System.out.println("Area of a circle with a radius " + radius + " - " + s);
        //Area of a circle with a radius 1.2 - 4.523894

    }
}
