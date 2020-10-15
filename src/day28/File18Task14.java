package day28;

/*Given an int array, return a new array with double the length where its last element is the same
as the original array, and all the other elements are 0. The original array will be length 1 or more.
Note: by default, a new int array contains all 0's.
        makeLast([4, 5, 6]) → [0, 0, 0, 0, 0, 6]
        makeLast([1, 2]) → [0, 0, 0, 2]
        makeLast([3]) → [0, 3]*/

import day20.FillAndPrintInArray;

public class File18Task14 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {4, 5, 6};
        int[] arr2 = new int[] {1, 2};
        int[] arr3 = new int[] {3};
        FillAndPrintInArray.myPrintIntArray(makeLast(arr1));// → [0, 0, 0, 0, 0, 6]
        FillAndPrintInArray.myPrintIntArray(makeLast(arr2));// → [0, 0, 0, 2]
        FillAndPrintInArray.myPrintIntArray(makeLast(arr3));// → [0, 3]
    }

    private static int[] makeLast(int[] arr) {
        int[] output = new int[arr.length * 2];
        /*for (int i = 0; i < output.length; i++) {
            output[i] = 0;
        }*/
        output[output.length - 1] = arr[arr.length -1];
        return output;
    }
}
