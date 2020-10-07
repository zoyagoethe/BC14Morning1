package day11;

public class Exercises0506Ekaterina {
    public static void main(String[] args) {
        System.out.println(teaParty(6, 8)); // → 1
        System.out.println(teaParty(3, 8)); // → 0
        System.out.println(teaParty(20, 6)); //→ 2


        System.out.println(nearTen(12)); //→ true
        System.out.println(nearTen(17)); //→ false
        System.out.println(nearTen(19)); //→ true
    }

    private static int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) {
            return 0;
        }
        if (tea / candy >= 2 || candy / tea >= 2) {
            return 2;
        }
        return 1;
    }

    private static boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;

    }
}
