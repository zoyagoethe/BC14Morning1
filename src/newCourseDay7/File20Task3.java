package newCourseDay7;
/*Given n>=0, create an array with the pattern {1, 1, 2, 1, 2, 3, ... 1, 2, 3 .. n}
(spaces added to show the grouping). Note that the length of the array will be 1 + 2 + 3 ... + n,
which is known to sum to exactly n*(n + 1)/2.
        seriesUp(3) → [1, 1, 2, 1, 2, 3]
        seriesUp(4) → [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        seriesUp(2) → [1, 1, 2]*/

import java.util.Arrays;

public class File20Task3 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(seriesUp(3))); //→ [1, 1, 2, 1, 2, 3]
        System.out.println(Arrays.toString(seriesUp(4))); //→ [1, 1, 2, 1, 2, 3, 1, 2, 3, 4]
        System.out.println(Arrays.toString(seriesUp(2))); //→ [1, 1, 2]
        System.out.println(Arrays.toString(seriesUp(0))); //→ []
        System.out.println(Arrays.toString(seriesUp(1))); //→ [1]
    }

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
