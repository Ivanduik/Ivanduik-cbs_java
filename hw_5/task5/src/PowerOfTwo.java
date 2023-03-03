import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] arg) {
        byte two = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("Введить число типу байт");
        two = inp.nextByte();
        if (two != 0 && (two & (two - 1)) == 0) System.out.println("Число " + two + " є ступеням двійки");
        else System.out.println("Число " + two + " не є ступеням 2");
        //  так как число  в степени 2, в двоичном виде имеет только 1 бит еденичку
        //0001000, если мы отнимем от него 1 то получим 0000111
        // и если применим "И"
        //0001000
        //?
        //0000111
        //0000000
        // то есть будет 0, в других случаях будет число, также исключил число 0.


    }


}
