//ну не получается по другому описать среднее от среднего средних
public class Main {
    static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    static double average(double a, double b, double c) {

        return (a + b + c) / 3.0;
    }

    static double average(double a, double b, double c, double d) {

        return (a + b + c + d) / 4.0;
    }

    static double average(double a, double b, double c, double d, double e) {

        return (a + b + c + d + e) / 5.0;
    }

    static double max(double a, double b) {
        return Math.max(a, b);
    }

    static double max(double a, double b, double c) {
        return Math.max(Math.max(a, b), Math.max(b, c));
    }

    static double min(double a, double b) {
        return Math.min(a, b);
    }

    static double min(double a, double b, double c) {
        return Math.min(Math.min(a, b), Math.min(b, c));
    }

    public static void main(String[] args) {
        int a = 2, b = 10, c = 1, d = 123, e = 50;
        double average3num, average4num, average5num, averageAver2num, averageAver3num;
        double max2num, max3num, min2num, min3num;
        average3num = average(a, b, c);
        System.out.printf("Середне %d %d %d = %f%n", a, b, c, average3num);
        average4num = average(a, b, c, d);
        System.out.printf("Середне %d %d %d %d = %f%n", a, b, c, d, average4num);
        average5num = average(a, b, c, d, e);
        System.out.printf("Середне %d %d %d %d %d = %f%n", a, b, c, d, e, average5num);
        averageAver2num = average(average3num,average4num);
        System.out.printf("Середне  %f %f = %f%n", average3num, average4num, averageAver2num);
        averageAver3num = average(average3num,average4num,average5num);
        //averageAver3num = average(average(a,b,c),average(a,b,c,d),average(a,b,c,d,e));
        //можно таким образом, но тоже не очень.
        System.out.printf("Середне  %f %f %f = %f%n", average3num, average4num, average5num, averageAver3num);
        max2num = max(average3num,average4num);
        System.out.printf("Максимальне  %f %f = %f%n", average3num, average4num, max2num);
        max3num = max(average3num,average4num,average5num);
        System.out.printf("Максимальне  %f %f %f= %f%n", average3num, average4num, average5num, max3num);
        min2num = min(average3num,average4num);
        System.out.printf("Максимальне  %f %f = %f%n", average3num, average4num, min2num);
        min3num = min(average3num,average4num,average5num);
        System.out.printf("Максимальне  %f %f %f= %f%n", average3num, average4num, average5num, min3num);

    }
}
