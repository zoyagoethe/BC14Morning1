package day09;

import static day06.ClassWork2.split;

public class Exercises5 {
    public static void main(String[] args) {
        happyPelmen();
        split();
        moduloThree();
        split();
        myLine(100); // 7 14 21 28 35 42 49 56 63 70 77 84 91 98
        split();
        mySecondLine(1000); // 1 2 4 8 16 32 64 128 256 512
        split();

    }

    private static void mySecondLine(int a) { // ne rabotaet
        for (int i = 0; i < a; i *= 2) {
            System.out.print(" " + i);

        }
    }

    private static void myLine(int number) {
        for (int j = 7; j < 100; j += 7) {
            System.out.print(" " + j);


        }
    }

    private static void moduloThree() {
        for (int i = 0; i < 100; i++) {
            if (i % 3 == 0) {
                System.out.print(" " + i);
            }

        }
    }

    private static void happyPelmen() {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("happy pelmen caught");
                break;
            }
            System.out.println("shag cikla " + i);
        }
    }
}
