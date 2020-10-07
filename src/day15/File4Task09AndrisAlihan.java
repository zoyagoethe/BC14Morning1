package day15;

/*Реализовать метод, который принимает целое положительное число. Метод должен выводить на экран все
        положительные числа, на которые заданное число делится без остатка и отображает количество найденных
        делителей.
        Пример: printDivisors(32) ->*/

public class File4Task09AndrisAlihan {
    public static void main(String[] args) {
        printDivisors(32);
    }

    private static void printDivisors(int a) {
        int count = 0;
        for (int i = a; i >= 1; i--) {
            if (a % i == 0) {
                System.out.println(i);
                count++;
            }
            System.out.println("Total divisors: " + count);
        }
    }
}
