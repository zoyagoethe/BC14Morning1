package newCourseDay11;

/*
(This is a slightly harder version of the fix34 problem.)
Return an array that contains exactly the same numbers as the given array,
but rearranged so that every 4 is immediately followed by a 5.
Do not move the 4's, but every other number may move.
The array contains the same number of 4's and 5's, and every 4 has a number after it that is not a 4.
In this version, 5's may appear anywhere in the original array.
        fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9]
        fix45([1, 4, 1, 5]) → [1, 4, 5, 1]
        fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
*/

import java.util.Arrays;

public class File20Task7 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(fix45(5, 4, 9, 4, 9, 5)));// → [9, 4, 5, 4, 5, 9]
        System.out.println(Arrays.toString(fix45(1, 4, 1, 5)));// → [1, 4, 5, 1]
        System.out.println(Arrays.toString(fix45(1, 4, 1, 5, 5, 4, 1)));// → [1, 4, 5, 1, 1, 4, 5]
    }

    private static int[] fix45(int... args) {
        int index = 0;
        for (int i = 0; i < args.length; i++) {
            if (args[i] == 4) {
                for (int j = index; j < args.length; j++) {
                    if (args[j] == 5) {
                        int temp = args[i + 1];
                        args[i + 1] = args[j];
                        args[j] = temp;
                        //index = (i + 1 > j ? i + 2 : j);
                        if (i + 1 > j) {
                            index = i + 2;
                        } else index = j;
                        break;
                    }
                }
            }
        }
        return args;
    }
}
