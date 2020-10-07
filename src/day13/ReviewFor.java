package day13;

public class ReviewFor {
    public static void main(String[] args) {
        split();
        exampleOne();
        split();
        exampleTwo();
        split();
        exampleThree();
        split();
        exampleFor();
        split();
        exampleFive();
        split();
    }

    private static void split() {
        System.out.println("*****");
    }

    private static void exampleFive() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

/*        if (true) return 0;
        else return 10;*/
    }

    private static void exampleFor() {
        int i = 0;
        for (; i < 10; ) {
            System.out.println(i);
            i++;
        }

        for (int j = 0; j < 10; j++) {

        }
    }

    private static void exampleThree() {
        for (int i = 1; i < 100; i += 2) {
            System.out.println(i);
        }

        for (int i = 0; i < 10; i++) {

        }
    }

    private static void exampleTwo() {
        for (int i = 5; i >= 0; i = i - 1) {
            System.out.println(i);
        }
    }

    private static void exampleOne() {
        for (int i = 3; i <= 18; i++) {
            System.out.println(i);
        }
    }
}
