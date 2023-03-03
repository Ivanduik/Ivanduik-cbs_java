//Завдання 2
//
//        Використовуючи IntelliJ IDEA, створіть клас Arithmetic Average.
//        Вирахуйте середнє арифметичне трьох цілих значень і виведіть його на екран.
//        З якою проблемою ви зіткнулися?
//        Який тип змінних краще використовуватиме для коректного показу результату?
public class ArithmeticAverage {
    public static void main(String[] arg) {
        int x = 10,y = 12,z = 3;
        x += y - x++ * z;  //=>x=x+y-x++*z=>x+y=10+12=22=>x*z=10*3=30=>x+1=>22-30=-8
        //при инкременте і++ , вначале выполняется операция, потом добавляется 1
        System.out.println("x += y - x++ * z=>x=x+y-x++*z=>x+y(10+12)=22=>x*z(10*3)=30=>x+1=>22-30=-8");
        System.out.println("x="+x+" y="+y+" z="+z);//x=-8 y=12 z=3
        int rezInt = 0, a = 10, b = 10, c = 10;
        float rezFloat = 0f;
        rezInt = (a + b + c) / 3;
        rezFloat = (a + b + c) / 3;
        System.out.println(" Average integer a b c = " + rezInt);// Average integer a b c =10
        System.out.println(" Average float a b c = " + rezFloat);// Average integer a b c =10.0
        //тут у нас случай, когда все ок, потому что результат у нас целое число
        a = 10;
        b = 11;
        c = 10;
        rezInt = (a + b + c) / 3;
        rezFloat = (a + b + c) / 3;
        System.out.println(" Average integer a b c = " + rezInt);// Average integer a b c =10
        System.out.println(" Average float a b c = " + rezFloat);// Average integer a b c =10.0
        //тут у нас случай  когда результат действительное число, но есть проблема - (a + b + c) / 3
        // все равно результатом будет целое число, так как все переменные у нас целые числа и точность теряется
        // для того, чтобы получить нужный результат, нужно сделать приведение типа, указать,
        // что результат нам нужен действительное число, сделать кастинг.
        rezInt = (a + b + c) / 3;
        rezFloat = ((float) (a + b + c)) / 3;// тут мы сказали компилятору, что результатом значения a + b + c,
        // мы хотим получить действительное число, теперь мы не будем терять точность
        System.out.println(" Average integer a b c = " + rezInt); //Average integer a b c =10
        System.out.println(" Average float a b c = " + rezFloat); //Average integer a b c =10.333333
        //float или double нужно выбирать в зависимости от нужной точности и величины значений с которыми нам нужно работать


//        Можна замінити на:
//        rezFloat = (a + b + c) / 3.;
//        Або
//                rezFloat = (a + b + c) / 3.0;
//        Обидва вирази вище працюють ідентично
//        Компілятор побачить, що ви ділити на число з плаваючою точкою, тож результатом ділення поверне вам типу float
//        rezInt = (a + b + c) / 3.;// компилятор не соглашается говорит, что результат будет double, поэтому предлагает привести его к float
//        rezFloat = (a + b + c) / 3.0;// компилятор не соглашается говорит, что результат будет double, поэтому предлагает привести его к float
//        G:\java\part1\hw_3\Task2\src\ArithmeticAverage.java:42:32
//        java: incompatible types: possible lossy conversion from double to float
        rezFloat = (float) ((a + b + c) / 3.0);
        System.out.println(" Average integer a b c = " + rezInt); //Average integer a b c =10
        System.out.println(" Average float a b c = " + rezFloat); //Average integer a b c =10.333333
        //float или double нужно выбирать в зависимости от нужной точности и величины значений с которыми нам нужно работать


    }
}
