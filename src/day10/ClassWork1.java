package day10;

public class ClassWork1 {
    public static void main(String[] args) {
        System.out.println(more20(20)); //→ false
        System.out.println(more20(21)); //→ true
        System.out.println(more20(22)); //→ true
    }

    private static boolean more20(int number) {
        return (number % 20) == 1 || (number % 20) == 2;
    }
}

// Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
// See also: Introduction to Mod