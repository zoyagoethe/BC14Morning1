package day3;

public class HelloPi {
    public static void main(String[] args) {
        double pi = 3.14;
        double radius = 5.5;
        System.out.println(pi * radius * radius);

        final double PI2 = 3.14; // константы большими буквами
        pi = pi + 1;
        System.out.println(pi);
        // PI2 = PI2 + 1; - ошибка, поптому что нельзя изменить константу

        double var1 = 1_000_000.0;
        //1,0E + 6 - экспоненциальная запись 1 * 10 в 6ой степени
        double pi3 = Math.PI;
        double var2 = Math.pow(2,3);// возведегие в степень
        System.out.println(var2);




    }
}
