public class Main {
    static double average(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    static double average(int a, int b, int c, int d) {
        return (a + b + c + d) / 4.0;
    }

    static double average(int a, int b, int c, int d, int e) {
        return (a + b + c + d + e) / 5.0;
    }

    static double averageAver(int a, int b, int c, int d) {
        double aAver = average(a, b, c);
        double bAver = average(a, b, c, d);
        return (aAver + bAver) / 2.0;
    }

    static double averageAver(int a, int b, int c, int d, int e) {
        double aAver = average(a, b, c);
        double bAver = average(a, b, c, d);
        double cAver = average(a, b, c, d, e);
        return (aAver + bAver + cAver) / 3.0;
    }

    static double averageMax(int a, int b, int c, int d) {
        double aAver = average(a, b, c);
        double bAver = average(a, b, c, d);
        return Math.max(aAver, bAver);
    }

    static double averageMax(int a, int b, int c, int d, int e) {
        double aAver = average(a, b, c);
        double bAver = average(a, b, c, d);
        double cAver = average(a, b, c, d, e);
        return Math.max(Math.max(aAver, bAver), Math.max(bAver, cAver));
    }

    static double averageMin(int a, int b, int c, int d) {
        double aAver = average(a, b, c);
        double bAver = average(a, b, c, d);
        return Math.min(aAver, bAver);
    }

    static double averageMin(int a, int b, int c, int d, int e) {
        double aAver = average(a, b, c);
        double bAver = average(a, b, c, d);
        double cAver = average(a, b, c, d, e);
        return Math.min(Math.min(aAver, bAver), Math.min(bAver, cAver));
    }

    public static void main(String[] args) {
        int a = 2, b = 10, c = 1, d = 123, e = 50;
        double average3, average4, average5, averageAver2, averageAver3;
        double averageMax2, averageMax3, averageMin2, averageMin3;
        average3 = average(a, b, c);
        System.out.printf("Середне %d %d %d = %f%n", a, b, c, average3);
        average4 = average(a, b, c, d);
        System.out.printf("Середне %d %d %d %d = %f%n", a, b, c, d, average4);
        average5 = average(a, b, c, d, e);
        System.out.printf("Середне %d %d %d %d %d = %f%n", a, b, c, d, e, average5);
        averageAver2 = averageAver(a, b, c, d);
        System.out.printf("Середне  %f %f = %f%n", average3, average4, averageAver2);
        averageAver3 = averageAver(a, b, c, d, e);
        System.out.printf("Середне  %f %f %f = %f%n", average3, average4, average5, averageAver3);
        averageMax2 = averageMax(a, b, c, d);
        System.out.printf("Максимальне  %f %f = %f%n", average3, average4, averageMax2);
        averageMax3 = averageMax(a, b, c, d, e);
        System.out.printf("Максимальне  %f %f %f= %f%n", average3, average4, average5, averageMax3);
        averageMin2 = averageMin(a, b, c, d);
        System.out.printf("Мінімальне  %f %f = %f%n", average3, average4, averageMin2);
        averageMin3 = averageMin(a, b, c, d, e);
        System.out.printf("Мінімальне  %f %f %f= %f%n", average3, average4, average5, averageMin3);
    }
}