package day22;

public class Recursion01 {
    public static void main(String[] args) {
        System.out.println(bunnyEars2(0)); //→ 0
        System.out.println(bunnyEars2(1)); //→ 2
        System.out.println(bunnyEars2(2)); //→ 5
        System.out.println(bunnyEars2(10)); //→ 25
        System.out.println(bunnyEars2(11)); //→ 27

    }

    private static int bunnyEars2(int rabbit) {
        if (rabbit == 0) {
            return 0;
        } else if (rabbit == 1) {
            return 2;
        } else if (rabbit == 2) {
            return 5;
        } else {
            return 5 + bunnyEars2(rabbit - 2);
        }
    }
}
