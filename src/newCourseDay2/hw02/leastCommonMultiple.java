package newCourseDay2.hw02;

/*
наименьшее число, которое делится на a и b без остатка. НОК можно найти через НОД по следующей формуле:
нок(a, b) = a * b / нод(a, b)
*/


import java.util.Scanner;

import static newCourseDay2.hw02.greatestCommonDivisor.gcd;

public class leastCommonMultiple {
    public static void main(String[] args) {
        /*System.out.println(lcm(5, 10));// -> 10
        System.out.println(lcm(3, 5));// -> 15
        System.out.println(lcm(6, 10));// -> 30*/
        System.out.println("Наименьшее общее кратное: " + intScanner());
    }

    private static int intScanner() {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Введите целое число");
        a = input.nextInt();
        System.out.println("Введите ещё одно целое число");
        b = input.nextInt();
        input.close();
        int gcd = gcd(a, b);
        return a * b / gcd;
    }

    private static int lcm(int a, int b) {
        int gcd = gcd(a, b);
        return a * b / gcd;
    }
}
