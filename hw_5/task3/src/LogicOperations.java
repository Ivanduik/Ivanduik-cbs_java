//Завдання 3
//
//        Використовуючи IntelliJ IDEA, створіть клас LogicOperations.
//        Є 3 змінні типу int x = 5, y = 10, і z = 15.

//        Виконайте та розрахуйте результат таких операцій для цих змінних:
//        § 1 x += y >> x++ * z;
//        § 2 z = ++x & y * 5;
//        § 3 y /= x + 5 | z;
//        § 4 z = x++ & y * 5;
//        § 5 x = y << x++ ^ z;
public class LogicOperations {
    public static void main(String[] arg) {
        int x = 5, y = 10, z = 15;
        System.out.printf("x = %8s(bin) = %d(dec)%n", Integer.toBinaryString(x), x);
        System.out.printf("y = %8s(bin) = %d(dec)%n", Integer.toBinaryString(y), y);
        System.out.printf("z = %8s(bin) = %d(dec)%n", Integer.toBinaryString(z), z);

        x += y >> x++ * z;// x*z=5*15=75-> y>>75=0; x=x+0=5+0->x++ сначала выполняем математические операции потом логические
        System.out.printf("1. x += y >> x++ * z = %s(bin) = %d(dec)%n", Integer.toBinaryString(x), x);

        x = 5;
        y = 10;
        z = 15;
        z = ++x & y * 5;//x+1=5+1=6; y*5->10*5=50 6&50 сначала выполняем математические операции потом логические
        System.out.printf("2. z = ++x & y * 5 = %s(bin) = %d(dec)%n", Integer.toBinaryString(z), z);

        x = 5;
        y = 10;
        z = 15;
        y /= x + 5 | z; //c большой вероятностью, тут будет действительное
        // y=10/(x + 5 | z)сначала выполняем математические операции потом логические
        // x+5|z=5+5|5=10|15=15
        //y=y/15=10/15;

        System.out.printf("3. y /= x + 5 | z = %s(bin) = %d(dec)%n", Integer.toBinaryString(y), y);
        x = 5;
        y = 10;
        z = 15;
        System.out.printf("3. y /= x + 5 | z =  %f%n", (double) y / (x + 5 | z));

        x = 5;
        y = 10;
        z = 15;
        z = x++ & y * 5;//сначала выполняем математические операции потом логические
        //y*5=10*5=50
        //x++&50=5&50
        //x++
        System.out.printf("4. z = ++x & y * 5 = %s(bin) = %d(dec)%n", Integer.toBinaryString(z), z);

        x = 5;
        y = 10;
        z = 15;
        x = y << x++ ^ z;//сначало делаем сдвиг, потом исключающие ИЛИ, и потом x++
        System.out.printf("5. x = y << x++ ^ z;= %s(bin) = %d(dec)%n", Integer.toBinaryString(x), x);

//                x =      101(bin) = 5(dec)
//                y =     1010(bin) = 10(dec)
//                z =     1111(bin) = 15(dec)
//                1. x += y >> x++ * z = 101(bin) = 5(dec)
//                2. z = ++x & y * 5 = 10(bin) = 2(dec)
//                3. y /= x + 5 | z = 0(bin) = 0(dec)
//                3. y /= x + 5 | z =  0,666667
//                4. z = ++x & y * 5 = 0(bin) = 0(dec)
//                5. x = y << x++ ^ z;= 101001111(bin) = 335(dec)
    }
}
