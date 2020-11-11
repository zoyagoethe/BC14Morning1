package newCourseDay7.hw07;

/*3. Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, .. 1, 2, 3 .. n}
(spaces added to show the grouping).
Note that the length of the array will be 1 + 2 + 3 .. + n, which is known to sum to exactly n*(n + 1)/2.
        seriesUp(3) → [1, 1, 2, 1, 2, 3]
        seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        seriesUp(2) → [1, 1, 2]

4. Return an array that contains exactly the same numbers as the given array,
but rearranged so that every 3 is immediately followed by a 4.
Do not move the 3's, but every other number may move.
The array contains the same number of 3's and 4's, every 3 has a number after it that is not a 3,
and a 3 appears in the array before any 4.
        fix34([1, 3, 1, 4]) → [1, 3, 4, 1]
        fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3, 4, 1, 1, 3, 4]
        fix34([3, 2, 2, 4]) → [3, 4, 2, 2]*/

import java.util.Arrays;

public class HomeWork07newCourse {
    public static void main(String[] args) {
        /*split();
        System.out.println(Arrays.toString(seriesUp(3)));// → [1, 1, 2, 1, 2, 3]
        System.out.println(Arrays.toString(seriesUp(4)));// → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        System.out.println(Arrays.toString(seriesUp(2)));// → [1, 1, 2]
        System.out.println(Arrays.toString(seriesUp(0)));// → []
        System.out.println(Arrays.toString(seriesUp(1)));// → [1]*/
        split();
        System.out.println(Arrays.toString(fix34(1, 3, 1, 4)));// → [1, 3, 4, 1]
        System.out.println(Arrays.toString(fix34(1, 3, 1, 4, 4, 3, 1))); //→ [1, 3, 4, 1, 1, 3, 4]
        System.out.println(Arrays.toString(fix34(3, 2, 2, 4)));// → [3, 4, 2, 2]
        System.out.println(Arrays.toString(fix34(3, 2, 3, 4, 4)));// → [3, 4, 3, 4, 2]
        System.out.println(Arrays.toString(fix34(3, 2, 3, 4, 3)));// → [3, 4, 3, 2, 3]
        split();
    }

    private static int[] fix34(int... args) {
        //int[] output = new int[args.length];
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 3) {
                int index = args[i];
                for (int j = index; j < args.length; j++) {
                    if (args[j] == 4) {
                        int temp = args[i + 1];
                        args[i + 1] = args[j];
                        args[j] = temp;
                    }
                }
                index++;
            }
        }
        return args;
    }


    private static void split() {
        System.out.println("----------");
    }
//сделали в классе, но всё равно не понятно
    private static int[] seriesUp(int n) {
        int[] output = new int[n * (n + 1) / 2];
        int index = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                output[index] = j + 1;
                index++;
            }
        }
        return output;
    }
}
