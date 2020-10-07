package day16;

public class ReallyGreatLoops {
    public static void main(String[] args) {
        split();
        loopForI();
        split();
        whileLoop();
        split();
        doWhileLoop();
        split();
    }

    private static void split() {
        System.out.println("************");
    }

    private static void doWhileLoop() {
        int i = 10;
        do {
            System.out.println(i);
            i++;
        } while (i < 9);
    }

    private static void whileLoop() {
        int i = 19;
        while (i < 20) {
            System.out.println(i);
            i++;
        }
    }

    private static void loopForI() {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        for (int j = 20; j > 15; j--) {
            System.out.println(j);
        }
    }
}
