package day11;

public class Exercises6 {
    public static void main(String[] args) {
        //threeNumber();
        threeAngle(10);
    }

    private static void threeAngle(int lines) {
        String star = "*";
        String myLine = "";
        for (int i = 0; i < lines; i++) {
            myLine = myLine + star;
            System.out.println(myLine);
        }
    }

    private static void threeNumber() {
        int count = 1;
        for (int x = 1; x <= 36; x++) {
            for (int y = x; y <= 36; y++) {
                for (int z = y; z <= 36; z++) {
                    if (x * y * z == 36) {
                        System.out.println
                                (count + ".Вариант, где " + "x=" + x
                                        + ", y=" + y +
                                        ", z=" + z);
                        count++;
                    }
                }
            }
        }
    }
}
