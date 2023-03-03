public class Parity {
    public static void main(String[] arg) {
        byte rez, a = 1;
        String str = "odd";
        if ((a & 1) == 1) str = "odd";//Используем операцию "И", стандартный способ, если результат 1 значит нечетное
        //его плюс в том, что он выполняется быстрее и за меньшее количество операций
        System.out.printf("1.Value %d in binary %s - %s %n", a, Integer.toBinaryString(a), str);

        rez = a;// инициализируем новую переменную, чтобы не потерять исходное значение
        if (((rez >>= 1) == (rez <<= 1))&&(a!=1)) str = "even";//Тут интереснее способ, но он коварный.
        // Тут мы потеряем младший бит.
        // Если будет разная разрядность (битность) чисел, и использование кастингов, в сторону меньшей битности,
        // можем потерять старший бит, и условие не выполнится.
        // Двигаем на 1 бит в право, затем обратно
        //если нулевой бит был 0, то результат не измениться, следовательно,  четное, если изменится, то не четное

        System.out.printf("2.Value %d in binary %s %n", rez, Integer.toBinaryString(rez));
        System.out.printf("2.Value %d in binary %s - %s %n", a, Integer.toBinaryString(a), str);
//        1.Value 126 in binary 1111110 - even
//        2.Value 126 in binary 1111110
//        2.Value 126 in binary 1111110 - even

//        1.Value 127 in binary 1111111 - odd
//        2.Value 126 in binary 1111110
//        2.Value 127 in binary 1111111 - odd

    }
}
