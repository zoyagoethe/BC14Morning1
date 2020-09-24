package day10.hw10;

/* 1. Напишите программу, которая находит чётные числа между a и b.
   2. Напишите программу, которая находит нечётные числа между a и b.
   3. Напишите программу, которая находит числа кратные 11 между a и b.
   4. Напишите программу, которая проверяет год на високосность. Кратный четырём.
   6. Дано число меньше 3000. При делении числа на 32 получается остаток 30, при делении на 58 - остаток 44.
   Найдите число или числа.*/


public class HomeWork10 {
    public static void main(String[] args) {
        evenNumber(15, 130); // чётные числа между a и b
        split();
        oddNumber(15, 130); // нечётные числа между a и b
        split();
        elevenNumber(15, 130); // числа кратные 11 между a и b
        split();
        leapYear(3214); // проверяет год на високосность
        split();
        numberRequired(1, 3000);
        split();

    }

    private static void numberRequired(int a, int b) {
        for (int i = a; i < b; i++) {
            if (i % 32 == 30 && i % 58 == 44) {
                System.out.print(" " + i);
            }
        }
    }

    private static void leapYear(int a) {
        if (a % 4 == 0) {
            System.out.print(" " + a + " - високосный год.");
        } else {
            System.out.println(" " + a + " - невисокосный год.");
        }
    }

    private static void elevenNumber(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 11 == 0) {
                System.out.print(" " + i);
            }
        }
    }

    private static void oddNumber(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 != 0) {
                System.out.print(" " + i);
            }
        }
    }

    private static void split() {
        System.out.println(" **********");
    }

    private static void evenNumber(int a, int b) {
        for (int i = a; i <= b; i++) {
            if (i % 2 == 0) {
                System.out.print(" " + i);
            }
        }
    }
}
