package newCourseDay11;

/*
Given n>=0, create an array length n*n with the following pattern,
shown here for n=3 : {0, 0, 1, 0, 2, 1, 3, 2, 1} (spaces added to show the 3 groups).
        squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1]
        squareUp(2) → [0, 1, 2, 1]
        squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
*/

import java.util.Arrays;

public class File20Task8 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(squareUp(3)));// → [0, 0, 1, 0, 2, 1, 3, 2, 1]
        System.out.println(Arrays.toString(squareUp(2)));// → [0, 1, 2, 1]
        System.out.println(Arrays.toString(squareUp(4)));// → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
    }

    private static int[] squareUp(int n) {
        int[] output = new int[n * n];
        if (n == 0) return output;

        for (int i = n - 1; i < output.length; i += n) {
            for (int j = i; j >= i - i / n; j--) {
                output[j] = i - j + 1;
            }
        }

        return output;
    }
}
