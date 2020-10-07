package day18.HomeWork17;

import java.util.Scanner;

public class MyFirstGame {
    public static void main(String[] args) {
        startApplication();
    }

    private static void startApplication() {
        Scanner eingabe = new Scanner(System.in);
        int min = 1;
        int max = 100;
        int number = (int) (Math.random() * (max - min) + 1) + min;
        int attempts = eingabe.nextInt();
        if (attempts == number) {
            System.out.println("You won!");
        } else if (attempts < number) {
            System.out.println("I whant more than ");
        } else {
            System.out.println("I whant less than ");
        }
        System.out.println(number);

        while (attempts != number) {
            if (attempts < number) {
                System.out.println("I whant more than ");
            } else {
                System.out.println("I whant less than ");
            }
            System.out.println("Try again!");
        }
        eingabe.close();
    }
}