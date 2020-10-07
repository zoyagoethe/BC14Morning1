package day16;

public class MultiplicationTableWhile {
    public static void main(String[] args) {
        createMT(10);
    }

    private static void createMT(int number) {
        int i = 1;
        while (i <= number) {
            int j = 1;
            while (j <= number) {
                System.out.printf("%4d", i * j);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
