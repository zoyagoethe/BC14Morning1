package newCourseDay2.hw02;

/*
Алгоритм Евклида:

Пусть a = 18, b = 30
Цикл: a!=0 and b!=0
Если a > b, то a = a % b, если меньше, то b = b % a, таким образом мы сначала находим остаток деления,
а потом повторяем действия. У нас a < b, значит, ищем остаток деления b % a (30 % 18) = 12,
присваиваем b = 12, повторяем цикл, но теперь у нас уже a > b(b = 12), значит, выполняем a % b (18 % 12) = 6?
снова переходим к циклу, теперь снова b > a, значит выполняем b % a (30 % 6), остаток от деления 0,
на этом мы прекращаем наш цикл и узнаем, что наибольший общий делитель 18 и 30 = 6. и выводим a + b (b = 0, a = 6).
*/

import java.util.Scanner;

public class greatestCommonDivisor {
    public static void main(String[] args) {
        /*System.out.println(gcd(15, 75));
        System.out.println(gcd(11248, 63));
        System.out.println(gcd(267, 99));*/
        System.out.println("Greatest common divisor: " + intScanner());

    }

    public static int intScanner() {
        Scanner input = new Scanner(System.in);
        int a;
        int b;
        System.out.println("Enter a whole number");
        a = input.nextInt();
        System.out.println("Enter another whole number");
        b = input.nextInt();
        input.close();
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }
}
