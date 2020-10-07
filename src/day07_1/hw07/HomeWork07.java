package day07_1.hw07;

public class HomeWork07 {
    public static void main(String[] args) {
        System.out.println(love6(6, 4));// true
        System.out.println(love6(4, 5));// false
        System.out.println(love6(1, 5));// true
    }

    private static boolean love6(int a, int b) {
        boolean result
                = (a == 6)
                || (b == 6)
                || (a + b == 6)
                || (Math.abs(a - b) == 6);

        return result;

    }
}
