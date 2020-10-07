package day10;

public class ClassWork10 {
    public static void main(String[] args) {
        //multiplicationTable(6);
        System.out.println(cigarParty(30, false));// → false
        System.out.println(cigarParty(50, false));// → true
        System.out.println(cigarParty(70, true));// → true
        split();
        System.out.println(caughtSpeeding(60, false));// → 0
        System.out.println(caughtSpeeding(65, false));// → 1
        System.out.println(caughtSpeeding(65, true));// → 0
    }

    private static int caughtSpeeding(int speed, boolean birthday) {
        if (birthday) {
            speed = speed - 5;
        }

        if (speed <= 60) {
            return 0;
        } else if (speed > 60 && speed <= 80) {
            return 1;
        } else return 2;

    }

    private static void split() {
        System.out.println("-------------");
    }

    private static boolean cigarParty(int numberOfCigars, boolean weekend) {
        if (numberOfCigars >= 40 && numberOfCigars <= 60) {
            return true;
        } else if (weekend && numberOfCigars >= 40) {
            return true;
        } else return false;
    }

    private static void multiplicationTable(int number) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(number + "x" + i + "=" + number * i);
        }
    }
}
