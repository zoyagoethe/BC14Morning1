package newCourseDay7;

/*
Consider the leftmost and rightmost appearances of some value in an array.
We'll say that the "span" is the number of elements between the two inclusive.
A single value has a span of 1. Returns the largest span found in the given array.
(Efficiency is not a priority.)
        maxSpan([1, 2, 1, 1, 3]) → 4
        maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
        maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
*/

public class File20Task1 {
    public static void main(String[] args) {
        System.out.println(maxSpan(1, 2, 1, 1, 3)); // → 4
        System.out.println(maxSpan(1, 4, 2, 1, 4, 1, 4)); // → 6
        System.out.println(maxSpan(1, 4, 2, 1, 4, 4, 4)); // → 6
        System.out.println(maxSpan(0, 1, 2, 3, 4, 5, 0)); // → 7
        System.out.println(maxSpan(0, 1, 2, 3, 4, 5, 6)); // → 1
    }

    private static int maxSpan(int... args) {
        int result = 0;
        for (int i = 0; i < args.length; i++) {
            int j = args.length - 1;
            while (args[i] != args[j]) {
                j--;
            }
            int span = j + 1 - i;
            if (span > result) {
                result = span;
            }
        }
        return result;
    }
}
