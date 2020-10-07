package day11;

public class Exercise6Nastia {
    public static void main(String[] args) {
        //        System.out.println(maxMod5(2, 3)); //→ 3
//        System.out.println(maxMod5(6, 2)); //→ 6
//        System.out.println(maxMod5(3, 2)); //→ 3

//        System.out.println(blueTicket(9, 1, 0));// → 10
//        System.out.println(blueTicket(9, 2, 0)); //→ 0
//        System.out.println(blueTicket(6, 1, 4)); //→ 10

        System.out.println(dateFashion(5, 10)); //→ 2
        System.out.println(dateFashion(5, 2)); //→ 0
        System.out.println(dateFashion(5, 5)); //→ 1
    }

    private static int dateFashion(int you, int date) {
        if (you <= 2 || date <= 2) {
            return 0;
        } else if (you >= 8 || date >= 8) {
            return 2;
        }
        return 1;
    }

    private static int blueTicket(int a, int b, int c) {
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;
        if (ab == 10 || bc == 10 || ac == 10) {
            return 10;
        } else if (ab - bc == 10 || ab - ac == 10) {
            return 5;
        } else {
            return 0;
        }
    }

    private static int maxMod5(int a, int b) {
        if (a == b) {
            return 0;
        } else if (a % 5 == 0 && b % 5 == 0) {
            return Math.min(a, b);
        } else {
            return Math.max(a, b);
        }
    }
}
