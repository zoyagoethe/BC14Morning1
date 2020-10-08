package day22;

public class Recursion02 {
    public static void main(String[] args) {
        System.out.println(count7(717)); //→ 2
        System.out.println(count7(7)); //→ 1
        System.out.println(count7(123)); //→ 0
        System.out.println(count7(570_7708)); //→ 3
    }

    private static int count7(int number) {
        if (number == 0) {
            return 0;
        } else if (number % 10 == 7) {
            return 1 + count7(number / 10);
        } else {
            return count7(number / 10);
        }
    }
}
