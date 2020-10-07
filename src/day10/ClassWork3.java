package day10;

public class ClassWork3 {
    public static void main(String[] args) {
        issueFor();
        // 0 до 100, делятся на 6 без остатка
        findVeryGreatNumber(0, 100);
        //findVeryGreatNumber(35, 70);
    }

    private static void findVeryGreatNumber(int a, int b) {
        int greatNumber = 13;
        for (int i = a; i < b; i++) {
            if (i % greatNumber == 0) {
                System.out.print(i + " ");
            }
        }
    }

    private static void issueFor() {

    }
}
