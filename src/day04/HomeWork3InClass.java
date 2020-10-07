package day04;

public class HomeWork3InClass {
    public static void main(String[] args) {
        int r = 5;
        findCircumference(r);
        findCircumference(7);
        findCircumference(10);
        int radiusFromKonstantin = 100;
        findCircumference(radiusFromKonstantin);
        double moneyInEuro = 1000;
        currencyConverter(moneyInEuro, 1.1);
    }

    private static void currencyConverter(double euro, double course) {
        System.out.println("Количество долларов: " + euro * course);
    }


    private static void findCircumference(int radius) {
        // L = 2*PI*R
        double l = 2 * Math.PI * radius;
        System.out.println("Длина окружности радиусом " + radius + " составляет " + l);
    }
}
