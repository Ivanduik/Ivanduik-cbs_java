//Завдання 8
//
//        Використовуючи IntelliJ IDEA, створіть клас Translator. Напишіть програму «Українсько-англійський перекладач».
//        Програма знає 10 слів про погоду. Потрібно, щоби користувач вводив слово українською мовою, а програма давала йому переклад англійською мовою.
//        Якщо користувач ввів слово, для якого немає перекладу, варто вивести повідомлення, що такого слова немає.


import java.util.Locale;
import java.util.Scanner;

public class Translator {
    public static void main(String[] arg) {
        Scanner inp = new Scanner(System.in);
        String inpStr, translate;
        System.out.println("Українсько-англійський перекладач");
        System.out.println("Введить явища погоди українською мовою");
        System.out.println("(ясно, сонячно, хмарно, ветрено, дождь, гроза, туман, сніг, шторм, ураган )");
        inpStr = inp.nextLine();

        translate = switch (inpStr.toLowerCase()) {
            case "ясно" -> {
                yield " переклад clear";
            }
            case "сонячно" -> {
                yield " переклад sunny";
            }
            case "хмарно" -> {
                yield " переклад сloudy";
            }
            case "ветрено" -> {
                yield " переклад windy";
            }
            case "дождь" -> {
                yield " переклад rain";
            }
            case "гроза" -> {
                yield " переклад thunderstorm";
            }

            case "туман" -> {
                yield " переклад fog";
            }

            case "сніг" -> {
                yield " переклад snow";
            }
            case "шторм" -> {
                yield " переклад storm";
            }
            case "ураган" -> {
                yield " переклад hurricane";
            }

            default -> {
                yield "Перекладу немає для цього слова";
            }

        };
        System.out.println(translate);
    }


}

