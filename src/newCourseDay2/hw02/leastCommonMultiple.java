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
        System.out.println("Least common multiple: " + intScanner());
    }

    private static int intScanner() {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter a whole number");
        a = input.nextInt();
        System.out.println("Enter another whole number");
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
