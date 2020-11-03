package newCourseDay2.lesson2;

/*Return an array that contains the exact same numbers as the given array,
but rearranged so that all the zeros are grouped at
the start of the array. The order of the non-zero numbers does not matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}.
You may modify and return the given array or make a new array.
        zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
        zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
        zeroFront([1, 0]) → [0, 1]*/

import java.util.Arrays;

public class File19Task33 {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 0, 0, 1};
        int[] arr2 = new int[]{0, 1, 1, 0, 1};
        int[] arr3 = new int[]{1, 0};
        System.out.println(Arrays.toString(zeroFront(arr1)));
        System.out.println(Arrays.toString(zeroFront(arr2)));
        System.out.println(Arrays.toString(zeroFront(arr3)));
    }

    private static int[] zeroFront(int[] arr) {
        int[] output = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                output[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                output[count] = arr[i];
                count++;
            }
        }
        return output;
    }
}
