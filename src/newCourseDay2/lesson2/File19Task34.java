package newCourseDay2.lesson2;

/*Return an array that contains the exact same numbers as the given array,
but rearranged so that all the even numbers come before all the odd numbers.
Other than that, the numbers can be in any order. You may modify and return the given array, or make a new array.
        evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]
        evenOdd([3, 3, 2]) → [2, 3, 3]
        evenOdd([2, 2, 2]) → [2, 2, 2]*/

import java.util.Arrays;

public class File19Task34 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1, 0, 1, 0, 0, 1, 1};
        int[] arr2 = new int[] {3, 3, 2};
        int[] arr3 = new int[] {2, 2, 2};

        System.out.println(Arrays.toString(evenOdd(arr1)));
        System.out.println(Arrays.toString(evenOdd(arr2)));
        System.out.println(Arrays.toString(evenOdd(arr3)));
    }

    private static int[] evenOdd(int[] arr) {
        int[] output = new int[arr.length];
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0){
                output[count] = arr[i];
                count++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                output[count] = arr[i];
                count++;
            }
        }
        return output;
    }
}
