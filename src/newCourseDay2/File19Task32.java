package newCourseDay2.lesson2;

/*Given a non-empty array of ints, return a new array containing the elements from the original array
that come before the first 4 in the original array.
The original array will contain at least one 4.
Note that it is valid in java to create an array of length 0.
        pre4([1, 2, 4, 1]) → [1, 2]
        pre4([3, 1, 4]) → [3, 1]
        pre4([1, 4, 4]) → [1]*/

import java.util.Arrays;

public class File19Task32 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(pre4(1, 2, 4, 1)));// → [1, 2]
        System.out.println(Arrays.toString(pre4(3, 1, 4)));// → [3, 1]
        System.out.println(Arrays.toString(pre4(1, 4, 4)));// → [1]
    }

    public static int[] pre4(int... args) {
        int size = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 4) {
                size = i;
                break;
            }
        }
        int[] output = new int[size];
        for (int i = 0; i < size; i++) {
            output[i] = args[i];
        }
        return output;
    }
}
