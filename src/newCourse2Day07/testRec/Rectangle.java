package newCourse2Day07.testRec;

public class Rectangle {
    public static void main(String[] args) {
        drawRect(5, 10);
        split();
        drawRectHollow(10, 5);
    }

    private static void split() {
        System.out.println("----------");
    }

    private static void drawRectHollow(int a, int b) {
        for (int i = 0; i < a; i++) {
            System.out.print("o");
        }
        System.out.println();
        for (int i = 1; i < b - 1; i++) {

            System.out.print("o");
            for (int j = 1; j < a - 1; j++) {
                System.out.print(" ");
            }
            System.out.print("o");
            System.out.println();

        }
        for (int i = 0; i < a; i++) {
            System.out.print("o");
        }
    }

    private static void drawRect(int m, int n) {
        for (int a = 1; a <= m; a++) {
            for (int b = 2; b <= n; b++) {
                System.out.print("o");
            }
            System.out.println("o");
        }
    }
}
