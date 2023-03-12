//Завдання 2
//
//        Використовуючи IntelliJ IDEA, створіть клас Bank. Уявіть, що ви реалізуєте програму для банку,
//        яка допомагає визначити, погасив клієнт кредит чи ні.
//        Припустимо, щомісячна сума платежу має становити 100 грн.
//        Клієнт має виконати 7 платежів, але може платити рідше великими сумами.
//        Тобто може двома платежами по 300 і 400 грн закрити весь борг.
//
//        Створіть метод, який як аргумент прийматиме суму платежу, введену економістом банку.
//        Метод виводить на екран інформацію про стан кредиту
//        (сума заборгованості, сума переплат, повідомлення про відсутність боргу).
import java.util.Scanner;
public class Bank {

    static double clientCreditFull, clientCreditPaid;
    static int clientCreditMaxParts, clientCreditPaidPart;

    static double inpDouble() {
        Scanner inp = new Scanner(System.in);
        while (!inp.hasNextDouble()) {
            System.out.printf("Ви ввели некоректне значення!!!%nCпробуйте ще раз");
            inp.next();
        }
        return inp.nextDouble();
    }

    static void clientPaid(double paid) {
        double overpayment;
        String msg;
        clientCreditPaid += paid;
        clientCreditPaidPart++;
        System.out.println("Загальна сума кредіту " + clientCreditFull);
        System.out.println("Погашена сума кредіту " + clientCreditPaid);
        overpayment = clientCreditPaid - ((clientCreditFull / clientCreditMaxParts) * clientCreditPaidPart);
        if (overpayment > 0) msg = "Заборгованість відсутня, переплата " + overpayment;
        else msg = "Заборгованість - " + Math.abs(overpayment);
        System.out.println(msg);
        if ((overpayment >= 0 && clientCreditPaidPart == clientCreditMaxParts) || clientCreditFull <= clientCreditPaid)
            System.out.println("Кредит погашено");
        else System.out.println("Здійснено "+clientCreditPaidPart+" платіж з "+clientCreditMaxParts);
    }

    public static void main(String[] args) {
        clientCreditFull = 700;//  всего кредита. Как не хватает типа объект как в JS, или структуры
        clientCreditPaid = 223.25;// оплачено кредита
        clientCreditMaxParts = 9;// части кредита
        clientCreditPaidPart = 1;// оплачено частей
        double creditPay;
        System.out.println("Введить суму оплати кредиту:");
        creditPay = inpDouble();
        clientPaid(creditPay);
    }
}
